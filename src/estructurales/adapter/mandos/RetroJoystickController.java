package estructurales.adapter.mandos;

// ADAPTEE - Clase que necesita adaptarse a la interfaz que tenemos
public class RetroJoystickController {

    public void pressA(){
        System.out.println("🕹️ [Retro] Saltando en 8-bits (Botón A)");
    }

    public void pressB(){
        System.out.println("🕹️ [Retro] Disparando píxeles (Botón B)");
    }

    @Override
    public String toString(){
        return "RetroJoystick";
    }
}
