package com.br.cursocara_ou_coroa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ResultadoActivity extends AppCompatActivity {

    private ImageView imagemResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        imagemResultado = findViewById(R.id.img_resultado);

        Bundle dados = getIntent().getExtras();
        int numero = dados.getInt("numero");

        if(numero == 0){//cara
            imagemResultado.setImageResource(R.drawable.moeda_cara);
        }else{//coroa
            imagemResultado.setImageResource(R.drawable.moeda_coroa);
        }
    }

    public void voltar(View view){
        finish();
    }
}