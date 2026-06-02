package estructurales.adapter.mandos;

// CONCRETE CONTROLLER - Este no necesita adaptar nada
public class XboxController implements Controller {

    @Override
    public void fire() {
        System.out.println("💥 [Xbox] ¡Disparando con el gatillo RT!");
    }

    @Override
    public void jump() {
        System.out.println("🦘 [Xbox] ¡Saltando con el botón A!");
    }

    @Override
    public String toString(){
        return "Xbox";
    }
}
