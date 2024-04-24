package co.edu.uniquindio.preparcial.puntos;

import co.edu.uniquindio.preparcial.estructuras.pilas.SimpleStack;
import co.edu.uniquindio.preparcial.estructuras.pilas.Stack;

import java.util.Iterator;

public class Cola2Pilas<T extends Comparable<T>> {
    private Stack<T> pila1;
    private Stack<T> pila2;
    private int size;

    public Cola2Pilas() {
        pila1 = new SimpleStack<T>();
        pila2 = new SimpleStack<T>();
    }

    public void Enqueue(T element) {
        pila1.push(element);
        size++;
    }

    public T Dequeue() {
        while(!pila1.isEmpty()) pila2.push(pila1.unstack());
        T element = pila2.unstack();
        while(!pila2.isEmpty()) pila1.push(pila2.unstack());
        size --;
        return element;
    }

    public void print(){
        int tam = size;
        while(tam != 0){
            System.out.println(Dequeue());
            tam--;
        }
    }
}
