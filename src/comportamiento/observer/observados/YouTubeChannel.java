package comportamiento.observer.observados;

import comportamiento.observer.observadores.Observer;

import java.util.ArrayList;
import java.util.List;

// SUBJECT
public class YouTubeChannel {

    private final List<Observer> suscriptores;
    private final List<String> videosSubidos;
    private final String nombre;

    public YouTubeChannel(String nombre) {
        this.nombre = nombre;
        suscriptores = new ArrayList<>();
        videosSubidos = new ArrayList<>();
    }

    public void attach(Observer observer) {
        suscriptores.add(observer);
    }

    public void detach(Observer observer) {
        suscriptores.remove(observer);
    }

    private void notifyObservers(){
        for(Observer observer : suscriptores){
            observer.update();
        }
    }

    public String getUltimoVideo(){
        return videosSubidos.getLast();
    }

    public void subirVideo(String titulo){
        videosSubidos.add(titulo);
        System.out.println("CANAL: Nuevo vídeo subido -> " + titulo);
        notifyObservers();
    }

    public String getSuscriptores(){
        StringBuilder suscriptor = new StringBuilder();
        for(Observer observer : suscriptores){
            suscriptor.append(observer.toString());
            suscriptor.append("\n");
        }
        return suscriptor.toString();
    }

    @Override
    public String toString() {
        return "YouTubeChannel [nombre= " + nombre + "]";
    }


}
