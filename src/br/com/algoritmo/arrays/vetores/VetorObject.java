package br.com.algoritmo.arrays.vetores;

public class VetorObject {
	
	private Object[] elementos;
	private int tamanho;
	
	public VetorObject(int capadidade) {
		this.elementos = new Object[capadidade];
		this.tamanho = 0;
	}	
	
	 public boolean adiciona(int posicao, Object elemento) {		 
				           
		// Qualquer coisa diferente disso! --> ENTRA
		  this.validarPosicao(posicao);
		  
		  this.aumentarCapacidade();
		  
		for(int i=this.tamanho -1; i >= posicao; i--) {
			this.elementos[i +1] = this.elementos[i];			
		}
		  this.elementos[posicao] = elemento;
		  this.tamanho ++;
		  
		 return true;
		  
	  }

	
	public boolean adiciona(Object elemento) {

		this.aumentarCapacidade();
		
		if (this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;

			return true;
		}
		return false;
	}
	
	public void aumentarCapacidade() {
		if (this.tamanho == this.elementos.length) {
			
	Object[] elementosNovos = new Object[this.elementos.length * 2];
			
		for(int i=0; i < elementos.length; i++) {
			elementosNovos[i] = this.elementos[i];
		}
	    this.elementos = elementosNovos;
			
		}
	}
	
	public void remover(int posicao) {
		
	validarPosicao(posicao);
	
		for(int i=posicao; i < this.tamanho - 1; i++) {
			this.elementos[i] = this.elementos[i +1];
		}
			this.tamanho --;
		
	}
	public Object busca(int posicao) {
	this.validarPosicao(posicao);
		
		return this.elementos[posicao];
	}
	
	public int busca(Object elemento) {
		for (int i = 0; i < tamanho; i++) {
			if (this.elementos[i].equals(elemento)) {
				return i;
			}


		}
		return -1;
	}

		 
	public void quantidade() {
		System.out.println("Quantidade de posição ocupada " + this.tamanho);
	}
	public void tamanhoArray() {
		System.out.println("Array tem: " + elementos.length + " posições");
	}
	
	@Override
	public String toString() {
	StringBuilder sb = new StringBuilder();
	sb.append("[");
	
	for(int i=0; i < this.tamanho -1; i++) {
		sb.append(this.elementos[i]);
		sb.append(", ");
	}
	
	if (this.tamanho > 0) {
		sb.append(this.elementos[this.tamanho -1]);
	}
	sb.append("]");
	 return sb.toString();
	
	}

	private void validarPosicao(int posicao) {
		if (!(posicao >= 0 && posicao < this.tamanho)) {
			throw new IllegalArgumentException("Posição inválida");
		}
	}
        	
   

}
