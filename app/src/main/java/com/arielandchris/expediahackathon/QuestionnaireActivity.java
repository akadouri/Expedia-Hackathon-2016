package com.arielandchris.expediahackathon;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.RadioButton;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnCheckedChanged;

/**
 * Created by ariel on 1/29/16.
 */
public class QuestionnaireActivity extends AppCompatActivity {

    @Bind(R.id.cb_car)
    CheckBox wantsToDriveCB;
    @Bind(R.id.cb_flight)
    CheckBox wantsToFlyCB;

    @Bind(R.id.ll_rent_car)
    LinearLayout rentCarLayout;
    @Bind(R.id.rb_rental_no)
    RadioButton wantsRentalCB;

    @Bind(R.id.ll_drive_distance)
    LinearLayout driveDistanceLayout;
    @Bind(R.id.cb_car_nearby)
    CheckBox carNearbyCB;
    @Bind(R.id.cb_car_far)
    CheckBox carFarCB;

    @Bind(R.id.ll_flight_distance)
    LinearLayout flightDistanceLayout;
    @Bind(R.id.cb_flight_near)
    CheckBox flightNearCB;
    @Bind(R.id.cb_flight_far)
    CheckBox flightFarCB;

    @Bind(R.id.btn_submit)
    Button submit;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.questionnaire_activity);
        ButterKnife.bind(this);
        //Set state of view visibility at start
        rentCarLayout.setVisibility(View.GONE);
        driveDistanceLayout.setVisibility(View.GONE);
        flightDistanceLayout.setVisibility(View.GONE);
    }

    @OnCheckedChanged(R.id.cb_car)
    void carCBChecked(boolean checked) {
        if(checked) {
            rentCarLayout.setVisibility(View.VISIBLE);
            driveDistanceLayout.setVisibility(View.VISIBLE);
        }else {
            rentCarLayout.setVisibility(View.GONE);
            driveDistanceLayout.setVisibility(View.GONE);
        }
    }

    @OnCheckedChanged(R.id.cb_flight)
    void onCBFlight(boolean checked) {
        if(checked) {
            flightDistanceLayout.setVisibility(View.VISIBLE);
        }else {
            flightDistanceLayout.setVisibility(View.GONE);
        }
    }
}
