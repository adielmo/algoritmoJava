package br.com.algoritmosjava.exe;

import java.util.Scanner;

import br.com.algoritmosjava.vetores.Lista;
import br.com.algoritmosjava.vetores.teste.Contato;

public class TesteEx {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		Lista<Contato> lista = new Lista<>(5);
		// criarContatoDinamicamente(6, lista);

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
	private static void imprimir(Lista<Contato> lista) {
		System.out.println(lista);
	}

	private static void limparVetor(Lista<Contato> lista) {
		lista.limpar();
		System.out.println(lista);
	}

	private static void imprimirTamanhoVetor(Lista<Contato> lista) {
		System.out.println("Tamanho do vetor é : " + lista.tamanho());
	}

	private static void excluirContato(Scanner scanner, Lista<Contato> lista) {
		int pos = lerInformacaoInt("Entre com a posição a ser removida", scanner);

		try {
			Contato contato = lista.busca(pos);
			lista.remove(contato);

			System.out.println("Contato excluindo");

		} catch (Exception e) {
			System.out.println("Entrada inválida, digite novamente");
		}
	}

	private static void excluirPorPosicao(Scanner scanner, Lista<Contato> lista) {
		int pos = lerInformacaoInt("Entre com a posição a ser removida", scanner);

		try {
			lista.remover(pos);

			System.out.println("Contato excluindo");

		} catch (Exception e) {
			System.out.println("Entrada inválida, digite novamente");
		}
	}

	private static void pesquisarContatoExiste(Scanner scanner, Lista<Contato> lista) {
		int pos = lerInformacaoInt("Entre com o contato pesquisada", scanner);

		try {
			Contato contato = lista.busca(pos);
			boolean existe = lista.contem(contato);

			if (existe) {
				System.out.println("Contato existe, seguem dados:");
				System.out.println(contato);
			} else {
				System.out.println("Contato não existe!");
			}

		} catch (Exception e) {
			System.out.println("Entrada inválida, digite novamente");
		}
	}

	private static void pesquisarUltimoIndice(Scanner scanner, Lista<Contato> lista) {
		int pos = lerInformacaoInt("Entre com o contato pesquisada", scanner);

		try {
			Contato contato = lista.busca(pos);
			System.out.println("Contato existe, seguem dados:");
			System.out.println(contato);

			System.out.println("Fazendo pesquisa de contato encontrado:");
			pos = lista.ultimoIndice(contato);
			System.out.println("Contato encotrado na posição " + pos);

		} catch (Exception e) {
			System.out.println("Entrada inválida, digite novamente");
		}
	}

	private static void obtemContato(Scanner scanner, Lista<Contato> lista) {
		int pos = lerInformacaoInt("Entre com o contato pesquisada", scanner);
		try {
			Contato contato = lista.busca(pos);
			System.out.println(contato);

			System.out.println("Fazendo pesquisa de contato encontrado:");
			pos = lista.busca(contato);
			System.out.println("Contato encotrado na posição " + pos);

		} catch (Exception e) {
			System.out.println("Entrada inválida, digite novamente");
		}
	}

	private static void obtemContatoPosicao(Scanner scanner, Lista<Contato> lista) {
		int pos = lerInformacaoInt("Entre com a posição pesquisada", scanner);
		try {
			Contato contato = lista.busca(pos);
			System.out.println("Contato existe, lista de contato");
			System.out.println(contato);

		} catch (Exception e) {
			System.out.println("Entrada inválida, digite novamente");
		}
	}

	private static void adicionarContatoPosicao(Scanner scanner, Lista<Contato> lista) {

		System.out.println("Criando um contato, entre com as informações:");
		String nome = lerInformacao("Entre com o nome", scanner);
		String telefone = lerInformacao("Entre com o telefone", scanner);
		String email = lerInformacao("Entre com o E-mail", scanner);

		Contato contato = new Contato(nome, telefone, email);
		int pos = lerInformacaoInt("Entre com a posição do contato", scanner);

		try {
			lista.adiciona(contato);
			System.out.println("Contato adicionado com sucesso");
			System.out.println(lista);

		} catch (Exception e) {
			System.out.println("Não adicionado!");
		}

	}

	private static int lerInformacaoInt(String msg, Scanner scanner) {

		boolean entradaValida = false;
		int num = 0;
		String entrada;

		while (!entradaValida) {
			try {
				System.out.println(msg);
				entrada = scanner.nextLine();
				num = Integer.parseInt(entrada);

				entradaValida = true;
			} catch (Exception e) {
				System.out.println("Entrada inválida, digite novamente");
			}

		}
		return num;
	}

	private static void adicionarContatoFinal(Scanner scanner, Lista<Contato> lista) {

		System.out.println("Criando um contato, entre com as informações:");
		String nome = lerInformacao("Entre com o nome", scanner);
		String telefone = lerInformacao("Entre com o telefone", scanner);
		String email = lerInformacao("Entre com o E-mail", scanner);

		Contato contato = new Contato(nome, telefone, email);
		lista.adiciona(contato);
		System.out.println("Contato adicionado com sucesso");
		System.out.println(lista);
	}

	private static String lerInformacao(String msg, Scanner scanner) {
		System.out.println(msg);
		String entrada = scanner.nextLine();

		return entrada;
	}

	private static int obterOpcaoMenu(Scanner scanner) {
		boolean entradaValida = false;
		int opcao = 0;
		String entrada;

		while (!entradaValida) {
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

				if (opcao >= 0 && opcao <= 11) {
					entradaValida = true;
				} else {

					throw new Exception();
				}

			} catch (Exception e) {
				System.out.println("Entrada inválida digite novamente:\n\n");
			}
		}

		return opcao;

	}

	private static void criarContatoDinamicamente(int quantidade, Lista<Contato> lista) {
		Contato contato;
		for (int i = 1; i <= quantidade; i++) {

			contato = new Contato();
			contato.setNome("Contato" + i);
			contato.setTelefone("11111111" + i);
			contato.setEmail("contato" + i + "@gmail.com");

			lista.adiciona(contato);
		}
	}

}
