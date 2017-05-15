package com.example.freddymolano.up.models;

/**
 * Created by Freddy Molano on 09/05/2017.
 */

public class Viaje {
    private String salida, destino;
    private float precio, fecha;

    public Viaje(String salida, String destino, float precio, float fecha) {

        this.salida = salida;
        this.destino = destino;
        this.precio = precio;
        this.fecha = fecha;



    }

    public String getSalida() {
        return salida;
    }

    public void setSalida(String salida) {
        this.salida = salida;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public float getFecha() {
        return fecha;
    }

    public void setFecha(float fecha) {
        this.fecha = fecha;
    }





}
