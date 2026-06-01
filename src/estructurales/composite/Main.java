package estructurales.composite;

import estructurales.composite.components.complex.BigOctopusEnemy;
import estructurales.composite.components.Entity;
import estructurales.composite.components.simple.OctopusMainBody;

public class Main {

    public static void main(String[] args){
        System.out.println("Aparece un enemigo pequeño:");
        Entity octopus = new OctopusMainBody();
        octopus.logic();

        System.out.println("\n===========================\n");
        System.out.println("¡Aparece el Jefe Final!");
        Entity bigOctopus = new BigOctopusEnemy();
        bigOctopus.logic();

    }
}
