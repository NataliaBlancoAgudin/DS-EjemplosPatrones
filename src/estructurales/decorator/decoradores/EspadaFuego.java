package estructurales.decorator.decoradores;

import estructurales.decorator.Personaje;

public class EspadaFuego extends AccesorioDecorador{

    public EspadaFuego(Personaje personajeDecorado) {
        super(personajeDecorado);
    }

    @Override
    public int getAtaque(){
        return personajeDecorado.getAtaque() + 10;
    }

    @Override
    public String getDescripcion() {
        return super.getDescripcion() + " Tengo la Espada de Fuego! 🔥";
    }
}
