package Exercicio13POO;

public class Main {

	public static void main(String[] args) {

		Calculadora c1 = new Calculadora(20, 10);
		c1.Soma();
		c1.Divisao();
		c1.Multiplicacao();
		c1.Subtracao();
		
		//Calculadora Cientifica
		
	
		CalculadoraCientifica c2 = (CalculadoraCientifica) new Calculadora(20, 10);
		c2.Potencia();
		c2.Raiz();
		
		
	}

}
