package br.com.avancado.teste;

import br.com.avancado.DiaSemanaConstante;

public class TesteEnum3 {
	
	public static void main(String[] args) {
		DiaSemanaConstante dia;
		
		System.out.println(Enum.valueOf(DiaSemanaConstante.class, "SEGUNDA"));
		
		
	}

}
