/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.josemorente.principal;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import org.josemorente.controlador.ControladorInterprete;

/**
 *
 * @author Jose Morente
 */
public class FXMLDocumentController implements Initializable {
    private File file;
    private InputStream inputStream;
    private BufferedReader bufferedReader;	
    
    @FXML
    void handleButtonAction(ActionEvent event) {
        System.out.println("Hola Mundo!");
    }
    
    @FXML 
    void menuItemAbrirAction(ActionEvent event) {
        Stage stage = new Stage();
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Open Resource File");
        fileChooser.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("IPC Files", "*.ipc"));
        File selectedFile = fileChooser.showOpenDialog(stage);
        if (selectedFile != null) {
            try {
                System.err.println(selectedFile);
                String linea;
                BufferedReader bf = leer(selectedFile.toString());
                while((linea = bf.readLine()) != null ) {
                    System.err.println(linea);
                    ControladorInterprete.getInstance().interpretar(linea);
                }
            } catch (IOException e) {
                
            }
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
    
    public BufferedReader leer(String nombre) {
	try {
            file = new File(nombre);
            inputStream = new FileInputStream(file);
            bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
	} catch (IOException ex) {
			
	}
	return bufferedReader;
    }
    
}
