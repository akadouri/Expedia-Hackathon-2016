package com.arielandchris.expediahackathon;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by ariel on 1/29/16.
 */
public class TripSelectionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.trip_selction_activity);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btn_new_trip)
    public void newTripClicked() {

    }

    @OnClick(R.id.btn_join_trip)
    public void joinTripClicked() {

    }
}
