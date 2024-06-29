package Interpreter2;

public class Or extends OperadorAbstracto {
    public Or(Expresion izquierda, Expresion derecha) {
        super(izquierda, derecha);
    }

    @Override
    public boolean evalua() {
        return izquierda.evalua() || derecha.evalua();
    }
}
