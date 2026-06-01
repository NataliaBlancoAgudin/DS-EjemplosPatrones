package estructurales.composite.components.simple;

import estructurales.composite.components.Entity;

// LEAF: Clase Concreta Leaf (objeto individual)
public class WaterRightLeg implements Entity {

    @Override
    public void logic() {
        System.out.println("💧 Pierna Derecha: ¡Lanzando chorro de agua!");
    }
}
