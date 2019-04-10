/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.josemorente.controlador;

import org.josemorente.bean.Animal;

/**
 *
 * @author Jose Morente
 */
public class ControladorAnimal {
    public static ControladorAnimal instance;
    public Animal[] animales = new Animal[10];

    public ControladorAnimal() {
    }

    public static ControladorAnimal getInstance() {
        if(instance == null) {
            instance = new ControladorAnimal();
        }
        return instance;
    }
    
    public Animal[] getAnimales() {
        return animales;
    }

    public Boolean add(String nombre, String path) {
        for(int i = 0; i < animales.length; i++) {
            if(animales[i] == null) {
                animales[i] = new Animal((i+1), nombre, path);
                return true;
            }
        }
        return false;
    }
    
    public Boolean update(int idAnimal,String nombre, String path) {
        for(int i = 0; i < animales.length; i++) {
            if(animales[i] != null) {
                if(animales[i].getIdAnimal()== idAnimal) {
                    animales[i] = new Animal(idAnimal, nombre, path);
                    return true;
                }
            }
        }
        return false;
    }
    
    public Boolean delete(int idAnimal) {
        for(int i = 0; i < animales.length; i++) {
            if(animales[i] != null) {
                if(animales[i].getIdAnimal() == idAnimal) {
                    animales[i] = null;
                    return true;
                }
            }
        }
        return false;
    }
    
    
}
