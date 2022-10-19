package Exercicio2POO;

/*
 * Crie uma classe para implementar uma ContaCorrente. A classe deve possuir os seguintes atributos: número da conta,
 *  nome do correntista e saldo. Os métodos são os seguintes: alterarNome, depósito e saque; No construtor, saldo é opcional
 * com valor default zero e os demais atributos são obrigatórios.
 */
public class Main {

	public static void main(String[] args) {
			
		
		Conta c1 = new Conta(1, "Lucas", 1300);
		c1.Mostrar();
		c1.AlterarNome("Lucas Gustavo");
		c1.Mostrar();
		c1.Deposito(200);
		c1.Saque(1000);
		
		Conta c2 = new Conta(2, "Lorena", 2000);
		c2.Mostrar();
		c2.Saque(200);
		
	}

}
