package br.com.arrays.exe;

import java.util.ArrayList;
import java.util.Scanner;

import br.com.arrays.vetores.teste.Contato;

public class TesteArrayList extends TesteEx{
	public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);

	ArrayList<Contato> lista = new ArrayList<>(5);
	criarContatoDinamicamente(6, lista);

	int opcao = 1;
	while (opcao != 0) {
		opcao = obterOpcaoMenu(scanner);

		switch (opcao) {
		case 1:
			adicionarContatoFinal(scanner, lista);
			break;
		case 2:
			adicionarContatoPosicao(scanner, lista);
			break;
		case 3:
			obtemContatoPosicao(scanner, lista);
			break;
		case 4:
			obtemContato(scanner, lista);
			break;
		case 5:
			pesquisarUltimoIndice(scanner, lista);
			break;
		case 6:
			pesquisarContatoExiste(scanner, lista);
			break;
		case 7:
			excluirPorPosicao(scanner, lista);
			break;
		case 8:
			excluirContato(scanner, lista);
			break;
		case 9:
			imprimirTamanhoVetor(lista);
			break;

		case 10:
			limparVetor(lista);
			break;
		case 11:
          imprimir(lista);
			break;
		default:
			break;
		}

	}
	System.out.println("Usuário digitou 0 programa saiu!");
}
private static void imprimir(ArrayList<Contato> lista) {
	System.out.println(lista);
}

private static void limparVetor(ArrayList<Contato> lista) {
	lista.size();
	System.out.println(lista);
}

private static void imprimirTamanhoVetor(ArrayList<Contato> lista) {
	System.out.println("Tamanho do vetor é : " + lista.size());
}

private static void excluirContato(Scanner scanner, ArrayList<Contato> lista) {
	int pos = lerInformacaoInt("Entre com a posição a ser removida", scanner);

	try {
		Contato contato = lista.get(pos);
		lista.remove(contato);

		System.out.println("Contato excluindo");

	} catch (Exception e) {
		System.out.println("Entrada inválida, digite novamente:\n");
	}
}

private static void excluirPorPosicao(Scanner scanner, ArrayList<Contato> lista) {
	int pos = lerInformacaoInt("Entre com a posição a ser removida", scanner);

	try {
		lista.remove(pos);

		System.out.println("Contato excluindo");

	} catch (Exception e) {
		System.out.println("Entrada inválida, digite novamente:\n");
	}
}

private static void pesquisarContatoExiste(Scanner scanner, ArrayList<Contato> lista) {
	int pos = lerInformacaoInt("Entre com o contato pesquisada", scanner);

	try {
		Contato contato = lista.get(pos);
		boolean existe = lista.contains(contato);

		if (existe) {
			System.out.println("Contato existe, seguem dados:");
			System.out.println(contato);
		} else {
			System.out.println("Contato não existe!");
		}

	} catch (Exception e) {
		System.out.println("Entrada inválida, digite novamente:\n");
	}
}

private static void pesquisarUltimoIndice(Scanner scanner, ArrayList<Contato> lista) {
	int pos = lerInformacaoInt("Entre com o contato pesquisada", scanner);

	try {
		Contato contato = lista.get(pos);
		System.out.println("Contato existe, seguem dados:");
		System.out.println(contato);

		System.out.println("Fazendo pesquisa de contato encontrado:");
		pos = lista.lastIndexOf(contato);
		System.out.println("Contato encotrado na posição " + pos);

	} catch (Exception e) {
		System.out.println("Entrada inválida, digite novamente:\n");
	}
}

private static void obtemContato(Scanner scanner, ArrayList<Contato> lista) {
	int pos = lerInformacaoInt("Entre com o contato pesquisada", scanner);
	try {
		Contato contato = lista.get(pos);
		System.out.println(contato);

		System.out.println("Fazendo pesquisa de contato encontrado:");
		pos = lista.indexOf(contato);
		System.out.println("Contato encotrado na posição " + pos);

	} catch (Exception e) {
		System.out.println("Entrada inválida, digite novamente:\n");
	}
}

private static void obtemContatoPosicao(Scanner scanner, ArrayList<Contato> lista) {
	int pos = lerInformacaoInt("Entre com a posição pesquisada", scanner);
	try {
		Contato contato = lista.get(pos);
		System.out.println("Contato existe, lista de contato");
		System.out.println(contato);

	} catch (Exception e) {
		System.out.println("Entrada inválida, digite novamente:\n");
	}
}

private static void adicionarContatoPosicao(Scanner scanner, ArrayList<Contato> lista) {

	System.out.println("Criando um contato, entre com as informações:");
	String nome = lerInformacao("Entre com o nome", scanner);
	String telefone = lerInformacao("Entre com o telefone", scanner);
	String email = lerInformacao("Entre com o E-mail", scanner);

	Contato contato = new Contato(nome, telefone, email);
	int pos = lerInformacaoInt("Entre com a posição do contato", scanner);

	try {
		lista.add(pos, contato);
		System.out.println("Contato adicionado com sucesso");
		System.out.println(lista);

	} catch (Exception e) {
		System.out.println("Não adicionado!\n");
	}

}



private static void adicionarContatoFinal(Scanner scanner, ArrayList<Contato> lista) {

	System.out.println("Criando um contato, entre com as informações:");
	String nome = lerInformacao("Entre com o nome", scanner);
	String telefone = lerInformacao("Entre com o telefone", scanner);
	String email = lerInformacao("Entre com o E-mail", scanner);

	Contato contato = new Contato(nome, telefone, email);
	lista.add(contato);
	System.out.println("Contato adicionado com sucesso");
	System.out.println(lista);
}

private static void criarContatoDinamicamente(int quantidade, ArrayList<Contato> lista) {
	Contato contato;
	for (int i = 1; i <= quantidade; i++) {

		contato = new Contato();
		contato.setNome("Contato" + i);
		contato.setTelefone("11111111" + i);
		contato.setEmail("contato" + i + "@gmail.com");

		lista.add(contato);
	}
}

}
