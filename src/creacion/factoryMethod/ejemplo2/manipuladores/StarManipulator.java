package creacion.factoryMethod.ejemplo2.manipuladores;

import creacion.factoryMethod.ejemplo2.figuras.Star;

public class StarManipulator implements Manipulator {

    private Star star;

    public StarManipulator(Star star) {
        this.star = star;
    }

    @Override
    public void downClick() {
        System.out.println("Se ha seleccionado la estrella");
    }

    @Override
    public void drag() {
        System.out.println("Se está arrastrando la estrella");
    }

    @Override
    public void upClick() {
        System.out.println("Se ha soltado la estrella");
    }
}
