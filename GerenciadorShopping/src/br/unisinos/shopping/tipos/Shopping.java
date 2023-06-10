package br.unisinos.shopping.tipos;

import static java.util.Objects.isNull;

import java.util.Arrays;

import br.unisinos.shopping.lojas.Alimentacao;
import br.unisinos.shopping.lojas.Bijuteria;
import br.unisinos.shopping.lojas.Cosmetico;
import br.unisinos.shopping.lojas.Informatica;
import br.unisinos.shopping.lojas.Vestuario;

public class Shopping {

	private String nome;
	private Endereco endereco;
	private Loja[] lojas;
	
	public Shopping(String nome, Endereco endereco, int quantidadeMaximaLojas) {
		this.nome = nome;
		this.endereco = endereco;
        this.lojas = new Loja[quantidadeMaximaLojas];
	}
	
	public Shopping() {
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Loja[] getLojas() {
		return lojas;
	}

	public void setLojas(Loja[] lojas) {
		this.lojas = lojas;
	}
	
	public boolean insereLoja(Loja loja) {
		for(int i = 0; i < lojas.length; i++) {
			if(isNull(lojas[i])) {
				lojas[i] = loja;
				return true;
			}
		}
		return false;
	}
	
	public boolean removeLoja(String nomeLoja) {
		for(int i = 0; i < lojas.length; i++) {
			if(nomeLoja.equals(lojas[i].getNome())) {
				lojas[i] = new Loja();
				return true;
			}
		}
		return false;
	}
	
	public int quantidadeLojasPorTipo(String tipo) {
		int quantidadeTotal = 0;
		for(int i = 0; i < lojas.length; i++) {
			switch(tipo) {
			case "Informática":
				if(lojas[i] instanceof Informatica) quantidadeTotal++;
				break;
            case "Alimentação":
            	if(lojas[i] instanceof Alimentacao) quantidadeTotal++;
				break;
            case "Bijuteria":
            	if(lojas[i] instanceof Bijuteria) quantidadeTotal++;
				break;
            case "Vestuário":
            	if(lojas[i] instanceof Vestuario) quantidadeTotal++;
				break;
            case "Cosmético":
            	if(lojas[i] instanceof Cosmetico) quantidadeTotal++;
				break;
			default:
				break;
			}
		}
		if(quantidadeTotal != 0) return quantidadeTotal;
		else return -1;
	}
	
	public Informatica lojaSeguroMaisCaro() {
		Informatica informaticaAux = null;
		Informatica informatica = null;
		for(int i = 0; i < lojas.length; i++) {
			if(lojas[i] instanceof Informatica) {
				informatica = (Informatica) lojas[i];
				if(isNull(informaticaAux)) informaticaAux = informatica;
				
				if(informatica.getSeguroEletronicos() > informaticaAux.getSeguroEletronicos()){
					informaticaAux = informatica;
					}
			}
		}
		return informaticaAux;
	}

	@Override
	public String toString() {
		return "Shopping [nome=" + nome + ", endereco=" + endereco + ", lojas=" + Arrays.toString(lojas) + "]";
	}
	
}
