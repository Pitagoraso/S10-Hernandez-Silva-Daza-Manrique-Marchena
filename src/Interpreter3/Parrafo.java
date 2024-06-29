package Interpreter3;

public class Parrafo extends ElementoHTMLAbstracto {
    public Parrafo(Expresion contenido) {
        super(contenido);
    }

    @Override
    public String generaHTML() {
        return "<p>" + contenido.generaHTML() + "</p>";
    }
}
