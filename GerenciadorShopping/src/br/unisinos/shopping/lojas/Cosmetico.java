package br.unisinos.shopping.lojas;

import br.unisinos.shopping.tipos.Data;
import br.unisinos.shopping.tipos.Endereco;
import br.unisinos.shopping.tipos.Loja;

public class Cosmetico extends Loja{
	
	private double taxaComercializacao;
	
	public Cosmetico(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco,
			Data dataFundacao, int quantidadeMaximaProdutos, double taxaComercializacao) {
		super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, quantidadeMaximaProdutos);
		this.taxaComercializacao = taxaComercializacao;
	}
	
	//Construtor mantido para não 'quebrar' etapas anteriores
	public Cosmetico(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco,
			Data dataFundacao, double taxaComercializacao) {
		super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao);
		this.taxaComercializacao = taxaComercializacao;
	}

	public double getTaxaComercializacao() {
		return taxaComercializacao;
	}

	public void setTaxaComercializacao(double taxaComercializacao) {
		this.taxaComercializacao = taxaComercializacao;
	}

	@Override
	public String toString() {
		return "Cosmetico [nome=" + super.getNome() + ", quantidadeFuncionarios=" + super.getQuantidadeFuncionarios() + ", salarioBaseFuncionario="
				+ super.getSalarioBaseFuncionario() + ", endereco=" + super.getEndereco() + ", dataFundacao=" + super.getDataFundacao() + ", quantidadeMaximaProdutos=" + super.getEstoqueProdutos() + ", taxaComercializacao=" + taxaComercializacao + "]";
	}
}
