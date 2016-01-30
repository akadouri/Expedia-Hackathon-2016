package com.arielandchris.expediahackathon;

import android.Manifest;
import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationManager;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import com.arielandchris.expediahackathon.model.GeoSearch;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by ariel on 1/30/16.
 */
public class TinderDestinationsActivity extends AppCompatActivity {

    @Bind(R.id.ll_loading)
    LinearLayout loadingLayout;

    @Bind(R.id.lv)
    ListView desinationsList;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tinder_destinations_activity);
        ButterKnife.bind(this);

        //start network call
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.
            return;
        }
        LocationManager lm = (LocationManager) getSystemService(Context.LOCATION_SERVICE);
        Location location = lm.getLastKnownLocation(LocationManager.GPS_PROVIDER);
        double longitude = location.getLongitude();
        double latitude = location.getLatitude();
        if (longitude == 0.0 || latitude == 0.0) {
            longitude = 47.669923;
            latitude = -122.312249;
        }
        ApiWrapper wrapper = new ApiWrapper(getResources().getString(R.string.ExpediaKey));
        wrapper.geoSearch("50km", "" + latitude, "" + longitude, "airport", new Callback<List<GeoSearch>>() {
            @Override
            public void onResponse(Response<List<GeoSearch>> response) {
                // Get result Repo from response.body()
                desinationsList.setAdapter(new PositionAdapter(TinderDestinationsActivity.this,
                        R.layout.position_row, response.body()));
                loadingLayout.setVisibility(View.GONE);
                desinationsList.setVisibility(View.VISIBLE);
            }

            @Override
            public void onFailure(Throwable t) {

            }
        });
    }

    class PositionAdapter extends ArrayAdapter<GeoSearch> {

        Context context;
        int resource;
        List<GeoSearch> objects;

        public PositionAdapter(Context context, int resource, List<GeoSearch> objects) {
            super(context, resource, objects);
            this.context = context;
            this.resource = resource;
            this.objects = objects;
        }

        public View getView(int position, View convertView, ViewGroup parent) {
            ViewHolder viewHolder;

            if (convertView != null) {
                viewHolder = (ViewHolder) convertView.getTag();
            } else {
                convertView = ((Activity) context).getLayoutInflater().inflate(resource, parent, false);
                viewHolder = new ViewHolder(convertView);
                convertView.setTag(viewHolder);
            }
            viewHolder.name.setText(objects.get(position).getName());
            return convertView;
        }
    }

    static class ViewHolder {
        @Bind(R.id.txt_name)
        TextView name;

        public ViewHolder(View view) {
            ButterKnife.bind(this, view);
        }
    }
}
