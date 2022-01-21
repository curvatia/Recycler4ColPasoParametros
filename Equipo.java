package com.example.ej28recyclercolumnaspasoparametros;

import java.io.Serializable;

//CLASE SERIALIZABLE PARA LA 2º ACTIVITY ==> FutbolActivity.java & activity_futbol.xml
public class Equipo implements Serializable {

    //NEW ATRIBUTOS
    private String Club,estadium,presi;
    protected int escu, fund;

    public Equipo(String club, String estadio, String presidente, int escudo, int fundacion) {
        this.Club = club;
        this.estadium = estadio;
        this.presi = presidente;
        this.escu = escudo;
        this.fund = fundacion;
    }

    public String getClub() { return Club; }
    public void setClub(String club) { Club = club; }

    public String getEstadium() { return estadium; }
    public void setEstadium(String estadium) {
        this.estadium = estadium;
    }

    public String getPresi() {
        return presi;
    }
    public void setPresi(String presi) {
        this.presi = presi;
    }

    public int getEscu() {
        return escu;
    }
    public void setEscu(int escu) {
        this.escu = escu;
    }

    public int getFund() {
        return fund;
    }
    public void setFund(int fund) {
        this.fund = fund;
    }

    @Override
    public String toString() {
        return "Estadio: "+ this.estadium+
                "\nFundación: "+ this.fund+
                "\nPresidente: "+ this.presi;
    }

}
