package br.unisinos.shopping.tipos;

public class Produto {
	
	private String nome;
	private double preco;
	private Data dataValidade;
	
	public Produto(String nome, double preco, Data dataValidade) {
		this.nome = nome;
		this.preco = preco;
		this.dataValidade = dataValidade;
	}
	
    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

	public Produto() {
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public Data getDataValidade() {
		return dataValidade;
	}

	public void setDataValidade(Data dataValidade) {
		this.dataValidade = dataValidade;
	}
	
	public boolean estaVencido(Data data) {
		if((data.getAno() > this.dataValidade.getAno())) {
			return true;
		}
		else if((data.getMes() > this.dataValidade.getMes()) && (data.getAno() == this.dataValidade.getAno())) {
			return true;
		}
		else if((data.getDia() > this.dataValidade.getDia()) && (data.getMes() == this.dataValidade.getMes()) && (data.getAno() == this.dataValidade.getAno())){
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public String toString() {
		return "Produto [nome=" + nome + ", preco=" + preco + ", dataValidade=" + dataValidade + "]";
	}

}
