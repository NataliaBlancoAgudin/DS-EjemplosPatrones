package creacion.factoryMethod.entities;

// CONCRETE_PRODUCT: Clase concreta Koopa que hereda de Enemy
public class Koopa implements Enemy {

    @Override
    public void updateLogic() {
        System.out.println(" > Hi! I'm a Koopa");
    }
}
