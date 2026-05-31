package comportamiento.strategy.strategies;

public class PhysicalAttack implements AttackStrategy{

    @Override
    public void ejecutarAtaque() {
        System.out.println(" > Pokemon Ataque físico!");
    }
}
