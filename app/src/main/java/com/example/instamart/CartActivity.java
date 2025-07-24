package com.example.instamart;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

import java.util.List;
import java.util.Map;

public class CartActivity extends AppCompatActivity {

    private ListView listViewCartItems;
    private TextView textViewTotalQuantity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);

        listViewCartItems = findViewById(R.id.listViewCartItems);
        textViewTotalQuantity = findViewById(R.id.textViewTotalQuantity);

        Cart cart = Cart.getInstance();
        Map<String, Integer> cartItems = cart.getItems();

        if (cartItems.isEmpty()) {
            Toast.makeText(this, "Your cart is empty!", Toast.LENGTH_SHORT).show();
        } else {

            ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, cartItems.entrySet().stream()
                    .map(entry -> entry.getKey() + " x " + entry.getValue())
                    .toArray(String[]::new));
            listViewCartItems.setAdapter(adapter);

            textViewTotalQuantity.setText("Total Quantity: " + cart.getTotalQuantity());
        }
    }
}