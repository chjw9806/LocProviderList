package com.example.locproviderlist;

import androidx.appcompat.app.AppCompatActivity;

import android.location.Location;
import android.location.LocationManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.List;

public class LocProviderListActivity extends AppCompatActivity {
    TextView mtextView;
    LocationManager locMgr;
    List<String> locProviders;

    Button mbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mtextView = findViewById(R.id.txtOutput);
        mbutton = findViewById(R.id.button);

        mbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                locMgr = (LocationManager) getSystemService(LOCATION_SERVICE); // new LocationManager() 만드는거
                locProviders = locMgr.getAllProviders();
                //String s = "";

                for (String location: locProviders){
                    mtextView.append("Loc. Provider: " + locProviders.size() + "\n");
                    mtextView.append("Status: " + locMgr.isProviderEnabled(String.valueOf(location)) + "\n\n");
                }
/*
                for (int i = 0; i < locProviders.size(); i++) {
                    s += "Loc. Provider: " + locProviders.get(i) + "\n"
                            + "Status: " + locMgr.isProviderEnabled(locProviders.get(i)) + "\n\n";

                    mtextView.setText(s);
                }*/
            }
        });
}
}