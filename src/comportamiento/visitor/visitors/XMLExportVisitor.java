package comportamiento.visitor.visitors;

import comportamiento.visitor.elements.Castillo;
import comportamiento.visitor.elements.Ogro;

public class XMLExportVisitor implements Visitor <Object, Object> {

    @Override
    public Object visit(Ogro o, Object p) {
        System.out.println("Se está generando el XML para " + o.toString());
        return null;
    }

    @Override
    public Object visit(Castillo c, Object p) {
        System.out.println("Se está generando el XML para " + c.toString());
        return null;
    }
}
