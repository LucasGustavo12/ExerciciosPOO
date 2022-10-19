package Exercicio1POO;
/*
 * Crie uma classe para representar uma Pessoa com os atributos privados de nome, data de nascimento e altura.
 * Crie os métodos públicos necessários para getters e setters e também um método para imprimir todos dados de
 * uma pessoa. Crie um método para calcular a idade da pessoa.
 */
public class Main {

	public static void main(String[] args) {
		
		Pessoa p = new Pessoa();
		p.setNome("Lucas");
		p.setDataNascimento(1998);
		p.setAltura((float) 1.80);
		p.DadosPessoa();
		p.mostrarIdade();
		
		Pessoa l = new Pessoa();
		l.setNome("Lorena");
		l.setDataNascimento(2002);
		l.setAltura((float) 1.60);
		l.DadosPessoa();
		l.mostrarIdade();
		
		
		
	}

}
