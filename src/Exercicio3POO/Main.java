package Exercicio3POO;

public class Main {

	public static void main(String[] args) {
		
		BombaCombustivel gasolina = new BombaCombustivel('A', 5.00, 4000);
		gasolina.mostrarBomba();
		BombaCombustivel etanol = new BombaCombustivel('B', 4.00, 4000);
		etanol.mostrarBomba();
		BombaCombustivel alcool = new BombaCombustivel('C', 2.00, 4000);
		alcool.mostrarBomba();
		
		gasolina.abastecerPorLitro(100);
		gasolina.mostrarBomba();
		
		gasolina.abastecerPorValor(150.00);
		gasolina.mostrarBomba();
		gasolina.alterarValor(5.50);
		gasolina.mostrarBomba();
		gasolina.alterarCombustivel('G');
		gasolina.mostrarBomba();
		gasolina.alterarQuantidadeCombustivel(7000);
		gasolina.mostrarBomba();
		
		
		
	}

}
