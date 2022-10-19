package Exercicio2POO;

public class Conta {

	private int numeroConta;
	private String cliente;
	private double saldo;

	public Conta(int numeroConta, String cliente, double saldo) {
		this.numeroConta = numeroConta;
		this.cliente = cliente;
		this.saldo = saldo;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		if (saldo < 0) {
			this.saldo = 0;
		} else {
			this.saldo = saldo;
		}
	}
	//mostrar conta
	void Mostrar() {
		System.out.println(cliente);
		System.out.println(numeroConta);
		System.out.println(saldo);
	}
	

	// alterar nome
	void AlterarNome(String cliente) {
		this.cliente = cliente;
		System.out.println("Nome alterado para: " + cliente);
	}

	// deposito
	void Deposito(double valor) {
		this.saldo = saldo + valor;
		System.out.println("Você possui R$: " + saldo);
	}

	// saque
	void Saque(double valor) {
		this.saldo = saldo - valor;
		System.out.println("Você possui R$: " + saldo);
	}

}
