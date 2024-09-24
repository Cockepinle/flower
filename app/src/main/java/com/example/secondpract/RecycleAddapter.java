package com.example.secondpract;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecycleAddapter extends RecyclerView.Adapter<RecycleAddapter.ViewHolder> {

    private final LayoutInflater inflater;
    private final List<Flowers> states;
    private final Context context;

    RecycleAddapter(Context context, List<Flowers> states){
        this.states=states;
        this.inflater= LayoutInflater.from(context);
        this.context = context;
    }
    @Override
    public RecycleAddapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType){
        View view = inflater.inflate(R.layout.list_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Flowers state = states.get(position);
        holder.flowerView.setImageResource(state.getCount());
        holder.colorView.setText(state.getColor());
        holder.nameView.setText(state.getName());
        holder.itemView.setOnClickListener(v -> {
            Intent intent = new Intent(v.getContext(), CordFlowers.class);
            intent.putExtra("flower_name", state.getName());
            intent.putExtra("flower_color", state.getColor());
            intent.putExtra("flower_image", state.getCount());
            intent.putExtra("flower_counts", state.getCounts()); // Обновленная строка
            v.getContext().startActivity(intent);
        });
    }


    @Override
    public int getItemCount() {return states.size();}

    public static class ViewHolder extends RecyclerView.ViewHolder {
        final ImageView flowerView;
        final TextView colorView, nameView, countsView;
        ViewHolder(View view){
            super(view);
            flowerView = view.findViewById(R.id.flower);
            colorView = view.findViewById(R.id.color);
            nameView = view.findViewById(R.id.name);
            countsView = view.findViewById(R.id.detailColorTextView);
        }
    }
}
