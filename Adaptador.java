package com.example.ej28recyclercolumnaspasoparametros;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

//Si queremos mostrar la lista de clientes dentro de un RecyclerView tendremos  que crear un adaptador con un LayoutManager => layout/New/Layout Resource File
//El adaptador se enlazará al modelo de datos para ser visualizados y el LayoutManager(cardview.xml) será el encargado de posicionar cada ítem dentro del RecyclerView
// y de decidir cuándo reciclar las vistas de items que ya no son visibles.

public class Adaptador extends RecyclerView.Adapter<Adaptador.ViewHolder> {

    //LLAMAR A LA CLASE Equipo.java
    private final List<Equipo>listaEquipos;
    private int posicionseleccionada = -1;

    //LLAMAR A LA CLASE Adaptador.java
    public Adaptador(List<Equipo>listado) {
        this.listaEquipos = listado;
    }

    //MÉTODO 1
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview, parent,false));
    }

    //MÉTODO 2
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.Team.setText(listaEquipos.get(position).getClub());

        holder.Escudo.setImageResource(listaEquipos.get(position).getEscu());

        holder.TarjetaView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                posicionseleccionada = position;
                notifyDataSetChanged();
            }
        });

        if (posicionseleccionada == position) {
            Equipo equipo = listaEquipos.get(posicionseleccionada);
            Intent i = new
                Intent(holder.itemView.getContext(),FutbolActivity.class);
                i.putExtra("equipo",equipo);
                holder.itemView.getContext().startActivity(i);
        }

    }

    //MÉTODO 3
    @Override
    public int getItemCount() {
        return listaEquipos.size();
    }

    //NEW DECLARO ViewHolder
    public static class ViewHolder extends RecyclerView.ViewHolder{

        private CardView TarjetaView;

        private TextView Team;
        private ImageView Escudo;

        public ViewHolder(View view) {
            super(view);

            this.TarjetaView = (CardView) view.findViewById(R.id.EtiCardView);
            this.Team = (TextView) view.findViewById(R.id.tvTeam);

            this.Escudo = (ImageView) view.findViewById(R.id.imgEscudo);
        }

    }

}
