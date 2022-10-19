package Exercicio10POO;

public class Jogador {
	
	private String nome;
	private String posicao;
	private int anoNascimento;
	private String nacionalidade;
	private double altura;
	private double peso;
	
	private int idadeJogador;
	private int aposentadoria;
	
	
	public Jogador(String nome, String posicao, int anoNascimento, String nacionalidade, double altura, double peso) {
		this.nome = nome;
		this.posicao = posicao;
		this.anoNascimento = anoNascimento;
		this.nacionalidade = nacionalidade;
		this.altura = altura;
		this.peso = peso;
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getPosicao() {
		return posicao;
	}
	public void setPosicao(String posicao) {
		this.posicao = posicao;
	}
	public int getAnoNascimento() {
		return anoNascimento;
	}
	
	public String getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}


	public String toString() {
		return "Jogador [nome=" + nome + ", posicao=" + posicao + ", anoNascimento=" + anoNascimento
				+ ", nacionalidade=" + nacionalidade + ", altura=" + altura + ", peso=" + peso + "]";
	}
	
	public void idade() {
		idadeJogador = 2022 - anoNascimento;
		System.out.println(idadeJogador + " Anos");
	}

	
	public void Aposenta() {
		if(posicao == "defesa" || posicao == "Defesa") {
		aposentadoria =	40 - idadeJogador;
		System.out.println("O jogador " + nome +" se aposentara daqui a "+ aposentadoria + " anos");
		
		}else if(posicao == "meio-campo" || posicao == "Meio-campo") {
			aposentadoria =	38 - idadeJogador;
			System.out.println("O jogador " + nome +" se aposentara daqui a "+ aposentadoria + " anos");
		}
		else if(posicao == "atacante" || posicao == "Atacante") {
			aposentadoria =	35 - idadeJogador;
			System.out.println("O jogador " + nome +" se aposentara daqui a "+ aposentadoria + " anos");
		}
	}
	


	

	
	
}
