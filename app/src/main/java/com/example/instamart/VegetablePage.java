package com.example.instamart;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class VegetablePage extends AppCompatActivity {

    private Cart cart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vegetable_page);

        cart = Cart.getInstance();

        Button buttonAddToCart1 = findViewById(R.id.buttonAddToCart1);
        Button buttonAddToCart2 = findViewById(R.id.buttonAddToCart2);
        Button buttonAddToCart3 = findViewById(R.id.buttonAddToCart3);
        Button buttonAddToCart4 = findViewById(R.id.buttonAddToCart4);

        buttonAddToCart1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cart.addItem("Potato");
                Toast.makeText(VegetablePage.this, "Potato added to cart", Toast.LENGTH_SHORT).show();
            }
        });

        buttonAddToCart2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cart.addItem("Onion");
                Toast.makeText(VegetablePage.this, "Onion added to cart", Toast.LENGTH_SHORT).show();
            }
        });

        buttonAddToCart3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cart.addItem("Tomato");
                Toast.makeText(VegetablePage.this, "Tomato added to cart", Toast.LENGTH_SHORT).show();
            }
        });

        buttonAddToCart4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cart.addItem("Green Chilli");
                Toast.makeText(VegetablePage.this, "Green Chilli added to cart", Toast.LENGTH_SHORT).show();
            }
        });
    }
}