package Interpreter2;

public abstract class ElementoTerminal extends Expresion {
    protected boolean valor;

    public ElementoTerminal(boolean valor) {
        this.valor = valor;
    }

    @Override
    public boolean evalua() {
        return valor;
    }
}
