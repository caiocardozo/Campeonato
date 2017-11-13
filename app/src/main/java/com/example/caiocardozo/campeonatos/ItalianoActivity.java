package com.example.caiocardozo.campeonatos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ItalianoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_italiano);

        //cria o array de times pegando o que esta no arquivo String
        String[] italianoArray = getResources().getStringArray(R.array.ArrayItaliano);
        //cria o array com a descrição dos times
        String[] italianoDescArray = getResources().getStringArray(R.array.ArrayBrasileiroDesc);

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
            String titulo = italianoArray[i];
            String desc = italianoDescArray[i];

            Item item = new Item(titulo, desc, imagensIds[i]);
            list.add(item);
        }

        //cria o item adapter atribuindo a listas e a cor
        ItemAdapter adapter = new ItemAdapter(this, list, R.color.Italiano_Categoria);

        //atribui o adapter ao layout
        ListView listView = findViewById(R.id.rootItaliano);
        listView.setAdapter(adapter);
    }
}
