package estructurales.decorator.decoradores;

import estructurales.decorator.Personaje;

public abstract class AccesorioDecorador implements Personaje {

    protected Personaje personajeDecorado;

    public AccesorioDecorador(Personaje personajeDecorado) {
        this.personajeDecorado = personajeDecorado;
    }

    @Override
    public int getAtaque(){
        return personajeDecorado.getAtaque();
    }

    @Override
    public String getDescripcion(){
        return personajeDecorado.getDescripcion();
    }
}
