package com.example.system_solaire;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class PlanetAdapter extends RecyclerView.Adapter<PlanetAdapter.PlanetViewHolder> {

    private List<Planet> planetList;
    private Context context;

    public PlanetAdapter(List<Planet> planetList, Context context) {
        this.planetList = planetList;
        this.context = context;
    }

    @NonNull
    @Override
    public PlanetViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_planet, parent, false);
        return new PlanetViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PlanetViewHolder holder, int position) {
        Planet planet = planetList.get(position);
        holder.namePlanet.setText(planet.getName());
        holder.distancePlanet.setText(planet.getDistanceFromSun());
        holder.imagePlanet.setImageResource(planet.getImageResId());

        holder.itemView.setOnClickListener(v -> {
            Intent intent = new Intent(context, DetailActivity.class);
            intent.putExtra("planet", planet);
            context.startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return planetList.size();
    }

    public static class PlanetViewHolder extends RecyclerView.ViewHolder {
        ImageView imagePlanet;
        TextView namePlanet, distancePlanet;
        public PlanetViewHolder(@NonNull View itemView) {
            super(itemView);
            imagePlanet = itemView.findViewById(R.id.imagePlanet);
            namePlanet = itemView.findViewById(R.id.namePlanet);
            distancePlanet = itemView.findViewById(R.id.distancePlanet);
        }
    }
}

