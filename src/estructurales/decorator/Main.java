package estructurales.decorator;

import estructurales.decorator.bases.GuerreroBase;
import estructurales.decorator.decoradores.AnilloPoder;
import estructurales.decorator.decoradores.EspadaFuego;

public class Main {

    public static void main(String[] args) {
        System.out.println("=== ESCENARIO 1: El guerrero empieza desnudo ===");
        // 1. Creamos el personaje base puro
        Personaje guerreroSinNada = new GuerreroBase();

        System.out.println("Descripción: " + guerreroSinNada.getDescripcion());
        System.out.println("Ataque Total: " + guerreroSinNada.getAtaque()); // Debe dar 10


        System.out.println("\n=== ESCENARIO 2: Equipamos la Espada de Fuego ===");
        // 2. Envolvemos el guerrero base dentro del decorador de la espada
        Personaje guerreroConEspada = new EspadaFuego(guerreroSinNada);

        System.out.println("Descripción: " + guerreroConEspada.getDescripcion());
        System.out.println("Ataque Total: " + guerreroConEspada.getAtaque()); // Debe dar 10 + 10 = 20


        System.out.println("\n=== ESCENARIO 3: Añadimos el Anillo del Poder (La verdadera magia) ===");
        // 3. Volvemos a envolver al guerrero que YA tenía la espada dentro del anillo.
        // El anillo multiplica por 2 el ataque acumulado que venga de las capas interiores.
        Personaje guerreroSuperEquipado = new AnilloPoder(guerreroConEspada);

        System.out.println("Descripción: " + guerreroSuperEquipado.getDescripcion());
        System.out.println("Ataque Total: " + guerreroSuperEquipado.getAtaque()); // Debe dar (10 + 10) * 2 = 40


        System.out.println("\n=== ESCENARIO 4: El orden de los factores altera el producto ===");
        // OJO! ¿Qué pasa si se equipa primero el anillo y luego la espada?
        Personaje guerreroAnilloYDespuesEspada = new EspadaFuego(new AnilloPoder(new GuerreroBase()));

        System.out.println("Descripción: " + guerreroAnilloYDespuesEspada.getDescripcion());
        // Cálculo: (10 de base * 2 del anillo) + 10 de la espada = 30
        System.out.println("Ataque Total: " + guerreroAnilloYDespuesEspada.getAtaque());
    }
}
