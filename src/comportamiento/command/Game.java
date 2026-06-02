package comportamiento.command;

import comportamiento.command.comandos.Command;
import comportamiento.command.comandos.DispararCommand;
import comportamiento.command.comandos.SaltarCommand;
import comportamiento.command.invoker.Boton;
import comportamiento.command.receiver.LogicaJuego;

public class Game {

    public void init() {
        System.out.println("=== INICIALIZANDO EL SISTEMA DE CONTROL ===");

        LogicaJuego logicaJuego = new LogicaJuego();

        Command dispararComando = new DispararCommand(logicaJuego);
        Command saltarComando = new SaltarCommand(logicaJuego);

        Boton botonA = new Boton(dispararComando);
        Boton botonB = new Boton(saltarComando);

        System.out.println("=== PARTIDA INICIADA (Simulación de Inputs) ===");

        botonA.click();
        botonB.click();
    }
}
