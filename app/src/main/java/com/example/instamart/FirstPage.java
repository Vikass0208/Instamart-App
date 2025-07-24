package com.example.instamart;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class FirstPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_first_page);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Button buttonGoToCart = findViewById(R.id.buttonGoToCart);
        buttonGoToCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FirstPage.this, CartActivity.class);
                startActivity(intent);
            }
        });
    }

    public void Vegi(View view) {
        Intent i = new Intent(getApplicationContext(), VegetablePage.class);
        startActivity(i);
    }

    public void cold(View view) {
        Intent i = new Intent(getApplicationContext(), ColdrinkPage.class);
        startActivity(i);
    }

    public void Snack(View view) {
        Intent i = new Intent(getApplicationContext(), SnacksPage.class);
        startActivity(i);
    }

    public void kitchen(View view) {
        Intent i = new Intent(getApplicationContext(), KitchenPage.class);
        startActivity(i);
    }
}