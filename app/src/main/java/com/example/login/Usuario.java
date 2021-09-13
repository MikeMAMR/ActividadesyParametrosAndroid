package com.example.login;

import android.os.Parcel;

import java.io.Serializable;

public class Usuario implements Serializable {
    private String nombre;
    private String telefono;
    private String password;
    private String email;
    public Usuario(String nombre, String telefono, String email, String password){
        this.nombre = nombre;
        this.telefono = telefono;
        this.password = password;
        this.email = email;
    }

    public Usuario(){

    }
    public String getNombre(){return nombre;}
    public String getTelefono(){return telefono;}
    public String getPassword(){return password;}
    public String getEmail(){return email;}

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setTelefono(String telefono){
        this.telefono = telefono;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public void setEmail(String email){
        this.email = email;
    }
}
