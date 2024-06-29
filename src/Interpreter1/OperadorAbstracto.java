package Interpreter1;

public abstract class OperadorAbstracto extends Expresion {
    protected Expresion izquierda;
    protected Expresion derecha;

    public OperadorAbstracto(Expresion izquierda, Expresion derecha) {
        this.izquierda = izquierda;
        this.derecha = derecha;
    }
}
