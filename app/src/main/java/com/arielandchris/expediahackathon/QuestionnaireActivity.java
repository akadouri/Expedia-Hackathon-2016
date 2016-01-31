package com.arielandchris.expediahackathon;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.DatePicker;

import java.util.Calendar;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by ariel on 1/29/16.
 */
public class QuestionnaireActivity extends AppCompatActivity implements DatePickerDialog.OnDateSetListener{

    /* @Bind(R.id.cb_car)
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
     CheckBox flightFarCB;*/
    @Bind(R.id.btn_departure_date)
    Button departureDateBtn;
    @Bind(R.id.btn_return_date)
    Button returnDateBtn;

    @Bind(R.id.btn_submit)
    Button submit;

    boolean departure;
    String departureDate;
    String returnDate;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.questionnaire_activity);
        ButterKnife.bind(this);
        //Set state of view visibility at start
        //rentCarLayout.setVisibility(View.GONE);
        //driveDistanceLayout.setVisibility(View.GONE);
        //flightDistanceLayout.setVisibility(View.GONE);
    }

    @OnClick(R.id.btn_departure_date)
    void selectDepartureDate() {
        DialogFragment newFragment = new DatePickerFragment();
        departure = true;
        newFragment.show(getSupportFragmentManager(), "datePicker");
    }

    @OnClick(R.id.btn_return_date)
    void selectReturnDate() {
        DialogFragment newFragment = new DatePickerFragment();
        departure = false;
        newFragment.show(getSupportFragmentManager(), "datePicker");
    }

   /* @OnCheckedChanged(R.id.cb_car)
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
    }*/

    @OnClick(R.id.btn_submit)
    void submit() {
        Intent intent = new Intent(this, TinderDestinationSelectorActivity.class);
        intent.putExtra("airportCode", getIntent().getStringExtra("airportCode"));
        intent.putExtra("departureDate", departureDate);
        intent.putExtra("returnDate", returnDate);
        intent.putExtra("lenStay", "5");
        startActivity(intent);
    }

    @Override
    public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
        if(departure) {
            departureDate = year + "-" + monthOfYear + "-" + dayOfMonth;
            departureDateBtn.setText(departureDate);
        } else {
            returnDate = year + "-" + monthOfYear + "-" + dayOfMonth;
            returnDateBtn.setText(returnDate);
        }
    }

    public static class DatePickerFragment extends DialogFragment {

        @Override
        public Dialog onCreateDialog(Bundle savedInstanceState) {
            // Use the current date as the default date in the picker
            final Calendar c = Calendar.getInstance();
            int year = c.get(Calendar.YEAR);
            int month = c.get(Calendar.MONTH);
            int day = c.get(Calendar.DAY_OF_MONTH);

            // Create a new instance of DatePickerDialog and return it
            return new DatePickerDialog(getActivity(), (QuestionnaireActivity)getActivity(), year, month, day);
        }
    }
}
