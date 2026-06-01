package comportamiento.state.estados;

import comportamiento.state.Mario;

// CONCRETE STATE B
public class EstadoFuego implements MarioState{

    @Override
    public void recibirDano(Mario context) {
        System.out.println("¡Auch! Pierdo el poder");
        context.setEstado(new EstadoPequeno());
    }

    @Override
    public void pulsarBotonAccion() {
        System.out.println("🔥 ¡Bola de fuego!");
    }

    @Override
    public void cogerFlorFuego(Mario context) {
        System.out.println("🏵️ Ya tienes fuego");
    }
}
