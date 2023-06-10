package br.unisinos.shopping.lojas;

import br.unisinos.shopping.tipos.Data;
import br.unisinos.shopping.tipos.Endereco;
import br.unisinos.shopping.tipos.Loja;

public class Alimentacao extends Loja{
	
	private Data dataAlvara;

	public Alimentacao(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, Data dataAlvara,  int quantidadeMaximaProdutos) {
		super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, quantidadeMaximaProdutos);
		this.dataAlvara = dataAlvara;
	}
	
	//Construtor mantido para não 'quebrar' etapas anteriores
	public Alimentacao(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, Data dataAlvara) {
		super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao);
		this.dataAlvara = dataAlvara;
	}

	public Data getDataAlvara() {
		return dataAlvara;
	}

	public void setDataAlvara(Data dataAlvara) {
		this.dataAlvara = dataAlvara;
	}
	
	@Override
	public String toString() {
		return "Cosmetico [nome=" + super.getNome() + ", quantidadeFuncionarios=" + super.getQuantidadeFuncionarios() + ", salarioBaseFuncionario="
				+ super.getSalarioBaseFuncionario() + ", endereco=" + super.getEndereco() + ", dataFundacao=" + super.getDataFundacao() + ", quantidadeMaximaProdutos=" + super.getEstoqueProdutos() + ", dataAlvara=" + dataAlvara + "]";
	}
}
