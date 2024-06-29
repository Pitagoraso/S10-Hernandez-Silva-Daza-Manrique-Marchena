package Interpreter2;

public class Cliente {
    public static void main(String[] args) {
        Expresion verdadero = new Booleano(true);
        Expresion falso = new Booleano(false);

        Expresion andExpresion = new And(verdadero, falso);
        Expresion orExpresion = new Or(verdadero, falso);

        System.out.println("Resultado AND: " + andExpresion.evalua()); // Resultado: false
        System.out.println("Resultado OR: " + orExpresion.evalua()); // Resultado: true
    }
}
