package creacion.prototype.prototipos;

public interface Enemigo {
    Enemigo clonar();
    void atacar();
    void setArma(String arma);
    void setTipo(String tipo);
    void setVida(int vida);
}
