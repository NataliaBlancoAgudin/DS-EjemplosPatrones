package creacion.factoryMethod.ejemplo2.figuras;

import creacion.factoryMethod.ejemplo2.manipuladores.Manipulator;

public interface Figure {
    void draw();
    Manipulator createManipulator();
}
