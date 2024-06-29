package Iterator1;

import java.util.ArrayList;
import java.util.List;

public class CarritoDeCompras implements Colección {
    private List<Producto> productos;

    public CarritoDeCompras() {
        productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public List<Producto> getProductos() {
        return productos;
    }

    @Override
    public Iterador crearIterador() {
        return new IteradorDeProductos(this);
    }
}
