package creacion.factoryMethod.ejemplo2.figuras;

import creacion.factoryMethod.ejemplo2.manipuladores.Manipulator;
import creacion.factoryMethod.ejemplo2.manipuladores.RectangleManipulator;

public class Rectangle implements Figure{

    @Override
    public void draw() {
        System.out.println("⏹️ Dibujando un Rectángulo en pantalla.");
    }

    @Override
    public Manipulator createManipulator() {
        return new RectangleManipulator(this);
    }
}
