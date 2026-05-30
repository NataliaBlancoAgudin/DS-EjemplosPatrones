package creacion.factoryMethod.entities;

// CONCRETE_PRODUCT: Clase concreta Boo que hereda de Enemy
public class Boo implements Enemy {

    @Override
    public void updateLogic() {
        System.out.println(" > Hi! I'm a Boo");
    }
}
