package Exercicio15POO;

public class FuncionarioTeste {
	
	public static void main(String[] args) {
		 
		Funcionario f1 = new Funcionario("Lucas", "Gustavo", 1300.00);
		Funcionario f2 = new Funcionario("Leandro", "Morientes", 1500.00);
		f1.setSalarioMensal(1300 + (1300 * 10/100));
		System.out.println(f1.getSalarioMensal());
		f2.setSalarioMensal(1500 + (1500 * 10/100));
		System.out.println(f2.getSalarioMensal());
		System.out.println(f1.salarioAnual());
		System.out.println(f2.salarioAnual());
		
		System.out.println(f1.totalFuncionarios());
		
		
		
	}

}
