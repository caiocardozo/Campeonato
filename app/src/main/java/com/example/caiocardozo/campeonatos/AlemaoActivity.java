package com.example.caiocardozo.campeonatos;

import android.content.pm.LabeledIntent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class AlemaoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alemao);

        String[] ArrayAlemao = getResources().getStringArray(R.array.ArrayAlemao);
        String[] ArrayDescAlemao = getResources().getStringArray(R.array.ArrayAlemaoDesc);

        //criando o array de imagem
        int[] imagensIds = {
                R.mipmap.ic_santos,
                R.mipmap.ic_saopaulo,
                R.mipmap.ic_palmeiras,
                R.mipmap.ic_corintians,
                R.mipmap.ic_flamengo,
                R.mipmap.ic_vasco,
                R.mipmap.ic_fluminense,
                R.mipmap.ic_botafogo,
                R.mipmap.ic_cruzeiro,
                R.mipmap.ic_atletico
        };

        //percorre o array pegando os itens e adicionando a lista
        ArrayList<Item> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            String titulo = ArrayAlemao[i];
            String desc = ArrayDescAlemao[i];

            Item item = new Item(titulo, desc, imagensIds[i]);
            list.add(item);
        }

        ItemAdapter adapter = new ItemAdapter(this, list, R.color.Alemao_Categoria);

        ListView listView = findViewById(R.id.rootAlemao);
        listView.setAdapter(adapter);

    }
}
