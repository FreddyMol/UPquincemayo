package com.example.freddymolano.up.models;

/**
 * Created by Freddy Molano on 09/05/2017.
 */

public class Usuario {
    private String nombre, correo;
    String OnLoginUsuario;

    public String getOnLoginUsuario() {
        return OnLoginUsuario;
    }

    public void setOnLoginUsuario(String onLoginUsuario) {
        OnLoginUsuario = onLoginUsuario;
    }

    private float telefono;


    public Usuario(String nombre, float telefono, String correo) {
        this.nombre = nombre;
    //    this.telefono = telefono;
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public float getTelefono() {
        return telefono;
    }

    public void setTelefono(float telefono) {
        this.telefono = telefono;
    }
}
