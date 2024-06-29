package Iterator3;

import java.io.File;

public class DirectorioConcreto implements Directorio {
    private File directorio;

    public DirectorioConcreto(String ruta) {
        this.directorio = new File(ruta);
    }

    @Override
    public Iterador crearIterador() {
        File[] archivos = directorio.listFiles();
        if (archivos == null) {
            System.out.println("El directorio especificado no existe o no se puede leer.");
            archivos = new File[0];  // Manejar el caso donde listFiles() devuelve null
        }
        return new IteradorDeArchivos(archivos);
    }
}
