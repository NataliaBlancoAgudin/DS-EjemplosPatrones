package comportamiento.state.estados;

import comportamiento.state.Mario;

// CONCRETE STATE C
public class EstadoSuper implements MarioState{

    @Override
    public void recibirDano(Mario context) {
        System.out.println("¡Auch! Me hago pequeñito...");
        context.setEstado(new EstadoPequeno());
    }

    @Override
    public void pulsarBotonAccion() {
        System.out.println("🏃🏻‍♂️‍➡️🏃🏻‍♂️‍➡️ Corre corre super rápido!");
    }

    @Override
    public void cogerFlorFuego(Mario context) {
        System.out.println("🏵️ ¡Mario encuentra una flor! Transformándose en Mario Fuego...");
        context.setEstado(new EstadoFuego());
    }
}
