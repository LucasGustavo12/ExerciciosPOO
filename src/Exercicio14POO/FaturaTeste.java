package Exercicio14POO;

public class FaturaTeste {

	public static void main(String[] args) {
		
		Fatura fatura1 = new Fatura("123", "Notebook", 2, 2400.00);
		Fatura fatura2 = new Fatura("456", "HD", 4, 600.00);
		Fatura fatura3 = new Fatura("789", "Teclado", 1, 100.00);
		Fatura fatura4 = new Fatura("987", "Monitor", 1, 1200.00);
		
		System.out.println(fatura1.getTotalFatura());
		System.out.println(fatura3.getTotalFatura());
		System.out.println(fatura2.getDescricao());
		System.out.println(fatura2.getTotalFatura());
		System.out.println(fatura4.getTotalFatura());
		
	}

}
