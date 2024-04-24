package co.edu.uniquindio.preparcial.puntos;

import co.edu.uniquindio.preparcial.estructuras.colas.Queue;
import co.edu.uniquindio.preparcial.estructuras.pilas.SimpleStack;
import co.edu.uniquindio.preparcial.estructuras.pilas.Stack;

public class Punto2 {



    public static void main(String[] args) {
        Stack<Integer> stack = new SimpleStack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.push(8);
        stack.push(9);
        stack.push(10);
        stack.push(11);
        stack.push(12);
        stack.push(13);
        stack.push(14);
        stack.push(15);

        Queue<Integer> culote = colasDePrimos(stack);
        culote.printListForwards();
    }

    ///Se tiene una pila de enteros positivos. Con las operaciones básicas
    // de pilas y colas escribir un método para poner todos
    // los elementos primos de la pila en la cola.
    public static Queue<Integer> colasDePrimos(Stack<Integer> stack){
        Queue<Integer> colota = new Queue<>();
        while(!stack.isEmpty()){
            int element = stack.unstack();
            if(isPrime(element)) colota.encolar(element);
        }
        return colota;
    }

    private static boolean isPrime(int number){
        for(int i = 2; i <= Math.sqrt(number); i++) if(number % i == 0) return false;
        return true;
    }
}
