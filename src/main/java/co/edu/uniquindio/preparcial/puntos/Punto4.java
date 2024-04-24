package co.edu.uniquindio.preparcial.puntos;

import co.edu.uniquindio.preparcial.estructuras.pilas.SimpleStack;
import co.edu.uniquindio.preparcial.estructuras.pilas.Stack;

public class Punto4 {

    public static void main(String[] args) {
        int decimal = 61;
        int binario = representacionBinaria(decimal);
        System.out.println(binario);
    }

    //Escriba un método que lea un número entero positivo
    // e imprima su representación binaria, use pilas o colas.
    // El método debe retornar un entero. Ejemplo:
    public static int representacionBinaria(int decimal){
        //dividir por 2 y obtener el residuo
        Stack<Integer> pila = new SimpleStack<>();
        while(decimal != 0){
            pila.push(decimal % 2);
            decimal/= 2;
        }
        System.out.println(pila);

        int binario = 0;
        int size = pila.size();
        for(int i = 0; i < size; i++){
            binario += pila.unstack();
            binario *= 10;
        }
        return binario;
    }
}
