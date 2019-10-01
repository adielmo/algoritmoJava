package br.com.algoritmo.base;

import br.com.algoritmo.pilhas.Pilha;

public class Ex05 {
	
	public static void main(String[] args) {
		imprimir("adielmo");
		imprimir("ada");
		imprimir("abcd");
		imprimir("abccba");
		
	}
	
	public static void imprimir(String palavra) {
		
System.out.println(primeiroMaiusculo(palavra) + " é uma palavra Palidromo: "
		+saida(palavra));
	}
	public static String saida(String palavra) {
		return teste(palavra) ? "Sim" : "Não";
	}

public static boolean teste(String palavra) {
	
	String novaPalavra = "";
	
	for(int i = palavra.length()-1; i >= 0; i--) {
		novaPalavra += palavra.charAt(i);
	}
	
return novaPalavra.equalsIgnoreCase(palavra) ?  true : false;
	
}
	
	public static boolean testaPalidromo(String palavra) {
		Pilha<Character> pilha = new Pilha<>();
		
		for(int i=0; i < palavra.length(); i++) {
			pilha.empilha(palavra.charAt(i));
		}
		
		String palavraInversa = "";
		
		while(!pilha.estavazia()) {
			palavraInversa += pilha.desempilhar();
		}
		
	if (palavraInversa.equalsIgnoreCase(palavra)) {
			return true;
		}
		
		return false;
	}
	
	public static String primeiroMaiusculo(String palavra) {
		String PrimMaiúscula = "";
		PrimMaiúscula=	palavra.substring(0, 1).toUpperCase().concat(palavra.substring(1));

		return PrimMaiúscula;
	}

}
