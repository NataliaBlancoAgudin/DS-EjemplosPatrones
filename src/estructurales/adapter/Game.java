package estructurales.adapter;

import estructurales.adapter.mandos.Controller;

public class Game {

    public void play(Controller controller) {
        System.out.println("--- Partida Iniciada con " + controller.toString() + " ---");
        controller.jump();
        controller.fire();
    }
}
