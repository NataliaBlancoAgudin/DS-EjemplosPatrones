package comportamiento.visitor.elements;

import comportamiento.visitor.visitors.Visitor;

public interface ElementoJuego {
    <RT,PT> RT accept(Visitor<RT, PT> v);
}
