package pujaQpuja.controller.pantallas;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.Rectangle;
import pujaQpuja.controller.modelos.ControladorGeneral;
import pujaQpuja.model.entities.Puja;
import pujaQpuja.model.entities.otros.TipoTarjeta;
import pujaQpuja.utilities.PantallasMenu;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class PantallaMetodoPagoController implements Initializable {

    private ControladorGeneral controladorGeneral;

    @FXML
    private Rectangle botonAtras;
    @FXML
    private Rectangle botonPerfil;
    @FXML
    private Rectangle botonRectanguloAjustes;
    @FXML
    private Rectangle botonRectanguloCategorias;
    @FXML
    private Rectangle botonRectanguloRealizarSubasta;
    @FXML
    private Rectangle botonRectanguloHistorialVentas;
    @FXML
    private Rectangle botonRectanguloHistorialCompras;
    @FXML
    private Rectangle botonRectanguloNotificaciones;
    @FXML
    private Rectangle botonRectanguloMetodoPago;
    @FXML
    private ChoiceBox<TipoTarjeta> desplegableTipoTarjeta;
    @FXML
    private TextField campoNumeroTarjeta;
    @FXML
    private TextField campoFechaExpiracion;
    @FXML
    private TextField campoCodigoSeguridad;
    @FXML
    private TextField campoNombre;
    @FXML
    private TextField campoApellido;
    @FXML
    private TextField campoCiudad;
    @FXML
    private TextField campoDireccion;
    @FXML
    private TextField campoCodigoPostal;
    @FXML
    private TextField campoTelefono;
    @FXML
    private Button botonPagar;
    @FXML
    private Rectangle botonRectanguloQA;
    @FXML
    private TextField campoMontoAPagar;

    private Puja puja;

    public void setPuja(Puja puja) {
        this.puja = puja;
        campoMontoAPagar.setText(String.valueOf(puja.getPrecioFinal()));
    }

    public Puja getPuja() {
        return puja;
    }

    @FXML
    void abrirQA(MouseEvent event) {
        PantallasMenu.abrirVentana("PantallaPreguntas");
        PantallasMenu.cerrarPantalla(event);
    }

    @FXML
    void abrirRealizarPregunta(ActionEvent event) {
        PantallasMenu.abrirVentana("PantallaChat");
        PantallasMenu.cerrarPantalla(event);
    }

    @FXML
    void abrirAjustes(MouseEvent event) {
        PantallasMenu.abrirVentana("PantallaPerfil");
        PantallasMenu.cerrarPantalla(event);
    }

    @FXML
    void abrirCategorias(MouseEvent event) {
        PantallasMenu.abrirVentana("PantallaSeleccionarCategoria");
        PantallasMenu.cerrarPantalla(event);
    }

    @FXML
    void abrirHistorialCompras(MouseEvent event) {
        PantallasMenu.abrirVentana("HistorialCompras");
        PantallasMenu.cerrarPantalla(event);
    }

    @FXML
    void abrirHistorialVentas(MouseEvent event) {
        PantallasMenu.abrirVentana("HistorialVentas");
        PantallasMenu.cerrarPantalla(event);
    }

    @FXML
    void abrirNotificaciones(MouseEvent event) {
        PantallasMenu.abrirVentana("PantallaNotificaciones");
        PantallasMenu.cerrarPantalla(event);
    }

    @FXML
    void abrirPerfil(MouseEvent event) {
        PantallasMenu.abrirVentana("PantallaPerfil");
        PantallasMenu.cerrarPantalla(event);
    }

    @FXML
    void abrirRealizarSubasta(MouseEvent event) {
        PantallasMenu.abrirVentana("PantallaRealizarSubasta");
        PantallasMenu.cerrarPantalla(event);
    }

    @FXML
    void abririMetodoPago(MouseEvent event) {
        PantallasMenu.abrirVentana("PantallaMetodoPago");
        PantallasMenu.cerrarPantalla(event);
    }

    @FXML
    void accionBuscar(MouseEvent event) {
    }

    @FXML
    void irAtras(MouseEvent event) throws IOException {
        PantallasMenu.abrirVentana("PantallaSeleccionarCategoria");
        PantallasMenu.cerrarPantalla(event);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        controladorGeneral = new ControladorGeneral();
        desplegableTipoTarjeta.getItems().setAll(TipoTarjeta.values());
        //campoMontoAPagar.setText(String.valueOf(montoAPagar));
    }

    public PantallaMetodoPagoController getController() {
        return this;
    }

    @FXML
    void pagar(ActionEvent event) {

        boolean correcto = false;
        if (!campoApellido.getText().isBlank()
                && !campoCiudad.getText().isBlank()
                && !campoCodigoPostal.getText().isBlank()
                && !campoCodigoSeguridad.getText().isBlank()
                && !campoFechaExpiracion.getText().isBlank()
                && !campoNombre.getText().isBlank()
                && !campoTelefono.getText().isBlank()
                && !campoDireccion.getText().isBlank()
                && !campoNumeroTarjeta.getText().isBlank()) {
            correcto = true;
        }
        if (correcto) {
            PantallasMenu.abrirVentana("PantallaProteccionPago");
            controladorGeneral.pujaController.actualizarPujaComprador(puja);
        } else
            PantallasMenu.abrirVentana("PantallaErrorPago");
    }
}
