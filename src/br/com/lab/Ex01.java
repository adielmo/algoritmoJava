package br.com.lab;

import java.util.Scanner;

import br.com.pilhas.Pilha;

public class Ex01 {
	public static void main(String[] args) {
		Pilha<Integer> pilha = new Pilha<>();

		Scanner scanner = new Scanner(System.in);
		Integer num;

		for (int i = 0; i <= 10; i++) {
			System.out.println("Digite o valor:");
			num = scanner.nextInt();
			if (num % 2 == 0) {
				pilha.empilha(num);
				System.out.println("Empilhando o número " + num);
			} else {

				System.out.println(!pilha.estavazia() ? pilha.desempilhar() : "Pilha está vazia!");

			}
		}

		for (int i = 0; i < pilha.tamanho(); i++) {
			System.out.println(pilha.desempilhar());

		}

	}

}
