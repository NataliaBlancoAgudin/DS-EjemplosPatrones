package creacion.abstractFactory.bloqueInterrogante;

public class GameBoyBloqueInterrogante implements BloqueInterrogante {

    @Override
    public void spawnItem() {
        System.out.println("🧱 Ha aparecido un bloque Interrogante al estilo GameBoy!");
    }

    @Override
    public void golpear() {
        System.out.println("Has golpeado un Bloque Interrogante al estilo GameBoy!");
    }
}
