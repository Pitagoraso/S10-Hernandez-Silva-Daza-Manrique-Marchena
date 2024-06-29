package Iterator3;

import java.io.File;

public class IteradorDeArchivos implements Iterador {
    private File[] archivos;
    private int posicion;

    public IteradorDeArchivos(File[] archivos) {
        if (archivos == null) {
            this.archivos = new File[0];  // Manejar el caso donde listFiles() devuelve null
        } else {
            this.archivos = archivos;
        }
        this.posicion = 0;
    }

    @Override
    public boolean tieneMas() {
        return posicion < archivos.length;
    }

    @Override
    public Object obtenerSiguiente() {
        return archivos[posicion++];
    }
}
