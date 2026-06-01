package comportamiento.state;

import comportamiento.state.estados.EstadoPequeno;
import comportamiento.state.estados.MarioState;

// CONTEXT
public class Mario {

    private MarioState estado;

    public Mario(){
        this.estado = new EstadoPequeno();
    }

    public void setEstado(MarioState estado){
        this.estado = estado;
    }

    public void recibirDano(){
        this.estado.recibirDano(this);
    }

    public void pulsarBotonAccion(){
        this.estado.pulsarBotonAccion();
    }

    public void cogerFlorFuego(){
        this.estado.cogerFlorFuego(this);
    }
}
