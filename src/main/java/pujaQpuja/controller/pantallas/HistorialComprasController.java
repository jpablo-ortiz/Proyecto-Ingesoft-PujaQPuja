/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pujaQpuja.controller.pantallas;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
/**
 * FXML Controller class
 *
 * @author LomitoFrito
 */
public class HistorialComprasController implements Initializable {


    @FXML
    private Button botonRegresarHC;
    @FXML
    private TableView<?> tablaHistorialCompras;
    @FXML
    private TableColumn<?, ?> columnaProductoColHC;
    @FXML
    private TableColumn<?, ?> columnaNomProdColHC;
    @FXML
    private TableColumn<?, ?> columnaEstadoColHC;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    @FXML
    private void RegresarHC(ActionEvent event) {
    }

}