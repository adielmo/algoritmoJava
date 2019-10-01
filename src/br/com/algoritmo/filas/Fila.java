package br.com.algoritmo.filas;

import br.com.algoritmo.base.EstruturaBase;

public class Fila<T> extends EstruturaBase<T>{
	
	public Fila() {
		super();
	}
	
	public Fila(int capacidade) {
		super(capacidade);
	}
	
	public void enfileira(T elemento) {
		/*this.elementos[this.tamanho] = elemento;
		this.tamanho++;*/
		
/*this.elementos[this.tamanho++] =elemento;*/
		
		this.adiciona(elemento);
		
	}
	
	public T espiar() {
		if (this.tamanho >= 0) {
			return this.elementos[0];
		}
		return null;
	}

	public T remover() {
		
		if (this.tamanho >= 0) {
			final int POS = 0;

			T elementoRemovido = this.elementos[POS];

			for (int i = POS; i < this.tamanho - 1; i++) {
				this.elementos[i] = this.elementos[i + 1];
			}
			this.tamanho--;
			return elementoRemovido;
		}
		return null;
	}
	

}
