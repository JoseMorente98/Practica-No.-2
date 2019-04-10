/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.josemorente.controlador;

import org.josemorente.bean.Animal;
import org.josemorente.bean.Jugador;

/**
 *
 * @author Jose Morente
 */
public class ControladorJugador {
    public static ControladorJugador instance;
    public Jugador[] jugadores = new Jugador[100];

    public ControladorJugador() {
    }

    public static ControladorJugador getInstance() {
        if(instance == null) {
            instance = new ControladorJugador();
        }
        return instance;
    }

    public Jugador[] getJugadores() {
        return jugadores;
    }
    
    public Boolean add(String nombre, boolean ganador, int puntaje) {
        for(int i = 0; i < jugadores.length; i++) {
            if(jugadores[i] == null) {
                jugadores[i] = new Jugador((i+1), nombre, ganador, puntaje);
                return true;
            }
        }
        return false;
    }
    
    public Boolean update(int idJugador, String nombre, boolean ganador, int puntaje) {
        for(int i = 0; i < jugadores.length; i++) {
            if(jugadores[i] != null) {
                if(jugadores[i].getIdJugador()== idJugador) {
                    jugadores[i] = new Jugador(idJugador, nombre, ganador, puntaje);
                    return true;
                }
            }
        }
        return false;
    }
    
    public Boolean delete(int idJugador) {
        for(int i = 0; i < jugadores.length; i++) {
            if(jugadores[i] != null) {
                if(jugadores[i].getIdJugador() == idJugador) {
                    jugadores[i] = null;
                    return true;
                }
            }
        }
        return false;
    }
    
}
