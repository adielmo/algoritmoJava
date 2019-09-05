package br.com.base;

import br.com.pilhas.Pilha;

public class Ex06 {
	public static void main(String[] args) {

		imprimir("A + B");
		imprimir("A + B + (C - D)");
		imprimir("{[()]}[](){()}");
		imprimir("{[(]}[](){()}");
		imprimir("A + B + C - D)");

	}

	public static void imprimir(String expressao) {
		System.out.println(expressao + " é uma expressão balanceada: " +
				verificarBalanceados(expressao));
	}

	final static String ABRE ="([{";
	final static String FECHA = ")]}";

	public static boolean verificarBalanceados(String expressao) {


		Pilha<Character> pilha = new Pilha<>();
		int index= 0;
		char simbolo, topo;

		while(index < expressao.length()) {
			simbolo = expressao.charAt(index);

			if (ABRE.indexOf(simbolo) > -1) {

				pilha.empilha(simbolo);

			}else if (FECHA.indexOf(simbolo) > -1) {

				if (pilha.estavazia()) {
					return false;	

				}else {
					topo=pilha.desempilhar();
					if (ABRE.indexOf(topo) != FECHA.indexOf(simbolo)) {
						return false;
					}	
				}

			}
			index ++;
		}

		return true;
	}

}
