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
import android.widget.TextView;

import com.arielandchris.expediahackathon.model.Package;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by ariel on 1/30/16.
 */
public class UnrealDealsActivity extends AppCompatActivity {

    @Bind(R.id.rv)
    RecyclerView recyclerView;

    CardViewAdapter adapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.unreal_deals_activity);
        ButterKnife.bind(this);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        List<Package> deals = ApiWrapper.getInstance(getResources().getString(R.string.ExpediaKey)).unrealDealses.get(0).getPackageDeal();
        Log.d("Unreal", "deals size " + ApiWrapper.getInstance(getResources().getString(R.string.ExpediaKey)).unrealDealses.size());
        adapter = new CardViewAdapter(deals);
        recyclerView.setAdapter(adapter);
    }

    class CardViewAdapter extends RecyclerView.Adapter<CardViewAdapter.ViewHolder> {

        List<Package> cards;

        public CardViewAdapter(List<Package> cards) {
            this.cards = cards;
        }

        @Override
        public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
            View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.destination_card_view, viewGroup, false);
            return new ViewHolder(v);
        }

        @Override
        public void onBindViewHolder(ViewHolder viewHolder, int position) {
            Package airport = cards.get(position);
            viewHolder.title.setText(airport.getCheckInDate());
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
