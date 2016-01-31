package com.arielandchris.expediahackathon;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.arielandchris.expediahackathon.model.Airport;
import com.arielandchris.expediahackathon.model.UnrealDeals;
import com.arielandchris.expediahackathon.model.t2d.Activity;
import com.github.brnunes.swipeablerecyclerview.SwipeableRecyclerViewTouchListener;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by ariel on 1/30/16.
 */
public class TinderDestinationSelectorActivity extends AppCompatActivity implements ApiWrapper.CallbackS {

    @Bind(R.id.rv)
    RecyclerView recyclerView;

    @Bind(R.id.rl_footer)
    RelativeLayout footer;
    @Bind(R.id.txt_loading1)
    TextView loadingTxt;
    @Bind(R.id.pb_loading_packages)
    ProgressBar loadingPB;
    @Bind(R.id.btn_packages)
    Button packagesBtn;

    List<Airport> cards;
    CardViewAdapter cardViewAdapter;

    List<Airport> selectedAirports;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tinder_destination_activity);
        ButterKnife.bind(this);
        footer.setVisibility(View.INVISIBLE);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        cards = ApiWrapper.getAirportsByDist(this, getIntent().getStringExtra("airportCode"));
        cards.remove(0);
        selectedAirports = new ArrayList<>();

        cardViewAdapter = new CardViewAdapter(cards);
        recyclerView.setAdapter(cardViewAdapter);
        SwipeableRecyclerViewTouchListener swipeTouchListener =
                new SwipeableRecyclerViewTouchListener(recyclerView,
                        new SwipeableRecyclerViewTouchListener.SwipeListener() {
                            @Override
                            public boolean canSwipe(int position) {
                                return true;
                            }

                            @Override
                            public void onDismissedBySwipeLeft(RecyclerView recyclerView, int[] reverseSortedPositions) {
                                for (int position : reverseSortedPositions) {
//                                    Toast.makeText(MainActivity.this, mItems.get(position) + " swiped left", Toast.LENGTH_SHORT).show();
                                    cards.remove(position);
                                    cardViewAdapter.notifyItemRemoved(position);
                                }
                                cardViewAdapter.notifyDataSetChanged();
                            }

                            @Override
                            public void onDismissedBySwipeRight(RecyclerView recyclerView, int[] reverseSortedPositions) {
                                for (int position : reverseSortedPositions) {
                                    Airport pickedAirport = cards.remove(position);
                                    selectedAirports.add(pickedAirport);
                                    cardViewAdapter.notifyItemRemoved(position);
                                    ApiWrapper.getInstance(getResources().getString(R.string.ExpediaKey)).unrealDeals("SEA",
                                            pickedAirport.getCode(), getIntent().getStringExtra("departureDate"), getIntent().getStringExtra("returnDate"),
                                            getIntent().getStringExtra("lenStay"), TinderDestinationSelectorActivity.this);
                                }
                                cardViewAdapter.notifyDataSetChanged();
                                footer.setVisibility(View.VISIBLE);
                                loadingTxt.setVisibility(View.VISIBLE);
                                loadingPB.setVisibility(View.VISIBLE);
                                packagesBtn.setVisibility(View.GONE);
                                //Start making requests for packages
                            }
                        });
        recyclerView.addOnItemTouchListener(swipeTouchListener);
    }

    private void finishedLoading() {
        loadingTxt.setVisibility(View.GONE);
        loadingPB.setVisibility(View.GONE);
        packagesBtn.setVisibility(View.VISIBLE);
    }

    @OnClick(R.id.btn_packages)
    void packagesBtn() {
        startActivity(new Intent(this, UnrealDealsActivity.class));
    }

    @Override
    public void finished() {
        finishedLoading();
    }

    class CardViewAdapter extends RecyclerView.Adapter<CardViewAdapter.ViewHolder> {

        List<Airport> cards;

        public CardViewAdapter(List<Airport> cards) {
            this.cards = cards;
        }

        @Override
        public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
            View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.destination_card_view, viewGroup, false);
            return new ViewHolder(v);
        }

        @Override
        public void onBindViewHolder(ViewHolder viewHolder, int position) {
            Airport airport = cards.get(position);
            viewHolder.title.setText(airport.getCityName());
            viewHolder.miles.setText((int)airport.getOrigDist() + "mi");
        }

        @Override
        public int getItemCount() {
            return cards == null ? 0 : cards.size();
        }

        class ViewHolder extends RecyclerView.ViewHolder {

            @Bind(R.id.card_view_title)
            TextView title;
            @Bind(R.id.txt_miles)
            TextView miles;

            public ViewHolder(View itemView) {
                super(itemView);
                ButterKnife.bind(this, itemView);
            }
        }
    }
}
