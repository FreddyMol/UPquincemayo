package com.example.freddymolano.up.adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.freddymolano.up.R;
import com.example.freddymolano.up.models.Usuario;

import java.util.List;

/**
 * Created by Freddy Molano on 09/05/2017.
 */

public class UsuarioAdapter extends BaseAdapter{

    private Context context;
    private List<Usuario> data;

    public UsuarioAdapter(Context context, List<Usuario> data) {
        this.context = context;
        this.data = data;
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = convertView;


        Usuario u = data.get(position);
        TextView nombre = (TextView) v.findViewById(R.id.nombre);
        TextView telefono = (TextView) v.findViewById(R.id.telefono);
        TextView correo = (TextView) v.findViewById(R.id.correo);

        nombre.setText(u.getNombre());
        telefono.setText(""+u.getTelefono());
        correo.setText(u.getCorreo());



        return v;
    }



}
