package co.edu.uniquindio.reproductor.reproductorapp.viewController;

import java.net.URL;
import java.util.ResourceBundle;

import co.edu.uniquindio.reproductor.reproductorapp.facade.VideoFacade;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import co.edu.uniquindio.reproductor.reproductorapp.App;
import co.edu.uniquindio.reproductor.reproductorapp.viewController.PrincipalViewController;

public class PrincipalViewController {

    @FXML
    private App app;
    
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label lb_titulo;

    @FXML
    private TextField tf_1;

    @FXML
    private Label lb_nombreArchivo;

    @FXML
    private Pane pane_1;

    @FXML
    private Label lb_reproduciendo;

    @FXML
    private TextArea ta_1;

    @FXML
    private Button bt_reproducir;

    @FXML
    private Button bt_cargarArchivo;

    @FXML
    void onReproducir() {
        reproducir();
    }

    private void reproducir() {
        VideoFacade videoFacade = new VideoFacade();
        ta_1.setText(videoFacade.reproducir(ta_1.getText()));
    }

    @FXML
    void onCargarArchivo() {
        cargarArchivo();
    }

    private void cargarArchivo() {
    }

    public void setApp(App app){
        this.app = app;
    }

    @FXML
    void initialize() {
        assert lb_titulo != null : "fx:id=\"lb_titulo\" was not injected: check your FXML file 'principal.fxml'.";
        assert tf_1 != null : "fx:id=\"tf_1\" was not injected: check your FXML file 'principal.fxml'.";
        assert lb_nombreArchivo != null : "fx:id=\"lb_nombreArchivo\" was not injected: check your FXML file 'principal.fxml'.";
        assert pane_1 != null : "fx:id=\"pane_1\" was not injected: check your FXML file 'principal.fxml'.";
        assert lb_reproduciendo != null : "fx:id=\"lb_reproduciendo\" was not injected: check your FXML file 'principal.fxml'.";
        assert ta_1 != null : "fx:id=\"ta_1\" was not injected: check your FXML file 'principal.fxml'.";
        assert bt_reproducir != null : "fx:id=\"bt_reproducir\" was not injected: check your FXML file 'principal.fxml'.";
        assert bt_cargarArchivo != null : "fx:id=\"bt_cargarArchivo\" was not injected: check your FXML file 'principal.fxml'.";

    }
}
