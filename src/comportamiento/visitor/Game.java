package comportamiento.visitor;

import comportamiento.visitor.elements.ElementoJuego;
import comportamiento.visitor.visitors.Visitor;

import java.util.ArrayList;
import java.util.List;

public class Game {
    List<ElementoJuego> elementosJuego;

    public Game() {
        elementosJuego = new ArrayList<>();
    }

    public void agregarElementoJuego(ElementoJuego elemento) {
        elementosJuego.add(elemento);
    }

    public <RT,PT> void exportarElementosJuego(Visitor<RT,PT> exportador){
        for(ElementoJuego elemento : elementosJuego){
            elemento.accept(exportador);
        }
    }

    public String mostrarElementosJuego(){
        StringBuilder resultado = new StringBuilder();
        for(ElementoJuego elemento : elementosJuego){
            resultado.append(elemento.toString());
            resultado.append("\n");
        }
        return resultado.toString();
    }
}
