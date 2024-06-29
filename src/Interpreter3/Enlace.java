package Interpreter3;

public class Enlace extends ElementoHTMLAbstracto {
    private String url;

    public Enlace(String url, Expresion contenido) {
        super(contenido);
        this.url = url;
    }

    @Override
    public String generaHTML() {
        return "<a href=\"" + url + "\">" + contenido.generaHTML() + "</a>";
    }
}
