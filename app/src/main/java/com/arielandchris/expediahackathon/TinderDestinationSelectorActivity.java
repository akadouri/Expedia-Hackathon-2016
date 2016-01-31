package com.arielandchris.expediahackathon;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

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

    List<String> cards;
    CardViewAdapter cardViewAdapter;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tinder_destination_activity);
        ButterKnife.bind(this);
        footer.setVisibility(View.INVISIBLE);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        cards = new ArrayList<>();
        cards.add("Italy");
        cards.add("Japan");
        cards.add("Mount Dew");
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
                                    cards.remove(position);
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

        List<String> cards;

        public CardViewAdapter(List<String> cards) {
            this.cards = cards;
        }

        @Override
        public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
            View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.destination_card_view, viewGroup, false);
            return new ViewHolder(v);
        }

        @Override
        public void onBindViewHolder(ViewHolder viewHolder, int position) {
            viewHolder.title.setText(cards.get(position));
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
