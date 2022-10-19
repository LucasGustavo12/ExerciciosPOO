package Exercicio1POO;

public class Pessoa {

	private String nome;
	private int dataNascimento;
	private double altura;



	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getDataNascimento() {
		return dataNascimento;
	}


	public void setDataNascimento(int dataNascimento) {
		this.dataNascimento = dataNascimento;
	}


	public double getAltura() {
		return altura;
	}


	public void setAltura(float altura) {
		this.altura = altura;
	}
	
	
	public void DadosPessoa() {
		System.out.println("Nome: " + nome);
		System.out.println("Data nascimento: " + dataNascimento);
		System.out.println("Altura: " + altura);
		
	}
	
	public int CalcularIdade () {
		
		return 2022 - dataNascimento;
		
	}
	
	public void mostrarIdade() {
		int idade = CalcularIdade();
		System.out.println("Idade: "+ idade);
	}

}
