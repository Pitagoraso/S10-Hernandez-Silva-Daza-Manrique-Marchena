package Interpreter1;

public class Suma extends OperadorAbstracto {
    public Suma(Expresion izquierda, Expresion derecha) {
        super(izquierda, derecha);
    }

    @Override
    public int evalua() {
        return izquierda.evalua() + derecha.evalua();
    }
}
