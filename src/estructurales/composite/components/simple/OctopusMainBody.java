package estructurales.composite.components.simple;

import estructurales.composite.components.Entity;

// LEAF: Clase Concreta Leaf (objeto individual)
public class OctopusMainBody implements Entity {

    @Override
    public void logic() {
        System.out.println("🐙 Cuerpo Principal: ¡Temedme, soy el Gran Pulpo!");
    }
}
