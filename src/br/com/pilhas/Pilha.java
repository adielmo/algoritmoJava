package br.com.pilhas;

import br.com.base.EstruturaBase;

public class Pilha<T> extends EstruturaBase<T> {

	public Pilha() {
		super();
	}

	public Pilha(int capacidade) {
		super(capacidade);
	}

	public void empilha(T elemento) {
		this.aumentarCapacidade();
		this.elementos[this.tamanho++] = elemento;
		// this.adiciona(elemento);
	}

	public T desempilhar() {

		if (!isEmpyt()) {

     return this.elementos[--this.tamanho];
		}
		return null;
	}

	public boolean isEmpyt() {
		return this.tamanho == 0;
	}

	public T espiar() {
		if (!isEmpyt()) {
			return this.elementos[this.tamanho - 1];
		}
		return null;
	}
}
