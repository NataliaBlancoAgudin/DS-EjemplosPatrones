package comportamiento.command.comandos;

import comportamiento.command.receiver.LogicaJuego;

public class SaltarCommand implements Command {

    private final LogicaJuego logica;

    public SaltarCommand(LogicaJuego logica) {
        this.logica = logica;
    }

    @Override
    public void execute() {
        logica.saltar();
    }
}
