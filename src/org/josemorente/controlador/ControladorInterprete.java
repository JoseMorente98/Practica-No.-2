/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.josemorente.controlador;

/**
 *
 * @author Jose Morente
 */
public class ControladorInterprete {
    private static ControladorInterprete instance;
    
    public static ControladorInterprete getInstance() {
        if(instance == null) {
            instance = new ControladorInterprete();
        }
        return instance;
    }

    public ControladorInterprete() {
    }
    
    public void interpretar(String instruccion) {
        instruccion = instruccion.trim().replace("**", " ");
        String comando = instruccion;
        int posicion = 0;
        for (int x = 0 ; x < instruccion.length(); x++) {
            System.out.println(instruccion.substring(x, x + 1).equals("**"));
            if (instruccion.substring(x, x + 1).equals(" ")) {
                comando = instruccion.substring(0, x);
                posicion = x;
                break;
            } else if (instruccion.substring(x, x + 1).equals("**")) {
                comando = instruccion.substring(0, x);
                posicion = x;
                break;
            }
        }
        System.out.println(comando);
        switch(comando.toUpperCase()) {
            case "NIVEL:":
                interpretarConfiguracion(instruccion, posicion);
            break;
            case "PERSONAJE":
                interpretarPersonaje(instruccion, posicion);
            break;
        }
    }
    
    public void interpretarConfiguracion(String instruccion, int posicion) {
        String instruccion1 = "";
        String instruccion2 = "";
        String instruccion3 = "";
        String instruccion4 = "";
        String instruccion5 = "";
        String instruccion6 = "";
        String instruccion7 = "";
        String instruccion8 = "";
        
        instruccion = instruccion.substring(posicion +1).trim();
        for (int x = 0 ; x < instruccion.length(); x++) {
            if (instruccion.substring(x, x + 1).equals(" ")) {
                instruccion1 = instruccion.substring(0, x);
                posicion = x;
                break;
            }
        }
        System.err.println("1. " + instruccion1);
        
        instruccion = instruccion.substring(posicion +1).trim();
        for (int x = 0 ; x < instruccion.length(); x++) {
            if (instruccion.substring(x, x + 1).equals(" ")) {
                instruccion2 = instruccion.substring(0, x);
                posicion = x;
                break;
            }
        }
        System.err.println("2. " + instruccion2);
        
        instruccion = instruccion.substring(posicion +1).trim();
        for (int x = 0 ; x < instruccion.length(); x++) {
            if (instruccion.substring(x, x + 1).equals(" ")) {
                instruccion3 = instruccion.substring(0, x);
                posicion = x;
                break;
            }
        }
        System.err.println("3. " + instruccion3);
        
        instruccion = instruccion.substring(posicion +1).trim();
        for (int x = 0 ; x < instruccion.length(); x++) {
            if (instruccion.substring(x, x + 1).equals(" ")) {
                instruccion4 = instruccion.substring(0, x);
                posicion = x;
                break;
            }
        }
        System.err.println("4. " + instruccion4);
        
        instruccion = instruccion.substring(posicion +1).trim();
        for (int x = 0 ; x < instruccion.length(); x++) {
            if (instruccion.substring(x, x + 1).equals(" ")) {
                instruccion5 = instruccion.substring(0, x);
                posicion = x;
                break;
            }
        }
        System.err.println("5. " + instruccion5);
        
        instruccion = instruccion.substring(posicion +1).trim();
        for (int x = 0 ; x < instruccion.length(); x++) {
            if (instruccion.substring(x, x + 1).equals(" ")) {
                instruccion6 = instruccion.substring(0, x);
                posicion = x;
                break;
            }
        }
        System.err.println("6. " + instruccion6);
        
        instruccion = instruccion.substring(posicion +1).trim();
        for (int x = 0 ; x < instruccion.length(); x++) {
            if (instruccion.substring(x, x + 1).equals(" ")) {
                instruccion7 = instruccion.substring(0, x);
                posicion = x;
                break;
            }
        }
        System.err.println("7. " + instruccion7);
        
        instruccion = instruccion.substring(posicion + 1).trim();
	for (int x = 0; x < instruccion.length(); x++) {
            if (instruccion.substring(x, x + 1).equals(" ") || x  == (instruccion.length() -1)) {
		instruccion8 = instruccion.substring(0, x + 1);
		break;
            }
	}
        System.err.println("8. " + instruccion8);
    }
    
    public void interpretarPersonaje(String instruccion, int posicion) {
        String instruccion1 = "";
        String instruccion2 = "";
        
        instruccion = instruccion.substring(posicion +1).trim();
        for (int x = 0 ; x < instruccion.length(); x++) {
            if (instruccion.substring(x, x + 1).equals(" ")) {
                instruccion1 = instruccion.substring(0, x);
                posicion = x;
                break;
            }
        }
        System.err.println("1. " + instruccion1);
        
        instruccion = instruccion.substring(posicion + 1).trim();
	for (int x = 0; x < instruccion.length(); x++) {
            if (instruccion.substring(x, x + 1).equals(" ") || x  == (instruccion.length() -1)) {
		instruccion2 = instruccion.substring(0, x + 1);
		break;
            }
	}
        System.err.println("8. " + instruccion2);
    }
}
