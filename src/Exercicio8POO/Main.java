package Exercicio8POO;

public class Main {
	public static void main(String[] args) {
		
		Data d1 = new Data(1, 6, 2022);
		d1.Compare(24, 01, 2022);
		System.out.println(d1.getDia());
		System.out.println(d1.getMes());
		d1.GetMesExtenso();
		System.out.println(d1.getAno());
		System.out.println(d1.IsBissexto());

	}

}
