package br.com.algoritmo.lab;

import java.util.Scanner;

import br.com.algoritmo.pilhas.Pilha;

public class Ex02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Pilha<Integer> pilhaPar = new Pilha<>();
		Pilha<Integer> pilhaImpar = new Pilha<>();
		
		int num;
		
		for(int i=0; i < 15; i++) {
			System.out.println("Ditege o valor:");
			num = scanner.nextInt();
  if(num != 0) {
	if(num % 2 == 0) {
		
		System.out.println("Empilhando na pilha Par o número, " + num +  " !");
		pilhaPar.empilha(num);
	}else {
		
        System.out.println("Empilhando na pilha Impar o número, " + num +  " !");
        pilhaImpar.empilha(num);
		}		
		
		}else {
			Integer desempinhaPar = pilhaPar.desempilhar();
			Integer desempinhaImpar = pilhaImpar.desempilhar();
		
			if (desempinhaPar == null) {
				System.out.println("A pilha Par está vazia!");
			}else {
				System.out.println("Desempilhando na pilha Par: " + desempinhaPar);
			}
			
			if (desempinhaImpar == null) {
				System.out.println("A pilha Impar está vazia!");
			}else {
				System.out.println("Desempilhando na pilha Impar: " + desempinhaImpar);
			}
		
		}

		
		}
		System.out.println();
   while(!pilhaPar.estavazia()) {
	System.out.println("Desempilhando em elemento da pilha Par: " + pilhaPar.desempilhar());			 
	}
   System.out.println();
   while(!pilhaImpar.estavazia()) {
		System.out.println("Desempilhando em elemento da pilha Impar: " + pilhaImpar.desempilhar());			 
		}
	}

}
