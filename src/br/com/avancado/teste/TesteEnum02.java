package br.com.avancado.teste;

import br.com.avancado.DiaSemanaConstante;

public class TesteEnum02 {
	
	public static void main(String[] args) {
		DiaSemanaConstante dia = DiaSemanaConstante.DOMINGO;
		
		/*System.out.println(dia.toString() + " - " + dia.getValor());
		System.out.println(DiaSemanaConstante.SABADO);*/
		
		DiaSemanaConstante[] dias = DiaSemanaConstante.values();
//		
//		for(DiaSemanaConstante dd: dias) {
//			System.out.println(dd);
//			
//		}
		
		for(int i=0; i < dias.length; i++) {
			System.out.println(dias[i]);
		}
		
		
	}

}
