package comportamiento.visitor.visitors;

import comportamiento.visitor.elements.Castillo;
import comportamiento.visitor.elements.Ogro;

public class JSONExportVisitor implements Visitor<Object, Object> {

    @Override
    public Object visit(Ogro o, Object p) {
        System.out.println("Se está generando el JSON para " + o.toString());
        return null;
    }

    @Override
    public Object visit(Castillo c, Object p) {
        System.out.println("Se está generando el JSON para " + c.toString());
        return null;
    }
}
