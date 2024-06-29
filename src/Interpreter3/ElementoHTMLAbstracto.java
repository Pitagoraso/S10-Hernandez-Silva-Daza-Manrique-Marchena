package Interpreter3;

public abstract class ElementoHTMLAbstracto extends Expresion {
    protected Expresion contenido;

    public ElementoHTMLAbstracto(Expresion contenido) {
        this.contenido = contenido;
    }
}
