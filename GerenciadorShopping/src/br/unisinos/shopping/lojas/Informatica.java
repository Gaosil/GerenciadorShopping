package br.unisinos.shopping.lojas;

import br.unisinos.shopping.tipos.Data;
import br.unisinos.shopping.tipos.Endereco;
import br.unisinos.shopping.tipos.Loja;

public class Informatica extends Loja{
	
	private double seguroEletronicos;

	public Informatica(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, int quantidadeMaximaProdutos, double seguroEletronicos) {
		super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, quantidadeMaximaProdutos);
		this.seguroEletronicos = seguroEletronicos;
	}

	//Construtor mantido para não 'quebrar' etapas anteriores
	public Informatica(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, double seguroEletronicos) {
		super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao);
		this.seguroEletronicos = seguroEletronicos;
	}

	public double getSeguroEletronicos() {
		return seguroEletronicos;
	}

	public void setSeguroEletronicos(double seguroEletronicos) {
		this.seguroEletronicos = seguroEletronicos;
	}
	
	@Override
	public String toString() {
		return "Cosmetico [nome=" + super.getNome() + ", quantidadeFuncionarios=" + super.getQuantidadeFuncionarios() + ", salarioBaseFuncionario="
				+ super.getSalarioBaseFuncionario() + ", endereco=" + super.getEndereco() + ", dataFundacao=" + super.getDataFundacao() + ", quantidadeMaximaProdutos=" + super.getEstoqueProdutos() + ", seguroEletronicos=" + seguroEletronicos + "]";
	}
}
