package br.unisinos.shopping.principal;

import br.unisinos.shopping.tipos.Data;
import br.unisinos.shopping.tipos.Endereco;
import br.unisinos.shopping.tipos.Loja;
import br.unisinos.shopping.tipos.Produto;
import br.unisinos.shopping.tipos.Teclado;

public class Principal {
	
	public static void main(String[] args) {

		int opcao = 0;
		
		System.out.println("Seja bem-vindo!\n");
		
		while (opcao != 3) {
			opcao = Teclado.leInt("Escolha uma das opções abaixo:\n (1) Criar uma loja\n (2) Criar um produto\n (3) Sair");
			switch (opcao) {
			case 1:
				Loja loja = novaLoja();
				System.out.println("Nome da loja criada: " + loja.getNome());
				System.out.println("Quantidade de funcionários: " + loja.getNome());
				System.out.println("Salário base dos funcionários: " + loja.getNome());
				System.out.println("Data de fundação da loja: " + loja.getDataFundacao().toString());
				System.out.println("Endereço da loja criada: " + loja.getEndereco().toString());
				break;
			case 2:
				Produto produto = novoProduto();
				System.out.println("Produto criado com sucesso!");
				if(produto.estaVencido(new Data(9,6,2023))) {
					System.out.println("\nPRODUTO VENCIDO");
				}
				else {
					System.out.println("\nPRODUTO NÃO VENCIDO");
				}
				break;
			case 3:
				break;
			default:
				System.out.println("\nOpção inválida\n");
			}
		}
	}
	
    public static Loja novaLoja() {
		String nome = Teclado.leString("\nDigite o nome da nova loja: ");
		int funcionarios = Teclado.leInt("\nDigite a quantidade de funcionários da loja: ");
		double salario = Teclado.leDouble("\nDigite o salário base dos funcionários da loja: ");
		System.out.println("\nDigite a data de fundação da loja.\n");
        Data dataFundacao = novaData();
        System.out.println("\nDigite as informações referente ao seu endereço");
        Endereco endereco = novoEndereco();
        return new Loja(nome, funcionarios, salario, endereco, dataFundacao);
    }

    public static Produto novoProduto() {
		String nome = Teclado.leString("\nDigite o nome do produto: ");
		double preco = Teclado.leDouble("\nDigite o preço do produto cadastrado: ");
		System.out.println("\nDigite a data de validade do produto: ");
		Data data = novaData();
        return new Produto(nome, preco, data);	
    }

    private static Endereco novoEndereco() {
		String nomedaRua = Teclado.leString("\nDigite o nome da rua: ");
		String numero = Teclado.leString("\nDigite o número do seu endereço: ");
		String cidade = Teclado.leString("\nDigite o nome da cidade: ");
		String pais = Teclado.leString("\nDigite o nome do país: ");
		String estado = Teclado.leString("\nDigite o nome do estado: ");
		String cep = Teclado.leString("\nDigite o seu CEP: ");
        String complemento = Teclado.leString("\nDigite o complemento do seu endereço: ");

        return new Endereco(nomedaRua, cidade, estado, pais, cep, numero, complemento);
    }

    private static Data novaData() {
    	int dia = Teclado.leInt("\nDigite o dia: ");
        int mes = Teclado.leInt("\nDigite o mês: ");
        int ano = Teclado.leInt("\nDigite o ano: ");
        return new Data(dia, mes, ano);
    }

}

