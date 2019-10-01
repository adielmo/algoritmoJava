package br.com.avancado.teste;

import br.com.avancado.DiaSemana;
import br.com.avancado.DiaSemanaConstante;

public class TesteEnum {

	public static void main(String[] args) {
		
		usandoConstante();
		System.out.println();
		usandoEnum();

	}
	private static void usandoConstante() {
	int segunda = DiaSemana.SEGUNDA_FEIRA;
	int terca = DiaSemana.TERCA_FEIRA;
	int quarta = DiaSemana.QUARTA_FEIRA;
	int quinta = DiaSemana.QUINTA_FEIRA;
	int sexta = DiaSemana.SEXTA_FEIRA;
	int sabado = DiaSemana.SABADO;
	int domingo = DiaSemana.DOMINGO;
	
	System.out.println("Teste ultilizando Constante no Java");
	imprimiDiaSemana(segunda);
	imprimiDiaSemana(terca);
	imprimiDiaSemana(quarta);
	imprimiDiaSemana(quinta);
	imprimiDiaSemana(sexta);
	imprimiDiaSemana(sabado);
	imprimiDiaSemana(domingo);
	}

	private static void imprimiDiaSemana(int dia) {
		switch (dia) {
		case 1:
			System.out.println("Segunda-feira");
			break;
		case 2:
			System.out.println("Terça-feira");
			break;
		case 3:
			System.out.println("Quarta-feira");
			break;
		case 4:
			System.out.println("Quinta-feira");
			break;
		case 5:
			System.out.println("Sexta-feira");
			break;
		case 6:
			System.out.println("Sabádo");
			break;
		case 7:
			System.out.println("Domingo");
			break;

		default:
			break;
		}
	}

	private static void usandoEnum() {
		DiaSemanaConstante segunda = DiaSemanaConstante.SEGUNDA;
		DiaSemanaConstante terca = DiaSemanaConstante.TERCA;
		DiaSemanaConstante quarta = DiaSemanaConstante.QUARTA;
		DiaSemanaConstante quinta = DiaSemanaConstante.QUINTA;
		DiaSemanaConstante sexta = DiaSemanaConstante.SEXTA;
		DiaSemanaConstante sabado = DiaSemanaConstante.SABADO;
		DiaSemanaConstante domingo = DiaSemanaConstante.DOMINGO;
		
		System.out.println("Usando ENUM em Java.");
		imprimiDiaSemana(segunda);
		imprimiDiaSemana(terca);
		imprimiDiaSemana(quarta);
		imprimiDiaSemana(quinta);
		imprimiDiaSemana(sexta);
		imprimiDiaSemana(sabado);
		imprimiDiaSemana(domingo);
		
		
	}
	
	private static void imprimiDiaSemana(DiaSemanaConstante dia) {
		switch (dia) {
		case SEGUNDA:
			System.out.println("Segunda-feira");
			break;
		case TERCA:
			System.out.println("Terça-feira");
			break;
		case QUARTA:
			System.out.println("Quarta-feira");
			break;
		case QUINTA:
			System.out.println("Quinta-feira");
			break;
		case SEXTA:
			System.out.println("Sexta-feira");
			break;
		case SABADO:
			System.out.println("Sabádo");
			break;
		case DOMINGO:
			System.out.println("Domingo");
			break;

		default:
			break;
		}
		
	}
}
