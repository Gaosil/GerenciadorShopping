package br.unisinos.shopping.lojas;

import br.unisinos.shopping.tipos.Data;
import br.unisinos.shopping.tipos.Endereco;
import br.unisinos.shopping.tipos.Loja;

public class Vestuario extends Loja{
	
	private boolean produtosImportados;
	
	public Vestuario(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, boolean produtosImportados, int quantidadeMaximaProdutos) {
		super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, quantidadeMaximaProdutos);
		this.produtosImportados = produtosImportados;
	}
	
	//Construtor mantido para não 'quebrar' etapas anteriores
	public Vestuario(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, boolean produtosImportados) {
		super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao);
		this.produtosImportados = produtosImportados;
	}

	public boolean getProdutosImportados() {
		return produtosImportados;
	}

	public void setProdutosImportados(boolean produtosImportados) {
		this.produtosImportados = produtosImportados;
	}
	
	@Override
	public String toString() {
		return "Cosmetico [nome=" + super.getNome() + ", quantidadeFuncionarios=" + super.getQuantidadeFuncionarios() + ", salarioBaseFuncionario="
				+ super.getSalarioBaseFuncionario() + ", endereco=" + super.getEndereco() + ", dataFundacao=" + super.getDataFundacao() + ", quantidadeMaximaProdutos=" + super.getEstoqueProdutos() + ", produtosImportados=" + produtosImportados + "]";
	}

}
