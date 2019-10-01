package br.com.algoritmo.base;

import java.util.Stack;

public class Ex07 {
	public static void main(String[] args) {
		
		
		imprimir(4);
		imprimir(10);
		imprimir(25);

		
	}
	
	public static void imprimir(int numero) {
		System.out.println(numero + " ess número em binário: "
				+ decimalBinario(numero));
	}
	
	public static String decimalBinario(int numero) {
		Stack<Integer> pilha = new Stack<>();
		String numBinario ="";
		int resto;
		
		while(numero > 0) {
			resto = numero % 2;
			pilha.push(resto);
			
			numero /= 2;
			
		}
		while(!pilha.isEmpty()) {
			numBinario += pilha.pop();
		}
		
		return numBinario;
	}

}

