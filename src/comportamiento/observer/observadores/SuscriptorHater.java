package comportamiento.observer.observadores;

import comportamiento.observer.observados.YouTubeChannel;

public class SuscriptorHater implements Observer {

    private final YouTubeChannel channel;
    private final String nombre;

    public SuscriptorHater(String nombre, YouTubeChannel channel) {
        this.nombre = nombre;
        this.channel = channel;
    }

    @Override
    public void update() {
        String ultimoVideo = channel.getUltimoVideo();
        System.out.println("😡 Hater: " + nombre + " Voy a dar dislike a " + ultimoVideo);
    }

    @Override
    public String toString() {
        return "SuscriptorHater [nombre=" + nombre + ", channel=" + channel + "]";
    }
}
