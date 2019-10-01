package br.com.algoritmo.base;

public class EstruturaBase<T> {

	protected T[] elementos;
	protected int tamanho;

	@SuppressWarnings("unchecked")
	public EstruturaBase(int capadidade) {
		this.elementos = (T[]) new Object[capadidade];
		this.tamanho = 0;
	}

	public EstruturaBase() {
		this(10);
	}

	public boolean estavazia() {
		return this.tamanho == 0;
	}

	protected boolean adiciona(T elemento) {

		this.aumentarCapacidade();

		if (this.tamanho < this.elementos.length) {

			this.elementos[this.tamanho] = elemento;
			this.tamanho++;

/* this.elementos[this.tamanho++] = elemento; */

			return true;
		}
		return false;
	}

	protected boolean adiciona(int posicao, T elemento) {

		// Qualquer coisa diferente disso! --> ENTTA
		this.validarPosicao(posicao);

		this.aumentarCapacidade();

	for (int i = this.tamanho - 1; i >= posicao; i--) {
			this.elementos[i + 1] = this.elementos[i];
		}
		this.elementos[posicao] = elemento;
		this.tamanho++;

		return true;

	}

	public int tamanho() {
		return this.tamanho;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("[");

		for (int i = 0; i < this.tamanho - 1; i++) {
			sb.append(this.elementos[i]);
			sb.append(", ");
		}

		if (this.tamanho > 0) {
			sb.append(this.elementos[this.tamanho - 1]);
		}
		sb.append("]");
		return sb.toString();

	}

	public void aumentarCapacidade() {
		if (this.tamanho == this.elementos.length) {

			@SuppressWarnings("unchecked")
			T[] elementosNovos = (T[]) new Object[this.elementos.length * 2];

			for (int i = 0; i < elementos.length; i++) {
				elementosNovos[i] = this.elementos[i];
			}
			this.elementos = elementosNovos;

		}
	}

	private void validarPosicao(int posicao) {
		if (!(posicao >= 0 && posicao < this.tamanho)) {
			throw new IllegalArgumentException("Posição inválida\n");
		}
	}
}
