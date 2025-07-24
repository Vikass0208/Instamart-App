package com.example.instamart;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class KitchenPage extends AppCompatActivity {

    private Cart cart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kitchen_page);

        cart = Cart.getInstance();

        Button buttonAddToCart1 = findViewById(R.id.buttonAddToCart1);
        Button buttonAddToCart2 = findViewById(R.id.buttonAddToCart2);
        Button buttonAddToCart3 = findViewById(R.id.buttonAddToCart3);

        buttonAddToCart1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cart.addItem("Sandwich Maker");
                Toast.makeText(KitchenPage.this, "Sandwich Maker added to cart", Toast.LENGTH_SHORT).show();
            }
        });

        buttonAddToCart2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cart.addItem("Electric Kettle");
                Toast.makeText(KitchenPage.this, "Electric Kettle added to cart", Toast.LENGTH_SHORT).show();
            }
        });

        buttonAddToCart3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cart.addItem("Cooker");
                Toast.makeText(KitchenPage.this, "Cooker added to cart", Toast.LENGTH_SHORT).show();
            }
        });

    }
}