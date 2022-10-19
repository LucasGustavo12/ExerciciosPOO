package Exercicio7POO;

public class Funcionario {

	private String nome;
	private String sobrenome;
	private double salarioMensal;

	

	public Funcionario(String nome, String sobrenome, double salarioMensal) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.salarioMensal = salarioMensal;
	}

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

	public double SalarioAnual() {
		return (salarioMensal * 12);
	}

	public double Aumento() {
		return salarioMensal * 0.10 + salarioMensal;
	}

}
