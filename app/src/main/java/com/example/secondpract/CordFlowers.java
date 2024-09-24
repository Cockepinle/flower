package com.example.secondpract;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class CordFlowers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.items_card); // Set the correct layout file

        ImageView imageView = findViewById(R.id.detailImageView);
        TextView nameView = findViewById(R.id.detailNameTextView);
        TextView colorView = findViewById(R.id.detailColorTextView);

        String flowerName = getIntent().getStringExtra("flower_name");
        int flowerImage = getIntent().getIntExtra("flower_image", 0); // Default value if not found
        String flowerCounts = getIntent().getStringExtra("flower_counts");


        imageView.setImageResource(flowerImage);
        nameView.setText(flowerName);
        colorView.setText(flowerCounts);
    }
}
