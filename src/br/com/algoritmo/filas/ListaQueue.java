package br.com.algoritmo.filas;

import java.util.LinkedList;
import java.util.Queue;

public class ListaQueue {
	
	public static void main(String[] args) {
		
		Queue<Integer> fila = new LinkedList<>();
		
		fila.add(3);
		fila.add(98);
		fila.add(65);
		fila.add(76);
		
		System.out.println(fila);
		System.out.println(fila.peek());
		System.out.println(fila);
		System.out.println(fila.remove());
		System.out.println(fila);
		System.out.println(fila.remove());
		System.out.println(fila);
		System.out.println(fila.size());
	}

}
