package comportamiento.state.estados;

import comportamiento.state.Mario;

// CONCRETE STATE A
public class EstadoPequeno implements MarioState{

    @Override
    public void recibirDano(Mario context) {
        System.out.println("☠️ Game over");
    }

    @Override
    public void pulsarBotonAccion() {
        System.out.println("🏃🏻‍♂️‍➡️ Corre corre!");
    }

    @Override
    public void cogerFlorFuego(Mario context) {
        System.out.println("🏵️ ¡Mario encuentra una flor! Transformándose en Mario Fuego...");
        context.setEstado(new EstadoFuego());
    }
}
