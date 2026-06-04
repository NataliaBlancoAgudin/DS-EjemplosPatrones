package creacion.prototype.prototipos;

public class Goblin implements Enemigo{

    String tipo;
    int vida;
    String arma;

    public Goblin(String tipo, int vida, String arma) {
        this.tipo = tipo;
        this.vida = vida;
        this.arma = arma;
    }

    public Goblin(Goblin goblinOriginal){
        this.tipo = goblinOriginal.tipo;
        this.vida = goblinOriginal.vida;
        this.arma = goblinOriginal.arma;
    }

    @Override
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public void setVida(int vida) {
        this.vida = vida;
    }

    @Override
    public void setArma(String arma) {
        this.arma = arma;
    }

    @Override
    public Enemigo clonar() {
        return new Goblin(this);
    }

    @Override
    public void atacar() {
        System.out.println("👹 [" + tipo + "] Ataca con " + arma + " (Vida: " + vida + ")");
    }
}
