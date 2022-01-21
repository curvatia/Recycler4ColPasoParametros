package com.example.ej28recyclercolumnaspasoparametros;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class FutbolActivity extends AppCompatActivity {

    //NEW ATRIBUTOS
    private ImageView logo;
    private Equipo equipo;
    private TextView club, info;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_futbol);

        Bundle bundle = getIntent().getExtras();
        this.equipo = (Equipo)
                bundle.getSerializable("equipo");//LLAMA A LA CLASE Equipo.java || implements Serializable

        this.logo = findViewById(R.id.imgLogo);
        this.club = findViewById(R.id.tvClub);
        this.info = findViewById(R.id.tvInformacion);

        this.logo.setImageResource(this.equipo.getEscu());
        this.club.setText(this.equipo.getClub());
        this.info.setText(this.equipo.toString());

    }
}
