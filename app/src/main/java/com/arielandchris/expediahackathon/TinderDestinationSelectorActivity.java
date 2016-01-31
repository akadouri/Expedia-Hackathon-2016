package com.arielandchris.expediahackathon;

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
import com.github.brnunes.swipeablerecyclerview.SwipeableRecyclerViewTouchListener;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by ariel on 1/30/16.
 */
public class TinderDestinationSelectorActivity extends AppCompatActivity {

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
//                                    Toast.makeText(MainActivity.this, mItems.get(position) + " swiped right", Toast.LENGTH_SHORT).show();
                                    selectedAirports.add(cards.remove(position));
                                    cardViewAdapter.notifyItemRemoved(position);
                                }
                                cardViewAdapter.notifyDataSetChanged();
                                footer.setVisibility(View.VISIBLE);
                                //Start making requests for packages
                            }
                        });
        recyclerView.addOnItemTouchListener(swipeTouchListener);
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
            viewHolder.title.setText(airport.getAirportName() + " " + (int)airport.getOrigDist() + "mi");
        }

        @Override
        public int getItemCount() {
            return cards == null ? 0 : cards.size();
        }

        class ViewHolder extends RecyclerView.ViewHolder {
            @Bind(R.id.card_view_title)
            TextView title;

            public ViewHolder(View itemView) {
                super(itemView);
                ButterKnife.bind(this, itemView);
            }
        }
    }
}
