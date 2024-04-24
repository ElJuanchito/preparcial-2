package co.edu.uniquindio.preparcial.estructuras.pilas;

import co.edu.uniquindio.preparcial.estructuras.listas.SimpleList;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class SimpleStack<T extends Comparable<T>> implements Stack<T> {

	private Node<T> peek;
	private int size;

	@Override
	public int size(){
		return size;
	}

	@Override
	public boolean isEmpty() {
		return peek == null;
	}

	@Override
	public T peek() {
		return peek.getElement();
	}

	@Override
	public void push(T value) {
		var node = new Node<T>(value);
		if (!isEmpty()) node.setNext(peek);
		peek = node;
		size ++;
	}

	@Override
	public T unstack() {
		T element = peek.getElement();
		peek = peek.getNext();
		size--;
		return element;
	}

	@Override
	public void clear() {
		peek = null;
		size = 0;
	}

	private synchronized String getValuesString() {
		StringBuilder sb = new StringBuilder("[");
		Stack<T> aux = new SimpleStack<T>();
		while (!this.isEmpty()) {
			T value = this.unstack();
			sb.append(value.toString());
			if (!this.isEmpty())
				sb.append(", ");
			aux.push(value);
		}
		while (!aux.isEmpty())
			this.push(aux.unstack());
		sb.append("]");
		return sb.toString();
	}

	@Override
	public String toString() {
		return getValuesString();
	}

	@Override
	public Iterator<T> iterator() {
		return new SimpleStackIterator(this.peek);
	}

	private class SimpleStackIterator implements Iterator<T>{

		private Node<T> current;

		SimpleStackIterator(Node<T> node){this.current = node;}
		@Override
		public boolean hasNext() {
			return current != null;
		}

		@Override
		public T next() {
			if(!hasNext()) throw new NoSuchElementException();
			T value = current.getElement();
			current = current.getNext();
			return value;
		}
	}
}
