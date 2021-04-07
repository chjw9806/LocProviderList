package com.example.locproviderlist;

import androidx.appcompat.app.AppCompatActivity;

import android.location.LocationManager;
import android.os.Bundle;
import android.widget.TextView;

import java.util.List;

public class LocProviderListActivity extends AppCompatActivity {
    TextView mtextView;
    LocationManager locMgr;
    List<String> locProviders;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mtextView = findViewById(R.id.txtOutput);
        locMgr = (LocationManager) getSystemService(LOCATION_SERVICE); // new LocationManager() 만드는거
        locProviders = locMgr.getAllProviders();

        String s ="";
        for(int i = 0; i < locProviders.size(); i++){
            s += "Loc. Provider: " + locProviders.get(i) + "\n"
                    + "Status: " + locMgr.isProviderEnabled(locProviders.get(i)) + "\n\n";

        }
        mtextView.setText(s);

    }
}