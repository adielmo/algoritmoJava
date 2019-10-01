package br.com.algoritmo.lab;

import java.util.Scanner;

import br.com.algoritmo.pilhas.Pilha;

public class Ex01 {
	public static void main(String[] args) {
		Pilha<Integer> pilha = new Pilha<>();

		Scanner scanner = new Scanner(System.in);
		Integer num;

		for (int i = 0; i <= 10; i++) {

			System.out.println("Digite o valor:");
			num = scanner.nextInt();

			if (num % 2 == 0) {
				System.out.println("Empilhando o número " + num);
				pilha.empilha(num);

			} else {
				
		Integer desempilhado = pilha.desempilhar();
				if (desempilhado == null) {
					System.out.println("Pilha está vazia!");
				} else {
					System.out.println("Número impar, desempilhando um elemento da pilha: " + desempilhado);
				}
			}
		}
		System.out.println("Desempilhado números da pilha");

		while (!pilha.estavazia()) {

			System.out.println("Número impar, desempilhando em elemento da pilha: " + pilha.desempilhar());

		}

		System.out.println("Todos elementos foram desempilhados.");

	}

}
