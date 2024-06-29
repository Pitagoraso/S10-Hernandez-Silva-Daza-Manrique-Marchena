package Iterator2;

import java.util.ArrayList;
import java.util.List;

public class Nodo {
    private String valor;
    private List<Nodo> hijos;

    public Nodo(String valor) {
        this.valor = valor;
        this.hijos = new ArrayList<>();
    }

    public String getValor() {
        return valor;
    }

    public List<Nodo> getHijos() {
        return hijos;
    }

    public void agregarHijo(Nodo nodo) {
        hijos.add(nodo);
    }
}
