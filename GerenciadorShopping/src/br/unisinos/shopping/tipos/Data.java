package br.unisinos.shopping.tipos;

public class Data {

	private int dia;
	private int mes;
	private int ano;

	public Data(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
		
		if ((dia >= 1 && dia <= 31) && (mes >= 1 && mes <= 12)) {
			if (verificaAnoBissexto()) {
				if (mes == 2 && dia > 28)
					setDataPadrao();
			} else {
				if (mes == 2 && dia > 29)
					setDataPadrao();
			}
			if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia > 30) setDataPadrao();
		} else {
			setDataPadrao();
		}
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

	public void setDataPadrao() {
		System.out.println("Os dados informados de data são inválidos, o sistema irá seguir a data padrão de 1/1/2000\n");
		setDia(1);
		setMes(1);
		setAno(2000);
	}

	public boolean verificaAnoBissexto() {
		if (ano % 4 == 0)
			return true;
		else
			return false;
	}

	@Override
	public String toString() {
		return "Data: " + dia + "/" + mes + "/" + ano;
	}

}
