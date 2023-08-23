package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
   /* ** Setar Texto
   public void alterarTexto(View view){
        TextView texto = findViewById(R.id.textoExibicao);
        texto.setText("Olá Mundo");
    }*/
    public void alterarNum(View view){
        TextView num = findViewById(R.id.textoRes);

        int numero = new Random().nextInt(11);

        num.setText("Número: " + numero);
    }
}