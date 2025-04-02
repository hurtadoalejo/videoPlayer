package co.edu.uniquindio.reproductor.reproductorapp.model;

public class VideoDecoder {
    public String decode(VideoFile file, Codec codec) {
        return ("Decodificando " + file + " usando " + codec + "...");
    }
}