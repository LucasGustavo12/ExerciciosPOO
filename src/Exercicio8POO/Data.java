package Exercicio8POO;

public class Data {

	private int dia;
	private int mes;
	private int ano;

	public Data(int dia, int mes, int ano) {

		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public void Construtor() {
		if (dia > 31 || dia <= 0 || mes > 12 || mes <= 0 || ano > 9999 || ano <= 0000) {
			dia = 01;
			mes = 01;
			ano = 0001;
			System.out.println("0" + dia + "/0" + mes + "/000" + ano);
		} else {
			System.out.println(dia + "/" + mes + "/" + ano);
		}
	}

	public void Compare(int dia, int mes, int ano) {
		if (this.dia == dia && this.mes == mes && this.ano == ano) {
			System.out.println("0");
		} else if (this.ano > ano || this.dia > dia && this.ano == ano && this.mes == mes
				|| this.mes > mes && this.ano == ano && this.dia == dia) {
			System.out.println("1");
		} else if (this.ano < ano || this.ano == ano && this.mes < mes
				|| this.ano == ano && this.mes == mes && this.dia < dia) {
			System.out.println("-1");
		}

	}

	public void GetMesExtenso() {
		switch (mes) {
		case 1:
			System.out.println("Janeiro");
			break;
		case 2:
			System.out.println("Fevereiro");
			break;
		case 3:
			System.out.println("Março");
			break;
		case 4:
			System.out.println("Abril");
			break;
		case 5:
			System.out.println("Maio");
			break;
		case 6:
			System.out.println("Junho");
			break;
		case 7:
			System.out.println("Julho");
			break;
		case 8:
			System.out.println("Agosto");
			break;
		case 9: 
			System.out.println("Setembro");
			break;
		case 10:
			System.out.println("Outubro");
			break;
		case 11:
			System.out.println("Novembro");
			break;
		case 12:
			System.out.println("Dezembro");
			break;
		default:
			System.out.println("Mês inválido");
		}
	}
	
	public boolean IsBissexto() {
		if(ano % 400 == 0) {
			return true;
		}else if((ano % 4 == 0) && (ano % 100 != 0)){
		return true;
		}else {
			return false;
		}
	}
	

	
	
}
