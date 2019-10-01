package br.com.algoritmo.arrays.vetores.teste;

import br.com.algoritmo.arrays.vetores.Lista;

public class GenericsTeste {
	public static void main(String[] args) {	
		Contato contato = new Contato("Contato 01", "87544-114", "contato1@email.com");
		Contato contato02 = new Contato("Contato 02", "4465-8944", "contato2@email.com");
		Contato contato03 = new Contato("Contato 03", "8551-1445", "contato3@email.com");
		Contato contato04 = new Contato("Contato 03", "8551-1445", "contato3@email.com");
	/*	
	 * VetorObject object = new VetorObject(3);
		object.adiciona(4);
		object.adiciona("maria");
		System.out.println(object);*/
		Lista<Contato> lista2 = new Lista<Contato>(2);
		Lista<String> lista = new Lista<String>(2);
		
		lista.adiciona("José");
		lista2.adiciona(contato02);
		
		System.out.println(lista2);
		System.out.println(lista);
	
	}

}
