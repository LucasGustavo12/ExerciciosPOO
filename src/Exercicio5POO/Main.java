package Exercicio5POO;

public class Main {

	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno(300, "Luana", 0, 1.0, 1.0);
		System.out.println(aluno1.getNome());
		System.out.println(aluno1.Media());
		System.out.println(aluno1.aFinal());
		System.out.println(Aluno.Round(2, 3));
	
	}

}
