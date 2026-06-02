package comportamiento.command.comandos;

import comportamiento.command.receiver.LogicaJuego;

public class DispararCommand implements Command {

    LogicaJuego logica;

    public DispararCommand(LogicaJuego logica) {
        this.logica = logica;
    }

    @Override
    public void execute() {
        logica.disparar();
    }
}
