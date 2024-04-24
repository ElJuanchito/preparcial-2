package co.edu.uniquindio.preparcial.puntos;

import co.edu.uniquindio.preparcial.estructuras.pilas.SimpleStack;
import co.edu.uniquindio.preparcial.estructuras.pilas.Stack;

public class Punto5 {

    public static void main(String[] args) {
        String malo = "(6-7)/4]";
        String bueno = "[(1+2)*4]+5";
        System.out.println(estaBalanceado(malo));
    }

    //Escriba un método que reciba como parámetro una cadena de caracteres
    // y que usando una Pila determine si sus paréntesis,
    // llaves y corchetes están balanceados. Debe retornar un valor booleano.
    // Ejemplo: “(6-7)/4]” está mala. “[(1+2)*4]+5” está bien.
    public static boolean estaBalanceado(String cadena) {
        Stack<Integer> pila = new SimpleStack<>();
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == '(') pila.push(-1);
            if (cadena.charAt(i) == ')') pila.push(1);
            if (cadena.charAt(i) == '[') pila.push(-2);
            if (cadena.charAt(i) == ']') pila.push(2);
        }
        int resultado = 0;
        for(int i = 0, size = pila.size(); i < size; i++) {
            resultado+=pila.unstack();
        }
        return resultado == 0;
    }
}
