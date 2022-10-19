package Exercicio12POO;

import java.util.Scanner;
import java.util.Vector;

public class Agenda {
	
	 private static int total_pessoas;
	    private static char name[];
	    private static int agend_idade;
	    private static String agend_nomes;
	    private static double agend_altura;
	    static Vector set_name = new Vector<String>();
	    static Vector set_age = new Vector<Integer>();
	    static Vector set_altura = new Vector<Double>();

	    public void quantidade_de_pessoa(int qtdade) {
	        total_pessoas = qtdade;
	        name = new char[qtdade];

	    }

	    @SuppressWarnings({ "unchecked", "resource" })
	    public static void set_armazenaPessoa(int i) {
	        Scanner in_teclado;
	        System.out.println("Digite o nome da " + (i + 1) + "  pessoa");
	        in_teclado = new Scanner(System.in);
	        agend_nomes = in_teclado.nextLine();
	        System.out.println("Digite a idade da " + (i + 1) + " pessoa");
	        in_teclado = new Scanner(System.in);
	        agend_idade = in_teclado.nextInt();
	        System.out.println("Digite a altura da " + (i + 1) + " pessoa");
	        in_teclado = new Scanner(System.in);
	        String altura = in_teclado.nextLine();
	        agend_altura = Double.parseDouble(altura);

	        //gravando os dados pessoais 
	        set_name.add(i, agend_nomes);
	        set_age.add(i, agend_idade);
	        set_altura.add(i, agend_altura);

	    }

	    public static void get_imprimeAgenda(int qtdade_impressao) {

	        System.out.println((qtdade_impressao + 1) + " )nome: " + set_name.get(qtdade_impressao));
	        System.out.println("idade: " + set_age.get(qtdade_impressao));
	        System.out.println("altura: " + set_altura.get(qtdade_impressao));

	    }

	    @SuppressWarnings("unchecked")
	    public static void removePessoa(int remove_index) {
	        set_name.set(remove_index, null);
	        set_age.set(remove_index, null);
	        set_altura.set(remove_index, null);
	    }

	    public static int buscaPessoa(String nome_busca) {
	        // informa em que posição da agenda está a pessoa
	        int position = -1;// se retornar negativo quer dizer que o nome nao consta na lista
	        for (int i = 0; i < total_pessoas; i++) {
	            if (set_name.get(i).equals(nome_busca)) {
	                position = i;
	            }
	        }
	        return position;
	    }

	}
