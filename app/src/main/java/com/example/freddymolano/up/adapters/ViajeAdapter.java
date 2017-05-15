package com.example.freddymolano.up.adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.freddymolano.up.R;
import com.example.freddymolano.up.models.Usuario;
import com.example.freddymolano.up.models.Viaje;

import java.util.List;

/**
 * Created by Freddy Molano on 09/05/2017.
 */

public class ViajeAdapter extends BaseAdapter{

    private Context context2;
    private List<Viaje> dataviaje;


    @Override
    public int getCount() {
        return dataviaje.size();
    }

    @Override
    public Object getItem(int position) {
        return dataviaje.get(position);
    }

    @Override
    public long getItemId(int position) {
       return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v2 = convertView;
        if (v2 == null)
            v2 = View.inflate(context2, R.layout.template_viaje, null);

        Viaje viaje = dataviaje.get(position);
        TextView salida = (TextView) v2.findViewById(R.id.SpSalida);
        TextView destino = (TextView) v2.findViewById(R.id.SpDestino);
        TextView precio = (TextView) v2.findViewById(R.id.editTextPrecio);
        TextView fecha = (TextView) v2.findViewById(R.id.editTextCorreo);

        salida.setText(viaje.getSalida());
        destino.setText(viaje.getDestino());
        precio.setText(""+viaje.getPrecio());
        fecha.setText(""+viaje.getFecha());




        return v2;
    }
}
