package co.edu.uniquindio.reproductor.reproductorapp.model;

public class VideoDecoder {
    public VideoDecoder() {}
    public String decode(String fileName, String type) {
        return ("Decodificando " + fileName + " usando " + type + "...");
    }
}