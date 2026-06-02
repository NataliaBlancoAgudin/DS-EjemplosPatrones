package estructurales.adapter;

import estructurales.adapter.mandos.Controller;
import estructurales.adapter.adaptadores.RetroAdapter;
import estructurales.adapter.mandos.RetroJoystickController;
import estructurales.adapter.mandos.XboxController;

public class Main {

    public static void main(String[] args) {
        Game steamGame = new Game();

        // JUGADOR 1: Usa el mando moderno nativo
        Controller mandoXbox = new XboxController();
        System.out.println("Jugador 1 conecta su mando de Xbox:");
        steamGame.play(mandoXbox);

        System.out.println("\n===================================\n");

        // JUGADOR 2: Quiere usar su viejo joystick nostálgico
        RetroJoystickController viejoJoystick = new RetroJoystickController();
        // Lo envolvemos en el adaptador para que sea compatible con el juego
        Controller mandoRetroAdaptado = new RetroAdapter(viejoJoystick);

        System.out.println("Jugador 2 conecta su Joystick de los 90 mediante el adaptador:");
        steamGame.play(mandoRetroAdaptado);
    }
}
