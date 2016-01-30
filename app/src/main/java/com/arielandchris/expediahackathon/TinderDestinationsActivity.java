package com.arielandchris.expediahackathon;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.LinearLayout;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by ariel on 1/30/16.
 */
public class TinderDestinationsActivity extends AppCompatActivity {

    @Bind(R.id.ll_loading)
    LinearLayout loadingLayout;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tinder_destinations_activity);
        ButterKnife.bind(this);

        //start network call
    }
}
