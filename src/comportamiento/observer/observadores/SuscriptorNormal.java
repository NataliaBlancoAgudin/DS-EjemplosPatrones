package comportamiento.observer.observadores;

import comportamiento.observer.observados.YouTubeChannel;

public class SuscriptorNormal implements Observer {

    private final String nombre;
    private final YouTubeChannel channel;

    public SuscriptorNormal(String nombre, YouTubeChannel channel) {
        this.nombre = nombre;
        this.channel = channel;
    }

    @Override
    public void update() {
        String ultimoVideo = channel.getUltimoVideo();
        System.out.println("👤 " + nombre + ": ¡Genial! Voy a ver " + ultimoVideo);
    }

    @Override
    public String toString() {
        return "SuscriptorNormal [nombre=" + nombre + ", channel=" + channel + "]";
    }
}
