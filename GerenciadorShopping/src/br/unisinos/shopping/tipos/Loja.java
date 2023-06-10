package br.unisinos.shopping.tipos;

import static java.util.Objects.isNull;

public class Loja {
	
	private String nome;
	private int quantidadeFuncionarios;
	private double salarioBaseFuncionario;
	private Endereco endereco;
	private Data dataFundacao;
	private Produto[] estoqueProdutos;
	
	public Loja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, int quantidadeMaximaProdutos) {
		this.nome = nome;
		this.quantidadeFuncionarios = quantidadeFuncionarios;
		this.salarioBaseFuncionario = salarioBaseFuncionario;
		this.endereco = endereco;
		this.dataFundacao = dataFundacao;
        this.estoqueProdutos = new Produto[quantidadeMaximaProdutos];
	}
	
	public Loja(String nome, int quantidadeFuncionarios, Endereco endereco, Data dataFundacao, int quantidadeMaximaProdutos) {
		this.nome = nome;
		this.quantidadeFuncionarios = quantidadeFuncionarios;
		this.salarioBaseFuncionario = -1;
		this.endereco = endereco;
		this.dataFundacao = dataFundacao;
        this.estoqueProdutos = new Produto[quantidadeMaximaProdutos];
	}
	
	public Loja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao) {
		this.nome = nome;
		this.quantidadeFuncionarios = quantidadeFuncionarios;
		this.salarioBaseFuncionario = salarioBaseFuncionario;
		this.endereco = endereco;
		this.dataFundacao = dataFundacao;
	}
	
	//Os construtores abaixo foram mantidos para não 'quebrar' a execução das primeiras etapas dos validadores
	public Loja(String nome, int quantidadeFuncionarios, Endereco endereco, Data dataFundacao) {
		this.nome = nome;
		this.quantidadeFuncionarios = quantidadeFuncionarios;
		this.salarioBaseFuncionario = -1;
		this.endereco = endereco;
		this.dataFundacao = dataFundacao;
	}
	
    public Loja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
    }

    public Loja(String nome, int quantidadeFuncionarios) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = -1;
    }
    
	public Loja() {
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getQuantidadeFuncionarios() {
		return quantidadeFuncionarios;
	}

	public void setQuantidadeFuncionarios(int quantidadeFuncionarios) {
		this.quantidadeFuncionarios = quantidadeFuncionarios;
	}

	public double getSalarioBaseFuncionario() {
		return salarioBaseFuncionario;
	}

	public void setSalarioBaseFuncionario(double salarioBaseFuncionario) {
		this.salarioBaseFuncionario = salarioBaseFuncionario;
	}
	
	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Data getDataFundacao() {
		return dataFundacao;
	}

	public void setDataFundacao(Data dataFundacao) {
		this.dataFundacao = dataFundacao;
	}

	public Produto[] getEstoqueProdutos() {
		return estoqueProdutos;
	}

	public void setEstoqueProdutos(Produto[] estoqueProdutos) {
		this.estoqueProdutos = estoqueProdutos;
	}
	
	
	public double gastosComSalario() {
		return quantidadeFuncionarios * salarioBaseFuncionario;
	}
	
	public char tamanhoDaLoja() {
		if(quantidadeFuncionarios < 10) return 'P';
		else if(10>= quantidadeFuncionarios && quantidadeFuncionarios <= 30) return 'M';
		else return 'G';
	}
	
	public void imprimeProdutos() {
		for(Produto produto : estoqueProdutos) {
			if(!isNull(produto)) System.out.println(produto);
		}
	}
	
	public boolean insereProduto(Produto produto) {
		for(int i = 0; i < estoqueProdutos.length; i++) {
			if(isNull(estoqueProdutos[i])) {
				estoqueProdutos[i] = produto;
				return true;
			}
		}
		return false;
	}
	
	public boolean removeProduto(String nomeProduto) {
		for(int i = 0; i < estoqueProdutos.length; i++) {
			if(nomeProduto.equals(estoqueProdutos[i].getNome())) {
				estoqueProdutos[i] = new Produto();
				return true;
			}
		}
		return false;
	}

	@Override
	public String toString() {
		return "Loja [nome=" + nome + ", quantidadeFuncionarios=" + quantidadeFuncionarios + ", salarioBaseFuncionario="
				+ salarioBaseFuncionario + ", endereco=" + endereco + ", dataFundacao=" + dataFundacao + ", estoqueProdutos=" + estoqueProdutos + "]";
	}
	
}
