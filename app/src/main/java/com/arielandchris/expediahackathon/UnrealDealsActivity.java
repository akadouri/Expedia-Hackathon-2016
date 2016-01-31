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
import android.widget.TextView;

import com.arielandchris.expediahackathon.model.Deals;
import com.arielandchris.expediahackathon.model.Package;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

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
        List<Deals> unrealDealses = ApiWrapper.getInstance(getResources().getString(R.string.ExpediaKey)).unrealDealses;
        List<Package> deals = new ArrayList<>();
        for(int i = 0; i < unrealDealses.size(); i++) {
            if(unrealDealses.get(i).getPackages().size() > 0) {
                Package pack = unrealDealses.get(i).getPackages().get(0);
                Package pack2 = new Package();
                pack2.setOriginTLA(pack.getOriginTLA());
                pack2.setDestinationTLA(pack.getDestinationTLA());
                deals.add(pack2);
                deals.addAll(unrealDealses.get(i).getPackages());
            }
        }
        Log.d("Unreal", "packages size " + deals.size());
        adapter = new CardViewAdapter(deals);
        recyclerView.setAdapter(adapter);
    }

    @OnClick(R.id.btn_browse_activies)
    void browseActiviesClicked() {
        startActivity(new Intent(this, ActivitySelectionActivity.class));
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
            Package aPackage = cards.get(position);
            viewHolder.title.setTextSize(25);
            //here
            if(aPackage.getTotalPackagePrice() == null){
                viewHolder.title.setText(aPackage.getOriginTLA() + " to " + aPackage.getDestinationTLA());
                viewHolder.title.setTextSize(40);
                viewHolder.miles.setText("");
            } else {
                viewHolder.title.setText("Option " + position);
                viewHolder.miles.setText("$"+aPackage.getTotalPackagePrice() + "\n" + "Savings: " + aPackage.getTotalPackageSavingsPct());
            }
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
