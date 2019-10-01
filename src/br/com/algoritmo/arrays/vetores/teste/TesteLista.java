package br.com.algoritmo.arrays.vetores.teste;

import java.util.ArrayList;
import java.util.List;

import br.com.algoritmo.arrays.vetores.Lista;

public class TesteLista {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("H");
		list.add("L");
		
		System.out.println(list);
		list.clear();
		System.out.println("List: "+ list);
		
		Lista<String> lista = new Lista<>(3);
		
		lista.adiciona("A");
		lista.adiciona("B");
		lista.adiciona("C");
		lista.adiciona("H");
		lista.adiciona("L");
		/*
		System.out.println(lista.contem("E"));
		System.out.println(lista.contem("A")); 
		System.out.println(lista.ultimoIndice("J"));
		lista.remove("A");
		System.out.println(lista);
		lista.remove("B");
		System.out.println(lista);
		System.out.println(lista.obetem(0));
		
		*/
		System.out.println(lista);
		lista.limpar();
		System.out.println("Lista: " + lista);
		
		lista.adiciona("K");
		lista.adiciona("Y");
		System.out.println(lista);
	}

}
