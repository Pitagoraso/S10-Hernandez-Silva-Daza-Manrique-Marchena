package Interpreter3;

public class Cliente {
    public static void main(String[] args) {
        Expresion texto = new Texto("Haz clic aqui");
        Expresion enlace = new Enlace("https://www.ejemplo.com", texto);
        Expresion parrafo = new Parrafo(enlace);

        String html = parrafo.generaHTML();
        System.out.println(html);  // Salida: <p><a href="https://www.ejemplo.com">Haz clic aquí</a></p>
    }
}
