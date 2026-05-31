package comportamiento.strategy.strategies;

public class SpecialAttack implements AttackStrategy{

    @Override
    public void ejecutarAtaque() {
        System.out.println(" > Pokemon Ataque Especial!");
    }
}
