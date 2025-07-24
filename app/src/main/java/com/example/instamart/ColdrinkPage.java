package com.example.instamart;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class ColdrinkPage extends AppCompatActivity {

    private Cart cart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coldrink_page);

        cart = Cart.getInstance();

        // Initialize buttons
        Button buttonAddToCart1 = findViewById(R.id.buttonAddToCart1);
        Button buttonAddToCart2 = findViewById(R.id.buttonAddToCart2);
        Button buttonAddToCart3 = findViewById(R.id.buttonAddToCart3);

        buttonAddToCart1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cart.addItem("Coca Cola");
                Toast.makeText(ColdrinkPage.this, "Coca Cola added to cart", Toast.LENGTH_SHORT).show();
            }
        });

        buttonAddToCart2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cart.addItem("Pepsi");
                Toast.makeText(ColdrinkPage.this, "Pepsi added to cart", Toast.LENGTH_SHORT).show();
            }
        });

        buttonAddToCart3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cart.addItem("Fanta");
                Toast.makeText(ColdrinkPage.this, "Fanta added to cart", Toast.LENGTH_SHORT).show();
            }
        });

    }
}