package Exercicio16POO;

public class Carro {

	private int qtdTanque;
	private int kmRodado;
	private int distancia;

	public Carro(int qtdTanque, int kmRodado) {
		this.qtdTanque = qtdTanque;
		this.kmRodado = kmRodado;
	}

	public int getQtdTanque() {
		return qtdTanque;
	}

	public void setQtdTanque(int qtdTanque) {
		this.qtdTanque = qtdTanque;
	}

	public int getKmRodado() {
		return kmRodado;
	}

	public void setKmRodado(int kmRodado) {
		this.kmRodado = kmRodado;
	}

	public int abastecer(int qtd) {
		if (qtd + qtdTanque > 50) {
			return qtdTanque = 50;
		} else {

			return qtd + qtdTanque;
		}
	}
	
	public void mover(int kms) {
		System.out.println("Carro moveu "+ kms + "Km");
		int uso = 15 / kms;
		qtdTanque = qtdTanque - uso;
		distancia = kms + kmRodado;
	}
	
	public void retornar() {
		System.out.println("Combustivel: " + qtdTanque);
		System.out.println("Distancia Percorrida: " + distancia);
	}
	
}
