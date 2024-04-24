package co.edu.uniquindio.preparcial.puntos;

import co.edu.uniquindio.preparcial.estructuras.listas.SimpleList;
import co.edu.uniquindio.preparcial.estructuras.pilas.SimpleStack;
import co.edu.uniquindio.preparcial.estructuras.pilas.Stack;

public class Punto1 {

    public static void main(String[] args) {
        SimpleList<Integer> list = new SimpleList<>();
        list.addTail(1);
        list.addTail(2);
        list.addTail(3);
        list.addTail(4);
        list.addTail(5);
        list.print();
        SimpleList<Integer>reverse = reverseList(list);
        reverse.print();
    }

    //Cree un método que reciba como parámetro una ListaSimple y retorne la misma Lista, pero invertida, use Pilas.

    public static <T extends Comparable<T>> SimpleList<T> reverseList(SimpleList<T> list){
        Stack<T> stack = new SimpleStack<>();
        SimpleList<T> reverseList = new SimpleList<>();
        for(T e : list){stack.push(e);}
        while(!stack.isEmpty()) reverseList.addTail(stack.unstack());
        return reverseList;
    }
}
