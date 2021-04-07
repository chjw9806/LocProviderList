package com.example.locproviderlist;

import androidx.appcompat.app.AppCompatActivity;

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

    Button button;
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

            button.setOnClickListener(new OnClickListener());
        mtextView.setText(s);

    }
}

    private class OnClickListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {

        }
    }