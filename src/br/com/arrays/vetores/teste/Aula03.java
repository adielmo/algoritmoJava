package br.com.arrays.vetores.teste;

import br.com.arrays.vetores.Vetor;

public class Aula03 {
	public static void main(String[] args) {		
/*		ArrayList<Double> al = new ArrayList<>();
		List<Integer> l = new ArrayList<>();
		List<String> nomes = Arrays.asList("Adielmo", "Rabelo", "Santos");*/
		
		Vetor vetor = new Vetor(10);
		
		
	/*	try {
			vetor.adiciona("elemento 01");
			vetor.adiciona("elemento 02");
			vetor.adiciona("elemento 03");
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}*/
		
		vetor.adiciona("A");
		vetor.adiciona("B");
		vetor.adiciona("C");
		vetor.adiciona("E");
		vetor.adiciona("F");
		vetor.adiciona("G");
	
		
		vetor.quantidade();	
		vetor.tamanhoArray();		
		System.out.println("=============================");
		
/*int ss=	vetor.buscar("elemento 022");
     System.out.println(ss < 0 ? "Posição não existe" : ss);
     System.out.println("=============================");

		vetor.imprimir();
       System.out.println();
		vetor.adiciona(0, "A");	

		vetor.adiciona(3, "D");*/
		
		System.out.println(vetor);
		System.out.println();
	   // System.out.println(vetor);
	//	vetor.remover(0);		

int pos = vetor.buscar("A");
	if (pos >= 0) {
		
vetor.remover(pos);
	} else {
		
System.out.println("Letra não existe no vetor");

	}

	    System.out.println(vetor);
	
		
		
	}

}
