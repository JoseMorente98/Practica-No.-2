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
public class Nivel {
    private int nivel;
    private int distanciaMaxima;
    private int distanciaPantalla;
    private int velocidadCorriente;
    private int tiempoNivel;
    private int tiempoSumergir;
    private int puntoSeleccion;
    private int puntoSumergir;

    public Nivel() {
    }

    public Nivel(int nivel, int distanciaMaxima, int distanciaPantalla, int velocidadCorriente, int tiempoNivel, int tiempoSumergir, int puntoSeleccion, int puntoSumergir) {
        this.nivel = nivel;
        this.distanciaMaxima = distanciaMaxima;
        this.distanciaPantalla = distanciaPantalla;
        this.velocidadCorriente = velocidadCorriente;
        this.tiempoNivel = tiempoNivel;
        this.tiempoSumergir = tiempoSumergir;
        this.puntoSeleccion = puntoSeleccion;
        this.puntoSumergir = puntoSumergir;
    }

    /**
     * @return the nivel
     */
    public int getNivel() {
        return nivel;
    }

    /**
     * @param nivel the nivel to set
     */
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    /**
     * @return the distanciaMaxima
     */
    public int getDistanciaMaxima() {
        return distanciaMaxima;
    }

    /**
     * @param distanciaMaxima the distanciaMaxima to set
     */
    public void setDistanciaMaxima(int distanciaMaxima) {
        this.distanciaMaxima = distanciaMaxima;
    }

    /**
     * @return the distanciaPantalla
     */
    public int getDistanciaPantalla() {
        return distanciaPantalla;
    }

    /**
     * @param distanciaPantalla the distanciaPantalla to set
     */
    public void setDistanciaPantalla(int distanciaPantalla) {
        this.distanciaPantalla = distanciaPantalla;
    }

    /**
     * @return the velocidadCorriente
     */
    public int getVelocidadCorriente() {
        return velocidadCorriente;
    }

    /**
     * @param velocidadCorriente the velocidadCorriente to set
     */
    public void setVelocidadCorriente(int velocidadCorriente) {
        this.velocidadCorriente = velocidadCorriente;
    }

    /**
     * @return the tiempoNivel
     */
    public int getTiempoNivel() {
        return tiempoNivel;
    }

    /**
     * @param tiempoNivel the tiempoNivel to set
     */
    public void setTiempoNivel(int tiempoNivel) {
        this.tiempoNivel = tiempoNivel;
    }

    /**
     * @return the tiempoSumergir
     */
    public int getTiempoSumergir() {
        return tiempoSumergir;
    }

    /**
     * @param tiempoSumergir the tiempoSumergir to set
     */
    public void setTiempoSumergir(int tiempoSumergir) {
        this.tiempoSumergir = tiempoSumergir;
    }

    /**
     * @return the puntoSeleccion
     */
    public int getPuntoSeleccion() {
        return puntoSeleccion;
    }

    /**
     * @param puntoSeleccion the puntoSeleccion to set
     */
    public void setPuntoSeleccion(int puntoSeleccion) {
        this.puntoSeleccion = puntoSeleccion;
    }

    /**
     * @return the puntoSumergir
     */
    public int getPuntoSumergir() {
        return puntoSumergir;
    }

    /**
     * @param puntoSumergir the puntoSumergir to set
     */
    public void setPuntoSumergir(int puntoSumergir) {
        this.puntoSumergir = puntoSumergir;
    }
    
}
