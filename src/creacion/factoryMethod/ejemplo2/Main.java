package creacion.factoryMethod.ejemplo2;

import creacion.factoryMethod.ejemplo2.figuras.Figure;
import creacion.factoryMethod.ejemplo2.figuras.Rectangle;
import creacion.factoryMethod.ejemplo2.figuras.Star;
import creacion.factoryMethod.ejemplo2.manipuladores.Manipulator;

public class Main {

    public static void main(String[] args) {
        Figure figura1 = new Rectangle();
        Figure figura2 = new Star();

        System.out.println("--- 1. Dibujando el lienzo ---");
        figura1.draw();
        figura2.draw();

        System.out.println("\n--- 2. Interacción del Usuario ---");
        // Seleccionamos la figura 1
        Figure seleccionada = figura1;
        Manipulator herramientaActual = seleccionada.createManipulator();
        herramientaActual.downClick();
        herramientaActual.drag();
        herramientaActual.upClick();

        // Seleccionamos la figura 2
        seleccionada = figura2;
        herramientaActual = seleccionada.createManipulator();
        herramientaActual.downClick();
        herramientaActual.drag();
        herramientaActual.upClick();
    }
}