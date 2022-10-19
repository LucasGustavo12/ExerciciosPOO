package Exercicio12POO;

import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		// objectos e identificadores
		Agenda ag = new Agenda();
		int qtdade_pessoas, index;
		String nome;

		// inicializacao de objectos e identificadores
		System.out.println("Quantas pessoas desejas cadastrar? \n total de cadastro: ");
		Scanner in_teclado = new Scanner(System.in);
		qtdade_pessoas = in_teclado.nextInt();
		ag.quantidade_de_pessoa(qtdade_pessoas);

		// instrucoes de cadastro de pessoas
		for (int i = 0; i < qtdade_pessoas; i++) {
			Agenda.set_armazenaPessoa(i);// cadastrar pessoas
		}

		// instrucoes de impressao de pessoas cadastrada
		for (int i = 0; i < qtdade_pessoas; i++) {
			Agenda.get_imprimeAgenda(i);// lista de pessoas cadastrada
		}

		// intrucoes de busca de uma pessoa na lista de cadastro
		System.out.println("Digite o nome da pessoa que procuras");
		in_teclado = new Scanner(System.in);
		nome = in_teclado.nextLine();
		int position = Agenda.buscaPessoa(nome);
		if (position >= 0) {
			System.out.println("O " + nome + " se encontra na posisao: " + (position + 1));
		} else {
			System.out.println("o nome desejado nao esta nesta lista");
		}

		// imprime os dados da pessoa que está na posição “i” da agenda.
		System.out.println("Digite o numero de ordem da pessoa na lista: ");
		in_teclado = new Scanner(System.in);
		index = in_teclado.nextInt();
		for (int i = 0; i < qtdade_pessoas; i++) {
			if (i == (index - 1)) {
				Agenda.get_imprimeAgenda(i);
			}
		}

		// remover uma pessoa da lista
		System.out.println("Digite o numero de ordem da pessoa na lista que deseja remover: ");
		in_teclado = new Scanner(System.in);
		index = in_teclado.nextInt();
		for (int i = 0; i < qtdade_pessoas; i++) {
			if (i == (index - 1)) {
				Agenda.removePessoa(i);
			}
		}

		// instrucoes de impressao de pessoas cadastrada
		for (int i = 0; i < qtdade_pessoas; i++) {
			Agenda.get_imprimeAgenda(i);// lista de pessoas cadastrada
		}

	}

}
