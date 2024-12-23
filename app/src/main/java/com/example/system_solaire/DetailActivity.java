package com.example.system_solaire;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        ImageView detailImage = findViewById(R.id.detailImage);
        TextView detailName = findViewById(R.id.detailName);
        TextView detailMass = findViewById(R.id.detailMass);
        TextView detailRevolution = findViewById(R.id.detailRevolution);
        TextView detailSatellites = findViewById(R.id.detailSatellites);

        Planet planet = (Planet) getIntent().getSerializableExtra("planet");
        if (planet != null) {
            detailImage.setImageResource(planet.getImageResId());
            detailName.setText(planet.getName());
            detailMass.setText("Mass: " + planet.getMass());
            detailRevolution.setText("Revolution Period: " + planet.getRevolutionPeriod());
            detailSatellites.setText("Number of Satellites: " + planet.getSatellites());
        }
    }
}

