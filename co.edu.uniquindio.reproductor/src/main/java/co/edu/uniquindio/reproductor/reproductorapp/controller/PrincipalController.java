package co.edu.uniquindio.reproductor.reproductorapp.controller;

import co.edu.uniquindio.reproductor.reproductorapp.App;
import co.edu.uniquindio.reproductor.reproductorapp.facade.VideoFacade;

public class PrincipalController {
    private App app;
    private VideoFacade facade;

    public PrincipalController(App app) {
        this.app = app;
        facade = new VideoFacade();
    }

    public String playVideo(String fyleName){
        return facade.reproducir(fyleName, getTypeFile(fyleName));
    }

    private String getTypeFile(String fyleName){
        for (int i = 0; i < fyleName.length(); i++){
            if (fyleName.charAt(i) == '.'){
                return fyleName.substring(i);
            }
        }
        return "";
    }
}