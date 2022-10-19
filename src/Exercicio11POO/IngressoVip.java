package Exercicio11POO;

public class IngressoVip extends Ingresso {
	
	private double adicional = 50.00;
	double valorIngressoVip;

	public double getAdicional() {
		return adicional;
	}

	public void setAdicional(double adicional) {
		this.adicional = adicional;
	}
	
	public void imprimeValorAdicional(){
		valorIngressoVip = getValor() + adicional;
		System.out.println("R$: " + valorIngressoVip);
	}
	
	
}
