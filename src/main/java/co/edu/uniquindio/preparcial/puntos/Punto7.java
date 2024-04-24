package co.edu.uniquindio.preparcial.puntos;

import co.edu.uniquindio.preparcial.estructuras.colas.Queue;
import co.edu.uniquindio.preparcial.estructuras.pilas.SimpleStack;
import co.edu.uniquindio.preparcial.estructuras.pilas.Stack;

public class Punto7 {

    public static void main(String[] args) {
        Queue<Persona> personas = new Queue<>();
        personas.encolar(new Persona("Juancho", 20, Sexo.MASCULINO));
        personas.encolar(new Persona("Andres", 30, Sexo.MASCULINO));
        personas.encolar(new Persona("Pacho", 40, Sexo.MASCULINO));
        personas.encolar(new Persona("Pipe", 50, Sexo.MASCULINO));
        personas.encolar(new Persona("Esteban", 70, Sexo.MASCULINO));
        personas.encolar(new Persona("Sebastian", 10, Sexo.MASCULINO));
        personas.printListForwards();

        invertirColaPersonas(personas);

        personas.printListForwards();
    }

    public static void invertirColaPersonas(Queue<Persona> personas) {
        Stack<Persona> stack = new SimpleStack<>();
        while(!personas.estaVacia()) stack.push(personas.desencolar());
        while(!stack.isEmpty()) personas.encolar(stack.unstack());
    }


}
