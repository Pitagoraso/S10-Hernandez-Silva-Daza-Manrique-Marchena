package Interpreter1;

public abstract class ElementoTerminal extends Expresion {
    protected int valor;

    public ElementoTerminal(int valor) {
        this.valor = valor;
    }

    @Override
    public int evalua() {
        return valor;
    }
}
