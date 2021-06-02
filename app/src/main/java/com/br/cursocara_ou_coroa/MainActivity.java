package com.br.cursocara_ou_coroa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void jogar(View view){

        Intent intent = new Intent(getApplicationContext(), ResultadoActivity.class);

        //Passar dados para proxima tela ResultadoActivity
        int numero = new Random().nextInt(2);
        intent.putExtra("numero", numero);


        startActivity(intent);

    }
}