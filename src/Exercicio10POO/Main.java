package Exercicio10POO;

public class Main {

	public static void main(String[] args) {
		
		Jogador j1 = new Jogador ("Lucas", "Atacante", 1998, "Brasileiro", 89.0, 89.0);
		System.out.println(j1.toString());
		j1.idade();
		j1.Aposenta();
		
		Jogador j2 = new Jogador ("Thiago", "Meio-campo", 1993, "Brasileiro", 89.0, 89.0);
		System.out.println(j2.toString());
		j2.idade();
		j2.Aposenta();
		
		Jogador j3 = new Jogador ("Kante", "Defesa", 1995, "Francês", 89.0, 89.0);
		System.out.println(j3.toString());
		j3.idade();
		j3.Aposenta();
	}

}
