package co.edu.uniquindio.preparcial.estructuras.pilas;

import java.util.Iterator;

public interface Stack<T> extends Iterable<T> {
	boolean isEmpty();
	T peek();
	void push(T value);
	T unstack();
	void clear();
	int size();
}
