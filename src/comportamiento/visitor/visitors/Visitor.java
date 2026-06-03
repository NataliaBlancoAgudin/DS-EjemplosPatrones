package comportamiento.visitor.visitors;

import comportamiento.visitor.elements.Castillo;
import comportamiento.visitor.elements.Ogro;

public interface Visitor<RT, PT> {
    RT visit(Ogro o, PT p);
    RT visit(Castillo c, PT p);
}
