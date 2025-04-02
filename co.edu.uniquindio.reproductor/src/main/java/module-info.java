module co.edu.uniquindio.reproductor.reproductorapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens co.edu.uniquindio.reproductor.reproductorapp to javafx.fxml;
    exports co.edu.uniquindio.reproductor.reproductorapp;
    exports co.edu.uniquindio.reproductor.reproductorapp.viewController;
    opens co.edu.uniquindio.reproductor.reproductorapp.viewController to javafx.fxml;
}