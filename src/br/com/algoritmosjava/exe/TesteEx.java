package br.com.algoritmosjava.exe;

import java.util.Scanner;

import br.com.algoritmosjava.vetores.Lista;
import br.com.algoritmosjava.vetores.teste.Contato;

public class TesteEx {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Lista<Contato> lista = new Lista<>(5);
		//criarContatoDinamicamente(6, lista);
		
		int opcao = 1;
		while(opcao != 0) {
		 opcao = obterOpcaoMenu(scanner);
		}
		System.out.println("Usuário digitou 0 programa saiu!");
	}
	
	private static int obterOpcaoMenu(Scanner scanner){
			boolean entradaValida = false;
			int opcao = 0;
			String entrada;
			
			while(!entradaValida) {
		System.out.println("Digite a opção desejada:");
		System.out.println("1: Adicionar no final do contato:");
		System.out.println("2: Adiciona na posição especifica:");
		System.out.println("3: Consulta na posição especifica:");
		System.out.println("4: Consulta contato:");
		System.out.println("5: Consulta último indice do contato:");
		System.out.println("6: Verifica se contato existe:");
		System.out.println("7: Remove por posição:");
		System.out.println("8: Exluir contato:");
		System.out.println("9: Verificar tamanho do vetor:");
		System.out.println("10: Excluir contato do vetor:");
		System.out.println("11: Imprimir vetor:");
		System.out.println("0: Sair:");
		
		try {
			
		entrada = scanner.nextLine();
		opcao = Integer.parseInt(entrada);
		
		if(opcao >= 0 && opcao <= 11) {
			entradaValida = true;
		}else {
			
			throw new Exception();
		}
		
		}catch (Exception e) {
			System.out.println("Entrada inválida digite novamente:\n\n");
		}
			}
		
		return opcao;
		
	}
	
	private static void criarContatoDinamicamente(int quantidade, Lista<Contato> lista) {
		Contato contato;
		for(int i=1; i <= quantidade; i++) {
			
			contato = new Contato();
			contato.setNome("Contato"+ i);
			contato.setTelefone("11111111"+i);
			contato.setEmail("contato"+i+"@gmail.com");
			
			lista.adiciona(contato);
		}
	}

}
