package comportamiento.visitor.elements;

import comportamiento.visitor.visitors.Visitor;

public class Castillo implements ElementoJuego{

    private final String nombre;

    public Castillo(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public <RT, PT> RT accept(Visitor<RT, PT> v) {
        return v.visit(this, null);
    }

    @Override
    public String toString() {
        return "🏰 Estas en el castillo: " + nombre;
    }
}
