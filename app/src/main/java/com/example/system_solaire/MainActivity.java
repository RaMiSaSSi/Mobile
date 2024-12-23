package com.example.system_solaire;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        List<Planet> planetList = new ArrayList<>();
        planetList.add(new Planet("Mercury", R.drawable.mercery, "57.9 million km", "3.30 x 10^23 kg", "88 days", 0));
        planetList.add(new Planet("Venus", R.drawable.venus, "108.2 million km", "4.87 x 10^24 kg", "225 days", 0));
        planetList.add(new Planet("Earth", R.drawable.earth, "149.6 million km", "5.97 x 10^24 kg", "365 days", 1));
        planetList.add(new Planet("Mars", R.drawable.mars, "227.9 million km", "0.642 x 10^24 kg", "687 days", 2));
        planetList.add(new Planet("Jupiter", R.drawable.jupiter, "778.3 million km", "1.90 x 10^27 kg", "4333 days", 79));
        planetList.add(new Planet("Saturn", R.drawable.saturn, "1.43 billion km", "5.68 x 10^26 kg", "10759 days", 82));
        planetList.add(new Planet("Uranus", R.drawable.uranus, "2.87 billion km", "8.68 x 10^25 kg", "30687 days", 27));
        planetList.add(new Planet("Neptune", R.drawable.neptune, "4.50 billion km", "1.02 x 10^26 kg", "60190 days", 14));

        PlanetAdapter adapter = new PlanetAdapter(planetList, this);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }
}
