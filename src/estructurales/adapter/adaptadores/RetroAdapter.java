package estructurales.adapter.adaptadores;

import estructurales.adapter.mandos.Controller;
import estructurales.adapter.mandos.RetroJoystickController;

// ADAPTER - Clase adaptadora que adapta el RetroJoystick a lo que esperamos hacer
public class RetroAdapter implements Controller {

    public RetroJoystickController retroJoystick;

    public RetroAdapter(RetroJoystickController retroJoystick) {
        this.retroJoystick = retroJoystick;
    }


    @Override
    public void fire() {
        this.retroJoystick.pressB();
    }

    @Override
    public void jump() {
        this.retroJoystick.pressA();
    }

    @Override
    public String toString() {
        return this.retroJoystick.toString();
    }
}
