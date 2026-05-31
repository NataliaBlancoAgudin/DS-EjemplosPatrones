package comportamiento.strategy;

import comportamiento.strategy.strategies.AttackStrategy;

public class Battle {

    private AttackStrategy strategy;

    public Battle(AttackStrategy strategy) {
        this.strategy = strategy;
    }

    public void setAttackStrategy(AttackStrategy strategy) {
        this.strategy = strategy;
    }

    public void computeBattle(){
        System.out.println("[SISTEMA DE BATALLA] El Pokémon se prepara para atacar...");

        strategy.ejecutarAtaque();
    }


}
