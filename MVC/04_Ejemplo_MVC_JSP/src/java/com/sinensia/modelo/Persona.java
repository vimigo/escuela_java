/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sinensia.modelo;

/** Esta clase es un POJO (Plain Old Java Object)
 *  Clases sin lógica, sin herencia (o poco de...)
 * Suelen corresponder a una ENTIDAD
 * @author alumno
 */
public class Persona {
    
    private String nombre;
    private int edad;
    private String contrasena;
    private String email;

    public Persona(String nombre, int edad, String contrasena, String email) {
        this.nombre = nombre;
        this.edad = edad;
        this.contrasena = contrasena;
        this.email = email;
    }

   
    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public boolean igualMail(String nombre){
        return this.email.equals(email);
    }

}
