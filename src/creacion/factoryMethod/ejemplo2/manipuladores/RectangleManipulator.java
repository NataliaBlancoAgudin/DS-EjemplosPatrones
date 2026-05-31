package creacion.factoryMethod.ejemplo2.manipuladores;

import creacion.factoryMethod.ejemplo2.figuras.Rectangle;

public class RectangleManipulator implements Manipulator {

    private Rectangle rectangle;

    public RectangleManipulator(Rectangle r) {
        this.rectangle = r;
    }

    @Override
    public void downClick() {
        System.out.println("Se ha seleccionado el rectangulo");
    }

    @Override
    public void drag() {
        System.out.println("Se está arrastrando el rectangulo");
    }

    @Override
    public void upClick() {
        System.out.println("Se ha soltado el rectangulo");
    }
}
