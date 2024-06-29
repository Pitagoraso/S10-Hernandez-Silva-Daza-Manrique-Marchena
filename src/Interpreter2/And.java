package Interpreter2;

public class And extends OperadorAbstracto {
    public And(Expresion izquierda, Expresion derecha) {
        super(izquierda, derecha);
    }

    @Override
    public boolean evalua() {
        return izquierda.evalua() && derecha.evalua();
    }
}
