package co.edu.uniquindio.reproductor.reproductorapp.model;

public class VideoFile {
    private String filename;
    public String VideoFile(String filename) {
        this.filename = filename;
        return ("Archivo de video: " + filename + " cargado.");
    }
}
