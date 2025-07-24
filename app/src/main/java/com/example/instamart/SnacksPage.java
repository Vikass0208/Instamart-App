package com.example.instamart;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class SnacksPage extends AppCompatActivity {

    private Cart cart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snacks_page);


        cart = Cart.getInstance();

        Button buttonAddToCart1 = findViewById(R.id.buttonAddToCart1);
        Button buttonAddToCart2 = findViewById(R.id.buttonAddToCart2);

        buttonAddToCart1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cart.addItem("Masala Wafer");
                Toast.makeText(SnacksPage.this, "Masala Wafer added to cart", Toast.LENGTH_SHORT).show();
            }
        });

        buttonAddToCart2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cart.addItem("Masala Munch");
                Toast.makeText(SnacksPage.this, "Masala Munch added to cart", Toast.LENGTH_SHORT).show();
            }
        });

    }
}