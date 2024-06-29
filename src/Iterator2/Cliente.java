package Iterator2;

public class Cliente {
    public static void main(String[] args) {
        Nodo raiz = new Nodo("raiz");
        Nodo nodo1 = new Nodo("nodo1");
        Nodo nodo2 = new Nodo("nodo2");
        Nodo nodo3 = new Nodo("nodo3");
        Nodo nodo4 = new Nodo("nodo4");

        raiz.agregarHijo(nodo1);
        raiz.agregarHijo(nodo2);
        nodo1.agregarHijo(nodo3);
        nodo1.agregarHijo(nodo4);

        ArbolSintactico arbol = new ArbolSintactico(raiz);

        Iterador iterador = arbol.crearIterador();
        while (iterador.tieneMas()) {
            Nodo nodo = iterador.obtenerSiguiente();
            System.out.println(nodo.getValor());
        }
    }
}
