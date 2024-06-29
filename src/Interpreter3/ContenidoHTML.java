package Interpreter3;

public abstract class ContenidoHTML extends Expresion {
    protected String texto;

    public ContenidoHTML(String texto) {
        this.texto = texto;
    }

    @Override
    public String generaHTML() {
        return texto;
    }
}
