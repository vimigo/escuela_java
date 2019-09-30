/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sinensia.modelo.logica;

import com.sinensia.modelo.Persona;
import java.io.IOException;
import java.util.ArrayList;

/**
 * MODEL
 *
 * @author alumno
 */
public class ServicioPersona {

    private static ServicioPersona instancia;

    private ServicioPersona() {
        personas = new ArrayList<>();
    }

    public static ServicioPersona getInstancia() {
        if (instancia == null) {
            instancia = new ServicioPersona();
        }
        return instancia;
    }

    private ArrayList<Persona> personas; //OBJETO CREADO EN PERSONA QUE HACE DE BASE DE DATOS 

    public Persona addPersonas(String nombre, String edad)  //METODO PARA CREAR PERSONAS Y AÑADIRLAS A LA LISTA
        throws NumberFormatException, IOException, IllegalArgumentException{
      
            if(nombre.equals("")) {
                throw new IllegalArgumentException("MAL ARGUMENTADO");
            }else if (nombre.length()< 2){
                throw new IllegalArgumentException("edad menor que 2");
            }else if (edad.equals("")){
                throw new NumberFormatException("NUMERO MAL O VACIO");
            }else{
                int numEdad = Integer.parseInt(edad);
             if(numEdad <= 12){
                 throw new IllegalArgumentException("te pasas del rango");
             }else{
                Persona p = new Persona(nombre, numEdad);
                personas.add(p);
                return p;
             }
            }
     

    
    }
    
    public Persona getPersona(String nombre){
        for(Persona p : personas){
            if(p.getNombre().equalsIgnoreCase(nombre)){
                return p;
            }
        }
        return null;
    }
}
