package Exercicio13POO;

public class Calculadora {
	
	private double n1, n2;
	private double res;
	
	

	public Calculadora(double n1, double n2) {
		this.n1 = n1;
		this.n2 = n2;
	}
	

	public double getN1() {
		return n1;
	}

	public void setN1(double n1) {
		this.n1 = n1;
	}

	public double getN2() {
		return n2;
	}

	public void setN2(double n2) {
		this.n2 = n2;
	}

	
	public void Soma() {
		 res = n1 + n2;
		 System.out.println("O resultado de " + n1 + "+" + n2 + " é" + res);
		 
	}
	
	public void Subtracao() {
		res = n1 - n2;
		System.out.println("O resultado de " + n1 + "-" + n2 + " é" + res);
	}
	
	public void Divisao() {
		res = n1 / n2;
		System.out.println("O resultado de " + n1 + "/" + n2 + " é" + res);
	}
	
	public void Multiplicacao() {
		res = n1 * n2;
		System.out.println("O resultado de " + n1 + "*" + n2 + " é" + res);
	}

}
