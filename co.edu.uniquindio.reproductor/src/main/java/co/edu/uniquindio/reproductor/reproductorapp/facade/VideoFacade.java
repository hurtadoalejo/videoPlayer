package co.edu.uniquindio.reproductor.reproductorapp.facade;

import co.edu.uniquindio.reproductor.reproductorapp.model.Codec;
import co.edu.uniquindio.reproductor.reproductorapp.model.VideoDecoder;
import co.edu.uniquindio.reproductor.reproductorapp.model.VideoFile;
import co.edu.uniquindio.reproductor.reproductorapp.model.VideoPlayer;

public class VideoFacade {

    public VideoFacade() {
    }

    public String reproducir(String fileName, String type) {
        VideoFile videoFile = new VideoFile();
        Codec codec = new Codec();
        VideoDecoder videoDecoder = new VideoDecoder();
        VideoPlayer videoPlayer = new VideoPlayer();
        return videoFile.load(fileName) + "\n" + codec.codec(type) + "\n" +
                videoDecoder.decode(fileName, type) + "\n" + videoPlayer.play(fileName);
    }
}