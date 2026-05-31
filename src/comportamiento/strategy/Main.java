package comportamiento.strategy;

import comportamiento.strategy.strategies.AttackStrategy;
import comportamiento.strategy.strategies.PhysicalAttack;
import comportamiento.strategy.strategies.SpecialAttack;

public class Main {

    public static void main(String[] args) {
        AttackStrategy physicalAttack = new PhysicalAttack();
        AttackStrategy specialAttack = new SpecialAttack();

        System.out.println("--- INICIO DE LA BATALLA ---");

        Battle battle = new Battle(physicalAttack);

        battle.computeBattle();

        System.out.println("--- EL ENEMIGO USA REFLEJO (Aumenta defensa física) ---");
        System.out.println("[ENTRENADOR] ¡Cambia de estrategia! ¡Usa ataque especial!");

        battle.setAttackStrategy(specialAttack);
        battle.computeBattle();

        System.out.println("--- FIN DE LA BATALLA ---");
    }
}
