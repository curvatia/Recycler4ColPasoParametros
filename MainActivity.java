package com.example.ej28recyclercolumnaspasoparametros;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    //NEW RECYLCER & ADAPTADOR
    private RecyclerView miReciclador;
    private Adaptador miAdaptador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Buscamos el control para cargar los datos
        this.miReciclador = (RecyclerView) findViewById(R.id.RecicladorView);

        // Añadimos que  el tamaño del RecyclerView no se cambiará
        this.miReciclador.setHasFixedSize(true);
        this.miReciclador.setLayoutManager(new GridLayoutManager(this,4,GridLayoutManager.VERTICAL,true));

        //Especificamos el adaptador con la lista a visualizar
        this.miAdaptador = new Adaptador(DatosEquipos());//SE DECLARA MÁS ABAJO FUERA DEL onCreate
        this.miReciclador.setAdapter(miAdaptador);

    }

    //NEW DatosEquipos FUERA DEL onCreate
    public List<Equipo> DatosEquipos() {

        List<Equipo> lista = new ArrayList<>();

        lista.add(new Equipo("Athletic", "San Mames", "Aitor Elizegi" , R.drawable.athl, 1898));
        lista.add(new Equipo("Atletico", "Wanda Metropolitano", "Enrique Cerezo" , R.drawable.atletico, 1903));
        lista.add(new Equipo("Barça", "Camp Nou", "Joan Laporta" , R.drawable.barca, 1899));
        lista.add(new Equipo("Betis", "Benito Villamarin", "Angel Haro" , R.drawable.betis, 1907));
        lista.add(new Equipo("Celta", "Abanca Balaidos", "Carlos Mouriño" , R.drawable.celta, 1923));
        lista.add(new Equipo("Deportivo de la Coruña", "Riazor", "Antonio Couceiro" , R.drawable.depor, 1906));
        lista.add(new Equipo("Espanyol", "RCDE Stadium", "Chen Yansheng" , R.drawable.espanol, 1900));
        lista.add(new Equipo("Las Palmas", "Estadio de Gran Canaria", "Miguel Ángel Ramírez" , R.drawable.laspalmas, 1949));
        lista.add(new Equipo("Malaga", "La Rosaleda", "José María Muñoz" , R.drawable.malaga, 1948));
        lista.add(new Equipo("Mallorca", "Son Moix", "Andy Kohlberg" , R.drawable.mallorca, 1916));
        lista.add(new Equipo("Osasuna", "El Sadar", "Luis Sabalza" , R.drawable.osasu, 1920));
        lista.add(new Equipo("Rayo Vallecano", "Estadio de Vallecas", "Raúl Martín Presa" , R.drawable.rayo, 1924));
        lista.add(new Equipo("Real Madrid", "Estadio Santiago Bernabéu", "Florentino Perez Rodriguez" , R.drawable.realma, 1902));
        lista.add(new Equipo("Real Sociedad", "Reale Arena", "Jokin Aperribay" , R.drawable.realso, 1909));
        lista.add(new Equipo("Sevilla", "Ramón Sánchez-Pizjuán", "José Castro Carmona" , R.drawable.sevilla, 1890));
        lista.add(new Equipo("Valencia", "Mestalla", "Lay Hoon" , R.drawable.valenci, 1919));

        return lista;
    }


}
