package br.com.algoritmo.filas.teste;

import java.util.PriorityQueue;
import java.util.Queue;

import br.com.algoritmo.filas.FilaPrioridade;

public class PrioridadeMain {
	
	public static void main(String[] args) {
		
//FilaPrioridade<Paciente> fila = new FilaPrioridade<>();
		Queue<Paciente> fila = new PriorityQueue<>();
		
		fila.add(new Paciente("A", 2));
		fila.add(new Paciente("C", 1));
		fila.add(new Paciente("B", 3));
		
		System.out.println(fila);

/*fila.enfileira(new Paciente("A", 2));
fila.enfileira(new Paciente("C", 1));
fila.enfileira(new Paciente("B", 3));*/

//System.out.println(fila.toString());


	}

}
