/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.josemorente.bean;

/**
 *
 * @author Jose Morente
 */
public class Animal {
    private int idAnimal;
    private String nombre;
    private String path;

    public Animal() {
    }

    public Animal(int idAnimal, String nombre, String path) {
        this.idAnimal = idAnimal;
        this.nombre = nombre;
        this.path = path;
    }
    
    /**
     * @return the idAnimal
     */
    public int getIdAnimal() {
        return idAnimal;
    }

    /**
     * @param idAnimal the idAnimal to set
     */
    public void setIdAnimal(int idAnimal) {
        this.idAnimal = idAnimal;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the path
     */
    public String getPath() {
        return path;
    }

    /**
     * @param path the path to set
     */
    public void setPath(String path) {
        this.path = path;
    }

}
