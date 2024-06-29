package Interpreter1;

public class Resta extends OperadorAbstracto {
    public Resta(Expresion izquierda, Expresion derecha) {
        super(izquierda, derecha);
    }

    @Override
    public int evalua() {
        return izquierda.evalua() - derecha.evalua();
    }
}
