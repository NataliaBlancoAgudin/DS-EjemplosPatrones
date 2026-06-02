package comportamiento.command.invoker;

import comportamiento.command.comandos.Command;

public class Boton {
    private final Command command;

    public Boton(Command command) {
        this.command = command;
    }

    public void click(){
        command.execute();
    }
}
