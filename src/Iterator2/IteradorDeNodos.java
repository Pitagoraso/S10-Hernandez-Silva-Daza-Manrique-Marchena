package Iterator2;

import java.util.Stack;

public class IteradorDeNodos implements Iterador {
    private Stack<Nodo> pila;

    public IteradorDeNodos(ArbolSintactico arbol) {
        this.pila = new Stack<>();
        if (arbol.getRaiz() != null) {
            this.pila.push(arbol.getRaiz());
        }
    }

    @Override
    public Nodo obtenerSiguiente() {
        Nodo actual = pila.pop();
        for (Nodo hijo : actual.getHijos()) {
            pila.push(hijo);
        }
        return actual;
    }

    @Override
    public boolean tieneMas() {
        return !pila.isEmpty();
    }
}
