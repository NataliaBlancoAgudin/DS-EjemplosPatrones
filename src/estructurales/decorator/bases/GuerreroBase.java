package estructurales.decorator.bases;

import estructurales.decorator.Personaje;

public class GuerreroBase implements Personaje {

    @Override
    public int getAtaque() {
        return 10;
    }

    @Override
    public String getDescripcion() {
        return "¡Hola! Soy el Guerrero!";
    }
}
