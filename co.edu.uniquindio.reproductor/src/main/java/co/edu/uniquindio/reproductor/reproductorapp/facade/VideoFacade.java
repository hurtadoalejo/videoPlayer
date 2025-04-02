package co.edu.uniquindio.reproductor.reproductorapp.facade;

import co.edu.uniquindio.reproductor.reproductorapp.model.Codec;
import co.edu.uniquindio.reproductor.reproductorapp.model.VideoDecoder;
import co.edu.uniquindio.reproductor.reproductorapp.model.VideoFile;
import co.edu.uniquindio.reproductor.reproductorapp.model.VideoPlayer;

public class VideoFacade {
    private Codec codec;
    private VideoDecoder videoDecoder;
    private VideoFile videoFile;
    private VideoPlayer videoPlayer;

    public VideoFacade() {
        codec = new Codec();
       videoDecoder = new VideoDecoder();
       videoFile = new VideoFile();
       videoPlayer = new VideoPlayer();
    }

    public String reproducir(String nombreArchivo) {
        VideoFile videoFile = new VideoFile();
        Codec codec = new Codec();
        String texto1 = videoFile.VideoFile(nombreArchivo);
        String texto2 = codec.Codec("mp4");
        VideoDecoder decoder = new VideoDecoder();
        VideoPlayer videoPlayer = new VideoPlayer();
        String texto3 = decoder.decode(videoFile, codec);
        String texto4 = videoPlayer.play(videoFile);
        String ultimaCadena = texto1 + texto2 + texto3 + texto4;
        return ultimaCadena;
    }
}
