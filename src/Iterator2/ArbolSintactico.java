package Iterator2;

public class ArbolSintactico implements Colección {
    private Nodo raiz;

    public ArbolSintactico(Nodo raiz) {
        this.raiz = raiz;
    }

    public Nodo getRaiz() {
        return raiz;
    }

    @Override
    public Iterador crearIterador() {
        return new IteradorDeNodos(this);
    }
}
