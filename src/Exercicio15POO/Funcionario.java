package Exercicio15POO;

public class Funcionario {
	
	private String nome;
	private String sobrenome;
	private double salarioMensal;
	private static int contador = 0;
	
	//Construtor
	public Funcionario(String nome, String sobrenome, double salarioMensal) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.salarioMensal = salarioMensal;
		contador++;
	}
	
	
	public int totalFuncionarios() {
		return contador;
	}
	
	public double salarioAnual() {
		return salarioMensal * 12;
	}
	
	//Getters e Setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public double getSalarioMensal() {
		return salarioMensal;
	}
	public void setSalarioMensal(double salarioMensal) {
		this.salarioMensal = salarioMensal;
	}
	

	

}
