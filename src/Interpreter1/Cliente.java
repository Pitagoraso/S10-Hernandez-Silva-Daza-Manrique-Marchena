package Interpreter1;

public class Cliente {
    public static void main(String[] args) {
        Expresion numero5 = new Numero(5);
        Expresion numero3 = new Numero(3);
        Expresion numero2 = new Numero(2);

        Expresion suma = new Suma(numero5, numero3);
        Expresion resta = new Resta(suma, numero2);

        int resultado = resta.evalua();
        System.out.println("Resultado: " + resultado);
    }
}
