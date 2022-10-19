package Exercicio13POO;

public class CalculadoraCientifica extends Calculadora{

	public CalculadoraCientifica(double n1, double n2) {
		super(n1, n2);
		
	}
	
	
	public void Potencia () {
		System.out.println(getN1() + "Elevado a " + getN2() + "é: " + Math.pow(getN2(), getN1()));
	}
	
	public void Raiz() {
		System.out.println(getN1() + "A raiz quadrada de N1 é: "+ Math.sqrt(getN1()));
		System.out.println(getN2() + "A raiz quadrada de N1 é: "+ Math.sqrt(getN2()));
	}
	
}
