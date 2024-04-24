package co.edu.uniquindio.preparcial.puntos;

public class Punto6 {


    public static void main(String[] args) {
        Cola2Pilas<Integer> cola = new Cola2Pilas<>();
        cola.Enqueue(4);
        cola.Enqueue(5);
        cola.Enqueue(15);
        cola.Enqueue(1);

        System.out.println(cola.Dequeue());
        System.out.println(cola.Dequeue());
        System.out.println(cola.Dequeue());
        System.out.println(cola.Dequeue());
    }

    //Implementación de una cola con dos pilas.
    // Crear una clase Cola2Pilas que implemente una cola utilizando dos pilas.
    // La cola debe ser capaz de realizar las operaciones enqueue y dequeue.

}
