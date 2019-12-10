package com.example.convertisseur;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Notification;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import static java.lang.Math.round;

public class MainActivity extends AppCompatActivity {

    EditText txtUSD;
    EditText txtEUR;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void calculate(View view) {

        txtUSD = findViewById(R.id.txtUSD);
        txtEUR = findViewById(R.id.txtEUR);
        double TAUX_EUR = 0.91;

        Double usd = Double.parseDouble(txtUSD.getText().toString());
        Double eur = usd * TAUX_EUR;
        eur = (double) round(eur * 100) / 100;
        txtEUR.setText(eur.toString());
    }

    public void quit(View view) {
        finish();
    }
}
