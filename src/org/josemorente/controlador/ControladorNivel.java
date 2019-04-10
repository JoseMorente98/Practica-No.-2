/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.josemorente.controlador;

import org.josemorente.bean.Nivel;

/**
 *
 * @author Jose Morente
 */
public class ControladorNivel {
    private static ControladorNivel instance;
    private Nivel[] level = new Nivel[1];

    public ControladorNivel() {
        level[0] = new Nivel(1, 600, 120, 15, 70, 5, 20, 30);
    }

    public static ControladorNivel getInstance() {
        if(instance == null) {
            instance = new ControladorNivel();
        }
        return instance;
    }
    
    public Boolean update(int nivel, int distanciaMaxima, int distanciaPantalla, int velocidadCorriente, int tiempoNivel, int tiempoSumergir, int puntoSeleccion, int puntoSumergir) {
        level[0] = new Nivel(nivel, distanciaMaxima, distanciaPantalla, velocidadCorriente, tiempoNivel, tiempoSumergir, puntoSeleccion, puntoSumergir);
        return true;
    }
    
}
