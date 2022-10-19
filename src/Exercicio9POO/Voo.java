package Exercicio9POO;

import Exercicio8POO.Data;

public class Voo extends Data{
	
	private int numeroCadeira;
	private int numeroDoVoo;
	private int vagasVoo = 100;
	private int ocupado = 0;
	
	
		
	public Voo(int dia, int mes, int ano, int passageiros, int numeroDoVoo, int lugar) {
		super(dia, mes, ano);
		numeroDoVoo = this.numeroDoVoo;
		lugar = this.numeroCadeira;
		ocupado ++;
		
		
		
	}



	public int getNumeroCadeira() {
		return numeroCadeira;
	}



	public void setNumeroCadeira(int numeroCadeira) {
		this.numeroCadeira = numeroCadeira;
	}



	public int getNumeroDoVoo() {
		return numeroDoVoo;
	}



	public void setNumeroDoVoo(int numeroDoVoo) {
		this.numeroDoVoo = numeroDoVoo;
	}



	
	@Override
	public String toString() {
		return "Voo [numeroCadeira=" + numeroCadeira + ", numeroDoVoo=" + numeroDoVoo + ", getNumeroCadeira()="
				+ getNumeroCadeira() + ", getNumeroDoVoo()=" + getNumeroDoVoo() + "]";
	}
	
	
	public void Construtor() {
		toString();
	}
	
	
	public void ProximoLivre() {
		if(numeroCadeira == getNumeroCadeira()) {
			this.numeroCadeira += 1;
		}
	}
	
	public void Verifica() {
		if(numeroCadeira == getNumeroCadeira()) {
			System.out.println("Cadeira indisponivel");
		}
	}
	
	public void Ocupa (int cadeira) {
		if(numeroCadeira != getNumeroCadeira()) {
			this.numeroCadeira = cadeira;
		}else {
			System.out.println("Cadeira indisponivel");
		}
	}
	
	public int Vagas() {
		return vagasVoo - ocupado;
	}
	
	
	public int GetVoo() {
		return numeroDoVoo;
	}

	
	
	

}
