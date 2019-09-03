package br.com.lab;

import java.util.Stack;

import br.com.pilhas.Pilha;

public class Ex04 {
	
	public static void main(String[] args) {
		Stack<Livro> pilha = new Stack<Livro>();
		
		Livro livro = new Livro();
		livro.setNome("Livro de algotirimo");
		livro.setIsbn("xxx123");
		livro.setAutor("Marcos");
		livro.setAnoLancamento("2012");
		
		Livro livro2 = new Livro();
		livro2.setNome("Livro de Java");
		livro2.setIsbn("kkk438");
		livro2.setAutor("Fabio");
		livro2.setAnoLancamento("2013");
		
		Livro livro3 = new Livro();
		livro3.setNome("Livro de Html & Css");
		livro3.setIsbn("yy983");
		livro3.setAutor("Marcia");
		livro3.setAnoLancamento("2014");
		
		Livro livro4 = new Livro();
		livro4.setNome("Livro de JavaScript");
		livro4.setIsbn("hh398");
		livro4.setAutor("Sávio");
		livro4.setAnoLancamento("2015");
		
		Livro livro5 = new Livro();
		livro5.setNome("Livro de Sql");
		livro5.setIsbn("pah672");
		livro5.setAutor("Lauro");
		livro5.setAnoLancamento("2013");
		
		System.out.println("Pilha de livros está vazia: " + pilha.isEmpty());
		System.out.println("Empilhado livros:");
		
		pilha.push(livro);
		pilha.push(livro2);
		pilha.push(livro3);
		pilha.push(livro4);
		pilha.push(livro5);
		
		System.out.println("Pilha de livros está com : " + pilha.size());
		System.out.println(pilha);
		
		System.out.println("Pilha de livros está vazia: " + pilha.isEmpty());
		System.out.println("Último valor da pilha: " + pilha.peek());
		
		System.out.println("Desempilhando a pilha de livros:");
		while(!pilha.isEmpty()){
			System.out.println("Desempilhando livros: " + pilha.pop());
		}
		
		System.out.println("Todos os livros  foram desempilhados, pilha vazia: " + pilha.isEmpty());
	}
	

}
