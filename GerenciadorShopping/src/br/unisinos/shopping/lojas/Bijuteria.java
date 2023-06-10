package br.unisinos.shopping.lojas;

import br.unisinos.shopping.tipos.Data;
import br.unisinos.shopping.tipos.Endereco;
import br.unisinos.shopping.tipos.Loja;

public class Bijuteria extends Loja{
	
	private double metaVendas;

	public Bijuteria(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao,  int quantidadeMaximaProdutos, double metaVendas) {
		super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, quantidadeMaximaProdutos);
		this.metaVendas = metaVendas;
	}
	
	//Construtor mantido para não 'quebrar' etapas anteriores
	public Bijuteria(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, double metaVendas) {
		super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao);
		this.metaVendas = metaVendas;
	}

	public double getMetaVendas() {
		return metaVendas;
	}

	public void setMetaVendas(double metaVendas) {
		this.metaVendas = metaVendas;
	}
	
	@Override
	public String toString() {
		return "Cosmetico [nome=" + super.getNome() + ", quantidadeFuncionarios=" + super.getQuantidadeFuncionarios() + ", salarioBaseFuncionario="
				+ super.getSalarioBaseFuncionario() + ", endereco=" + super.getEndereco() + ", dataFundacao=" + super.getDataFundacao() + ", quantidadeMaximaProdutos=" + super.getEstoqueProdutos() + ", metaVendas=" + metaVendas + "]";
	}

}
