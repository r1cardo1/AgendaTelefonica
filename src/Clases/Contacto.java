/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.io.Serializable;

/**
 *
 * @author Ricardo Marcano
 */
public class Contacto implements Serializable{
    public String nombre;
    public String apellido;
    public String celular;
    public String trabajo;
    public String local;

    public Contacto(String nombre, String apellido, String celular, String trabajo, String local) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.celular = celular;
        this.trabajo = trabajo;
        this.local = local;
    }
    
    
}
