package co.edu.uniquindio.reproductor.reproductorapp.model;

public class VideoFile {
    private String filename;
    public VideoFile () {}
    public String load(String filename) {
        return ("Archivo de video: " + filename + " cargado.");
    }
}
