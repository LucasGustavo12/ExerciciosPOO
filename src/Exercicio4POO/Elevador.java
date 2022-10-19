package Exercicio4POO;

public class Elevador {
	
	private int andarAtual = 0;
	private int totalAndares;
	private double capacidadeElevador;
	private int qtdPessoas = 0;
	
	
	public Elevador(int andarAtual, int totalAndares, double capacidadeElevador, int qtdPessoas) {
	
		this.andarAtual = andarAtual;
		this.totalAndares = totalAndares;
		this.capacidadeElevador = capacidadeElevador;
		this.qtdPessoas = qtdPessoas;
	}


	public int getAndarAtual() {
		return andarAtual;
	}


	public void setAndarAtual(int andarAtual) {
		this.andarAtual = andarAtual;
	}


	public int getTotalAndares() {
		return totalAndares;
	}


	public void setTotalAndares(int totalAndares) {
		this.totalAndares = totalAndares;
	}


	public double getCapacidadeElevador() {
		return capacidadeElevador;
	}


	public void setCapacidadeElevador(double capacidadeElevador) {
		this.capacidadeElevador = capacidadeElevador;
	}


	public int getQtdPessoas() {
		return qtdPessoas;
	}


	public void setQtdPessoas(int qtdPessoas) {
		if(this.qtdPessoas < 0) {
		this.qtdPessoas = 0;	
		}
		
	}
	
	public void Inicializa(double capacidade, int andares) {
		this.capacidadeElevador = capacidade;
		this.totalAndares = andares;
	}
	
	public void Entra(int qtd) {
		if(qtd + qtdPessoas > capacidadeElevador) {
			getQtdPessoas();
			System.out.println("Não há espaço " + qtdPessoas);
		}else {
			this.qtdPessoas = qtd + qtdPessoas;
			System.out.println("No espaço há: " + qtdPessoas + " Pessoas");
		}
	}
	
	public void Sai(int qtd) {
		if(qtdPessoas < 0) {
			this.qtdPessoas = 0;
			System.out.println(qtdPessoas + "Esse");
		}else {
			this.qtdPessoas = qtdPessoas - qtd;
			System.out.println("Pessoas sairam: " + qtd);
		}
	}
	
	public void Sobe() {
		if(andarAtual + 1 > totalAndares) {
			System.out.println("O Elevador já está no andar máximo");
		}else {
			this.andarAtual = andarAtual + 1;
			System.out.println("Andar: "+ andarAtual);
		}
	}
	
	public void Desce() {
		if(andarAtual != 0) {
			this.andarAtual = andarAtual - 1;
			System.out.println("Andar: " + andarAtual);
		}else {
			System.out.println("Andar Atual: " + andarAtual);
		}
		
	}
	
	public void Mostra() {
		System.out.println("Andar Atual: " + andarAtual);
		System.out.println("Total Andares: " + totalAndares);
		System.out.println("Capacidade Elevador: " + capacidadeElevador);
		System.out.println("qtdPessoas: " + qtdPessoas);
	}
	
}
