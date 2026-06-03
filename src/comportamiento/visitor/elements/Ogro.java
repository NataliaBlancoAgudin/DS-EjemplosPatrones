package comportamiento.visitor.elements;

import comportamiento.visitor.visitors.Visitor;

public class Ogro implements ElementoJuego{
    String nombre;

    public Ogro(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "🧌 Hola! Soy el Ogro " + nombre;
    }

    @Override
    public <RT, PT> RT accept(Visitor<RT, PT> v) {
        return v.visit(this, null);
    }
}
