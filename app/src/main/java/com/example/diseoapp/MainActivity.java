package com.example.diseoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Ocultar el actionBar
        getSupportActionBar().hide();
    }

    public void launchContentActivity(View view) {
        Intent intent = new Intent(this, ContentActivity.class);
        startActivity(intent);
    }

    public void displayToast(String message) {
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
    }

    public void onClickFacebook(View view) {
        displayToast("Iniciará Sesión por medio de su cuenta de Facebook.");
    }
}
