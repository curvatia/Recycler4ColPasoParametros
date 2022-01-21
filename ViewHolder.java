package com.example.ej28recyclercolumnaspasoparametros;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class ViewHolder extends RecyclerView.ViewHolder {

    private final CardView TarjetaView;
    private final TextView equipo;
    private final ImageView escudo;


    public ViewHolder(View view) {
        super(view);
        this.equipo = view.findViewById(R.id.tvTeam);
        this.escudo = view.findViewById(R.id.imgEscudo);
        this.TarjetaView = view.findViewById(R.id.EtiCardView);

    }

    public TextView getEquipo() {
        return equipo;
    }

    public ImageView getEscudo () {
        return escudo;
    }

    public CardView getTarjetaView() {
        return TarjetaView;
    }


}
