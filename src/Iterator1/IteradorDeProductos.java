package Iterator1;

import java.util.List;

public class IteradorDeProductos implements Iterador {
    private CarritoDeCompras coleccion;
    private int estadoIteracion;

    public IteradorDeProductos(CarritoDeCompras coleccion) {
        this.coleccion = coleccion;
        this.estadoIteracion = 0;
    }

    @Override
    public Producto obtenerSiguiente() {
        return coleccion.getProductos().get(estadoIteracion++);
    }

    @Override
    public boolean tieneMas() {
        return estadoIteracion < coleccion.getProductos().size();
    }
}
