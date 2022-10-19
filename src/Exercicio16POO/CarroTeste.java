package Exercicio16POO;

public class CarroTeste {
	public static void main(String[] args) {
		
		Carro c1 = new Carro(0, 0);
		Carro c2 = new Carro(0, 0);
		c1.abastecer(20);
		c2.abastecer(30);
		
		
		c1.mover(200);
		c2.mover(400);
		
		
		c1.retornar();
		c2.retornar();
	}

}
