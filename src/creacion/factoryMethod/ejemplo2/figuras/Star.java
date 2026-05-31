package creacion.factoryMethod.ejemplo2.figuras;

import creacion.factoryMethod.ejemplo2.manipuladores.Manipulator;
import creacion.factoryMethod.ejemplo2.manipuladores.StarManipulator;

public class Star implements Figure{
    @Override
    public void draw() {
        System.out.println("✨ Dibujando una Estrella en pantalla.");
    }

    @Override
    public Manipulator createManipulator() {
        return new StarManipulator(this);
    }
}
