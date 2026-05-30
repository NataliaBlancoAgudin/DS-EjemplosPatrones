package creacion.factoryMethod.entities;

// CONCRETE_PRODUCT: Clase concreta Goomba que hereda de Enemy
public class Goomba implements Enemy {

    @Override
    public void updateLogic() {
        System.out.println(" > Hi! I'm a Goomba");
    }
}
