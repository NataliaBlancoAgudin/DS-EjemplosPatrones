package estructurales.decorator.decoradores;

import estructurales.decorator.Personaje;

public class AnilloPoder extends AccesorioDecorador{

    public AnilloPoder(Personaje personajeDecorado) {
        super(personajeDecorado);
    }

    @Override
    public int getAtaque() {
        return super.getAtaque() * 2;
    }

    @Override
    public String getDescripcion() {
        return super.getDescripcion() + " Tengo el Anillo del Poder! 💍";
    }
}
