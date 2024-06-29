package Iterator1;

public class Cliente {
    public static void main(String[] args) {
        CarritoDeCompras carrito = new CarritoDeCompras();
        carrito.agregarProducto(new Producto("Manzana", 1.0));
        carrito.agregarProducto(new Producto("Naranja", 1.2));
        carrito.agregarProducto(new Producto("Banana", 0.8));

        Iterador iterador = carrito.crearIterador();
        while (iterador.tieneMas()) {
            Producto producto = iterador.obtenerSiguiente();
            System.out.println(producto.getNombre() + " - $" + producto.getPrecio());
        }
    }
}
