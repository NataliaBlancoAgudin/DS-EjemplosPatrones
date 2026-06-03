package comportamiento.observer;

import comportamiento.observer.observadores.Observer;
import comportamiento.observer.observadores.SuscriptorHater;
import comportamiento.observer.observadores.SuscriptorNormal;
import comportamiento.observer.observados.YouTubeChannel;

public class Main {

    public static void main(String[] args) {
        // Creamos nuestro canal
        YouTubeChannel channel = new YouTubeChannel("Natii");

        // Creamos los suscriptores
        Observer juan = new SuscriptorNormal("Juan", channel);
        Observer maria = new SuscriptorNormal("Maria", channel);
        Observer jose = new SuscriptorHater("Jose", channel);

        // Se suscriben a nuestro canal
        channel.attach(juan);
        channel.attach(maria);
        channel.attach(jose);

        System.out.println("=== MI PRIMER CANAL DE YOUTUBE! ===");
        System.out.println("¿Cuántos suscriptores tendré?");
        System.out.println(channel.getSuscriptores());
        // Subimos nuestro primer video
        channel.subirVideo("Mi primer video en YouTube!");

        // El hater se sale del canal
        channel.detach(jose);

        // Miramos lso suscriptores que tengo
        System.out.println("\n=== ¿Cuántos suscriptores tendré después de mi primer video? ===");
        System.out.println(channel.getSuscriptores());
    }
}
