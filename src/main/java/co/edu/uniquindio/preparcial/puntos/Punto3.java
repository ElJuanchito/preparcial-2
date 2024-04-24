package co.edu.uniquindio.preparcial.puntos;

import co.edu.uniquindio.preparcial.estructuras.colas.Queue;

public class Punto3 {

    public static void main(String[] args) {
        Queue<Persona> personas = new Queue<>();
        personas.encolar(new Persona("Juancho", 20, Sexo.MASCULINO));
        personas.encolar(new Persona("Andres", 30, Sexo.MASCULINO));
        personas.encolar(new Persona("Pacho", 40, Sexo.MASCULINO));
        personas.encolar(new Persona("Pipe", 50, Sexo.MASCULINO));
        personas.encolar(new Persona("Esteban", 70, Sexo.MASCULINO));
        personas.encolar(new Persona("Sebastian", 10, Sexo.MASCULINO));
        personas.printListForwards();
        filtrarAdultos(personas);
        personas.printListForwards();

    }

    //Dada una Cola de Personas (nombre, edad, sexo),
    //escribir un método que quite de la cola a los hombres
    //cuya edad está entre los 30 y 50 años,
    //los demás elementos de la Cola deben quedar en el mismo orden
    //en el que estaban originalmente.
    public static void filtrarAdultos(Queue<Persona> personas){
        int size = personas.getSize();
        for(int i = 0; i < size; i++){
            var p = personas.desencolar();
            if(p.getEdad() < 30 || p.getEdad() > 50) personas.encolar(p);
        }
    }
}
