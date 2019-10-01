package br.com.avancado;

public enum DiaSemanaConstante {
	
SEGUNDA(1), TERCA(2), QUARTA(3), QUINTA(4), SEXTA(5),
	SABADO(6), DOMINGO(7);
	
	/*SEGUNDA("Seg"), TERCA("Terça"), QUARTA("Quarta"), QUINTA("Quinta"),
	SEXTA("Sexta"),	SABADO("Sabado"), DOMINGO("Domingo");*/
	
	private int valor;
	
	 DiaSemanaConstante(int valor) {
		this.valor =valor;

	}
	 
	 public int getValor() {
		 return this.valor;
	 }
	 
	 public void setValor(int valor) {
		 this.valor = valor;
	 }

}
