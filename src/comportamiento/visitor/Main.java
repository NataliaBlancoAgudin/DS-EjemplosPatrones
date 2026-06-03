package comportamiento.visitor;

import comportamiento.visitor.elements.Castillo;
import comportamiento.visitor.elements.ElementoJuego;
import comportamiento.visitor.elements.Ogro;
import comportamiento.visitor.visitors.JSONExportVisitor;
import comportamiento.visitor.visitors.XMLExportVisitor;

public class Main {

    public static void main(String[] args) {

        // 1. Creamos la estructura de objetos concretos
        Game game = new Game();

        // 2. Creamos los objetos concretos
        ElementoJuego ogro = new Ogro("Sherk");
        ElementoJuego castillo = new Castillo("Castillo de la Princesa");

        // 3. Los añadimos a la estructura
        game.agregarElementoJuego(ogro);
        game.agregarElementoJuego(castillo);

        //Comprobamos los elementos que hay en el juego
        System.out.println(game.mostrarElementosJuego());

        // 4. Ahora que tenemos los elementos en la estructura, los exportamos en un XML
        System.out.println("=== EXPORTAR ELEMENTOS A XML ===");
        game.exportarElementosJuego(new XMLExportVisitor());

        System.out.println("\n=== EXPORTAR ELEMENTOS A JSON ===");
        game.exportarElementosJuego(new JSONExportVisitor());
    }
}
