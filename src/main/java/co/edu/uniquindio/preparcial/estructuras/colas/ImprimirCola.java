package co.edu.uniquindio.preparcial.estructuras.colas;

import java.util.Iterator;

public class ImprimirCola {

	public static void main(String[] args) {
//		Cola<Persona> cola = new Cola<Persona>();
//		cola.encolar(new Persona("Pepe", "1"));
//		cola.encolar(new Persona("Josue", "2"));
//		cola.encolar(new Persona("Juan", "3"));
//		cola.encolar(new Persona("Pepa", "4"));
//		
//		cola.encolarEn(2, new Persona("Popo", "5"));
//		
//		imprimirCola(cola);
//		//System.out.println("HOlaaa");
//		//eliminarPersona(cola, "P");
//		//imprimirCola(cola);

		Queue<Oveja> establo1 = new Queue<Oveja>();
		establo1.encolar(new Oveja("Ovejita1", 15));
		establo1.encolar(new Oveja("Ovejita2", 13));
		establo1.encolar(new Oveja("Ovejita3", 30));
		establo1.encolar(new Oveja("Ovejita4", 20));
		establo1.encolar(new Oveja("Ovejita5", 10));

		Queue<Oveja> establo2 = new Queue<Oveja>();
		establo2.encolar(new Oveja("Ovejota1", 43));
		establo2.encolar(new Oveja("Ovejota2", 112));
		establo2.encolar(new Oveja("Ovejota3", 12));
		establo2.encolar(new Oveja("Ovejota4", 13));

	}

	public static <E> void imprimirCola(Queue<E> queue) {
		Iterator<E> iterador = queue.iterator();
		while (iterador.hasNext())
			System.out.println(iterador.next());
	}

	public static void eliminarPersona(Queue<Persona> queue, String inicial) {
		int tamano = queue.getSize();
		if (queue.estaVacia())
			return;
		for (int i = 0; i <= tamano; i++) {
			Persona persona = queue.desencolar();
			if (!persona.getNombre().startsWith(inicial))
				queue.encolar(persona);
		}
	}

	public static Queue<Oveja> ordenarOvejas(Queue<Oveja> establo) {
		Queue<Oveja> aux1 = new Queue<Oveja>();
		Queue<Oveja> aux2 = new Queue<Oveja>();

		return ordernarOvejasAux(establo, aux1, aux2);
	}

	private static Queue<Oveja> ordernarOvejasAux(Queue<Oveja> establo, Queue<Oveja> aux1, Queue<Oveja> aux2) {
		return null;
		
	}
}
