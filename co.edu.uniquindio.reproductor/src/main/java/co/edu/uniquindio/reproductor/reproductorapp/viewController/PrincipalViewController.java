package co.edu.uniquindio.reproductor.reproductorapp.viewController;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ResourceBundle;

import co.edu.uniquindio.reproductor.reproductorapp.controller.PrincipalController;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import co.edu.uniquindio.reproductor.reproductorapp.App;

public class PrincipalViewController {

    PrincipalController principalController;

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
    void onPlay() {
        play();
    }

    private void play() {
        if (verifyTextField()){
            ta_1.setText(principalController.playVideo(tf_1.getText()));
            tf_1.clear();
        }
    }

    private boolean verifyTextField() {
        if (tf_1.getText().isBlank()){
            return false;
        }
        else{
            return true;
        }
    }

    @FXML
    void onLoadFile() {
        loadFile();
    }

    private void loadFile() {
        String selectedFile = openFileDialog();
        if (selectedFile != null) {
            ta_1.clear();
            tf_1.setText(getFileName(selectedFile));
        }
    }

    private String getFileName(String filePath) {
        if (filePath != null && !filePath.isEmpty()) {
            return new java.io.File(filePath).getName();
        }
        return null;
    }

    private String openFileDialog() {
        try {
            String command = "powershell -Command \"Add-Type -AssemblyName System.windows.forms; $ofd = New-Object System.Windows.Forms.OpenFileDialog; $ofd.Filter = 'Todos los archivos (*.*)|*.*'; $ofd.ShowDialog() | Out-Null; $ofd.FileName\"";
            Process process = Runtime.getRuntime().exec(command);
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));

            String filePath = reader.readLine();
            process.waitFor();

            return (filePath != null && !filePath.trim().isEmpty()) ? filePath.trim() : null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public void setApp(App app){
        this.app = app;
    }

    @FXML
    void initialize() {
        ta_1.setEditable(false);
        principalController = new PrincipalController(app);
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
