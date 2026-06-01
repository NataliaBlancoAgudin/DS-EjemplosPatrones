package estructurales.composite.components.simple;

import estructurales.composite.components.Entity;

// LEAF: Clase Concreta Leaf (objeto individual)
public class FireLeftLeg implements Entity {

    @Override
    public void logic() {
        System.out.println("🔥 Pierna Izquierda: ¡Disparando fuego!");
    }
}
