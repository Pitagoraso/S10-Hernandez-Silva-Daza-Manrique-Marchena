package Iterator3;

import java.io.File;

public class Cliente {
    public static void main(String[] args) {
        DirectorioConcreto directorio = new DirectorioConcreto("ruta/al/directorio");

        Iterador iterador = directorio.crearIterador();
        while (iterador.tieneMas()) {
            File archivo = (File) iterador.obtenerSiguiente();
            System.out.println("Nombre de archivo: " + archivo.getName());
        }
    }
}
