package comportamiento.state.estados;

import comportamiento.state.Mario;

// STATE
public interface MarioState {

    void recibirDano(Mario context);
    void pulsarBotonAccion();
    void cogerFlorFuego(Mario context);
}
