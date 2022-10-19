package Exercicio7POO;

public class Main {

	public static void main(String[] args) {
		
		Funcionario f1 = new Funcionario("José", "Henrique", 1200);
		
		System.out.println(f1.getNome());
		System.out.println(f1.getSobrenome());
		System.out.println(f1.getSalarioMensal());
		System.out.println(f1.Aumento());
		System.out.println(f1.SalarioAnual());
	
		
		Funcionario f2 = new Funcionario("Lucas", "Gustavo", 3200);
		System.out.println(f2.getNome());
		System.out.println(f2.getSobrenome());
		System.out.println(f2.getSalarioMensal());
		System.out.println(f2.SalarioAnual());
		
		
		
		
		
		
		

	}

}
