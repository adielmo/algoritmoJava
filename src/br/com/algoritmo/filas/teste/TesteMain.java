package br.com.algoritmo.filas.teste;

import br.com.algoritmo.filas.Fila;

public class TesteMain {
	public static void main(String[] args) {
		Fila<Integer> fila = new Fila<>();
		
	/*	System.out.println(fila.estavazia());
		System.out.println(fila.tamanho());*/
		fila.enfileira(3);
		fila.enfileira(89);
		fila.enfileira(45);
		fila.enfileira(100);
		fila.enfileira(9);
		fila.enfileira(23);
		
		System.out.println("Está vazia: " + fila.estavazia());
		System.out.println("Tamanho da fila: " + fila.tamanho());
		System.out.println(fila.toString());
		System.out.println("Espiar o 1º: " + fila.espiar());
		System.out.println("Remover o 1º da fila: " + fila.remover());
		System.out.println(fila.toString());
		System.out.println("Remover o 1º da fila: " + fila.remover());
		System.out.println(fila.toString());
		System.out.println("Remover o 1º da fila: " + fila.remover());
		System.out.println(fila.toString());
		System.out.println("Tamanho da fila: " + fila.tamanho());
		
	}

}
