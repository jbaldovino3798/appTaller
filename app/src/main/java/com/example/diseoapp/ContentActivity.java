package com.example.diseoapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class ContentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content);
    }

    public void launchFormActivity(View view) {
        Intent intent = new Intent(this, FormActivity.class);
        startActivity(intent);
    }

    public void toastLearn(View view) {
        Toast.makeText(getApplicationContext(), "Ha clickeado Learn More.",
                Toast.LENGTH_SHORT).show();
    }

    public void alertSweatshirts(View view) {
        AlertDialog.Builder myAlertBuilder = new AlertDialog.Builder(ContentActivity.this);
        myAlertBuilder.setTitle("Alert");
        myAlertBuilder.setMessage("Presione OK para agregar al carrito o Cancelar para seguir viendo los productos:");
        myAlertBuilder.setPositiveButton("OK", new
                DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // User clicked OK button.
                        Toast.makeText(getApplicationContext(), "Se ha añadido el producto Sweatshirts al carrito.",
                                Toast.LENGTH_SHORT).show();
                    }
                });
        myAlertBuilder.show();
    }

    public void toastActivewear(View view) {
        Toast.makeText(getApplicationContext(), "Se ha añadido el producto Activewear al carrito.",
                Toast.LENGTH_SHORT).show();
    }
}
