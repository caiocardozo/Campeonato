package com.example.caiocardozo.campeonatos;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by caiocardozo on 13/11/17.
 */

public class ItemAdapter extends ArrayAdapter<Item> {

    private int backgroundColor;

    public ItemAdapter(Context context, ArrayList<Item> list, int backgroundColor) {
        super(context, 0, list);
        this.backgroundColor = backgroundColor;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //cria a view para receber como parametro
        View itemView = convertView;
        if (itemView == null) {
            itemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        //pega o item
        Item item = getItem(position);

        //atribui o titulo ao textView
        TextView titulo = (TextView) itemView.findViewById(R.id.item_titulo);
        titulo.setText(item.getTitulo());

        //atribui a descricao ao testView
        TextView desc = (TextView) itemView.findViewById(R.id.item_desc);
        desc.setText(item.getDescricao());

        //atribui o icone
        ImageView icone = (ImageView) itemView.findViewById(R.id.item_icone);
        icone.setImageResource(item.getImagem());

        //altera a cor do layout
        LinearLayout layoutTextos = (LinearLayout) itemView.findViewById(R.id.item_layout_textos);
        int cor = ContextCompat.getColor(getContext(), backgroundColor);
        layoutTextos.setBackgroundColor(cor);

        return itemView;
    }
}