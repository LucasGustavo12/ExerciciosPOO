package Exercicio11POO;

public class Ingresso {
	
	private double valor = 200.00;

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	
	public void imprimeValor(){
		System.out.println("R$: "+ valor);
	}

}
