package com.example.diseoapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class ContentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content);
    }

    public void toastLearn(View view) {
        displayToast("Ha clickeado Learn More.");
    }

    public void alertSweatshirts(View view) {
        AlertDialog.Builder myAlertBuilder = new AlertDialog.Builder(ContentActivity.this);
        myAlertBuilder.setTitle("Alert");
        myAlertBuilder.setMessage("Presione OK para agregar al carrito o Cancelar para seguir viendo los productos:");
        myAlertBuilder.setPositiveButton("OK", new
                DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // User clicked OK button.
                        displayToast("Se ha añadido el producto Sweatshirts al carrito.");
                    }
                });
        myAlertBuilder.show();
    }

    public void toastActivewear(View view) {
        displayToast("Se ha añadido el producto Activewear al carrito.");
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    public void displayToast(String message) {
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.action_notificacion:
                AlertDialog.Builder myAlertBuilder = new AlertDialog.Builder(ContentActivity.this);
                myAlertBuilder.setTitle("Alert");
                myAlertBuilder.setMessage("Presione OK para ver las notifiaciones o Cancelar para seguir viendo los productos:");
                myAlertBuilder.setPositiveButton("OK", new
                        DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                // User clicked OK button.
                                displayToast("Se mostrara la pantalla de notificaciones.");
                            }
                        });
                myAlertBuilder.show();
                return true;
            case R.id.action_carrito:
                Intent intent = new Intent(this, FormActivity.class);
                startActivity(intent);
                return true;
            default:
                displayToast("Not found");
                return true;
        }
    }

    public void onClickHat(View view) {
        displayToast("Se ha añadido el producto Hat al carrito.");
    }
}
