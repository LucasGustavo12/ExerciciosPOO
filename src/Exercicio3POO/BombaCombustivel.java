package Exercicio3POO;

public class BombaCombustivel {

	private char tipoCombustivel;
	private double valorPorLitro;
	private double quantidadeCombustivel;
	
	
	
	public BombaCombustivel(char tipoCombustivel, double valorPorLitro, double quantidadeCombustivel) {
		this.tipoCombustivel = tipoCombustivel;
		this.valorPorLitro = valorPorLitro;
		this.quantidadeCombustivel = quantidadeCombustivel;
	}


	public char getTipoCombustivel() {
		return tipoCombustivel;
	}


	public void setTipoCombustivel(char tipoCombustivel) {
		this.tipoCombustivel = tipoCombustivel;
	}


	public double getValorPorLitro() {
		return valorPorLitro;
	}


	public void setValorPorLitro(double valorPorLitro) {
		this.valorPorLitro = valorPorLitro;
	}


	public double getQuantidadeCombustivel() {
		return quantidadeCombustivel;
	}


	public void setQuantidadeCombustivel(double quantidadeCombustivel) {
		this.quantidadeCombustivel = quantidadeCombustivel;
	}
	void mostrarBomba() {
		System.out.println(tipoCombustivel);
		System.out.println(valorPorLitro);
		System.out.println(quantidadeCombustivel);
	}
	
	
	 void abastecerPorValor (double valor) {
		 if(valor > 0) {
			 this.valorPorLitro = valorPorLitro * valor;
			 this.quantidadeCombustivel = quantidadeCombustivel - valor;
			 System.out.println("Foi colocado: " + valorPorLitro + " litros");
		 }else {
			 System.out.println("informe um valor valido");
		 }
	 }
	 
	 void abastecerPorLitro (double litro) {
		 if(litro > 0) {
			 this.valorPorLitro = valorPorLitro * litro;
			 this.quantidadeCombustivel = quantidadeCombustivel - litro;
			 System.out.println("Abasteci: "+ litro);
		 }else {
			 System.out.println("informe um valor valido");
		 }
	 }
	 
	 void alterarValor (double valorLitro) {
		 this.valorPorLitro = valorLitro;
		 System.out.println("Valor do litro alterado para "+ valorPorLitro);
	 }
	 
	 void alterarCombustivel(char tipo) {
		 this.tipoCombustivel = tipo;
		 System.out.println("Tipo de combustivel alterado para: " + tipoCombustivel);
	 }
	 
	 void alterarQuantidadeCombustivel (double quantidade) {
		 this.quantidadeCombustivel = quantidade;
		 System.out.println("A nova quantidade de combustivel disponivel na bomba é " + quantidadeCombustivel);
	 }
	
	
	
}
