/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sinensia.modelo.logica;

import com.sinensia.modelo.Persona;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Singleton porque sólo queremos un servicio por aplicación/servidor
 *
 * @author alumno
 */
public class ServicioPersona {

// <editor-fold defaultstate="collapsed" desc="Código patrón de diseño Singleton.">
    private static ServicioPersona instancia;

    private ServicioPersona() {
        personas = new ArrayList<>();
    }

    public static ServicioPersona getInstancia() {
        if (instancia == null) {
            instancia = new ServicioPersona();
        }
        return instancia;
    }// </editor-fold>

    private ArrayList<Persona> personas;

    public Persona addPersonas(String nombre, String edad, String contrasena, String email)
            throws NumberFormatException, IOException, IllegalArgumentException {

        if (nombre.equals("") && email.equals("") && contrasena.equals("")) {
            throw new IllegalArgumentException("El nombre es vacío");
        } else if (nombre.length() < 2) {
            throw new IllegalArgumentException("El nombre es demasiado corto");
        } else if (edad.equals("")) {
            throw new NumberFormatException("La edad está vacía");
        } else {
            int intEdad = Integer.parseInt(edad);
            if (intEdad <= 12) {
                throw new IllegalArgumentException("La edad debe ser mayor que 12");
            } else {
                Persona p = new Persona(nombre, intEdad, contrasena, email);
                personas.add(p);
                return p;
            }
        }
    }

    public Persona modPersonas(String emailV,String NombreNew, String EdadNew, String PassNew, String MailNew ) {
        Persona actual = null;
        int edadNueva = Integer.parseInt(EdadNew);

        Iterator<Persona> iterador = personas.iterator();
        while (iterador.hasNext()) {
            actual = iterador.next();
            if (actual.igualMail(emailV)) {
                actual.setNombre(NombreNew);
                actual.setEdad(edadNueva);
                actual.setContrasena(NombreNew);
                actual.setEmail(NombreNew);
            }
        }
        return actual;

    }

    public Persona getPersona(String nombre, String mail) {
        for (Persona p : personas) {
            if (p.getNombre().equalsIgnoreCase(nombre) ) {
                return p;
            }
            if( p.getEmail().equalsIgnoreCase(mail)){
                return p;
            }
        }
        return null;
    }

    public boolean borrarPersona(String nombre) {
        Persona perElim = null;
        for (Persona p : personas) {
            if (p.getNombre().equalsIgnoreCase(nombre)) {
                perElim = p;
            }
        }

        if (perElim == null) {
            return false;
        } else {
            personas.remove(perElim);
            return true;
        }

    }
}
