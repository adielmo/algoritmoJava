package br.com.pilhas.teste;

import java.util.Random;

import br.com.pilhas.Pilha;

public class TestPilha {

	public static void main(String[] args) {
		Random rand = new Random();
		Pilha<Integer> pilha = new Pilha<Integer>();

		// System.out.println(pilha);
		// System.out.println("Tamanho: " + pilha.tamanho());

		for (int i = 1; i < 12; i++) {
			 pilha.empilha(rand.nextInt(78900));
			//pilha.empilha(i);
		}

		System.out.println(pilha);
		System.out.println("Tamanho: " + pilha.tamanho());		
		System.out.println(pilha.desempilhar());
		System.out.println(pilha.isEmpyt() ? "Pilha está vázia" : "Pilha não está vázia");
		System.out.println("Último da pilha: " + pilha.espiar());
		System.out.println(pilha);

	}

}
