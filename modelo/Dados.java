package modelo;

import java.util.*;

public class Dados {
	private List<Produto> produtos = new ArrayList<Produto>();//listas dos produtos,listas de compras, secoes e moedas
	//private List<Item> itens = new ArrayList<Item>();  
	private List<ListaCompras> listas = new ArrayList<ListaCompras>();  
	private List<Secao> secoes = new ArrayList<Secao>();  
	private List<Moeda> moedas = new ArrayList<Moeda>();  
	private CarrinhoCompras carrinho ;
	

	public void colocaDados() {
		for(int i = 0; i < 12; i++) {//cria cinco secoes e produtos
			secoes.add(new Secao("NomeSecao" + i, "DescricaoSecao" + i));
			produtos.add(new Produto("Produto"+ i, "Descricao"+i , "UnidadeCompra" + i, secoes.get(i) ));			
		}
		for(int i = 0; i < 2; i++) {// cria duas listas e duas moedas
			listas.add(new ListaCompras("NomeLista" + i));
			moedas.add(new Moeda("NomeMoeda" + i, "Simbolo" + i));
		}
		carrinho = new CarrinhoCompras (moedas.get(0));//novo carrinho
		
		for(int i = 0; i < 5; i++) {//adiciona itens as listas de compras e ao carrinho
			Item x = new Item(produtos.get(i).getNome(), produtos.get(i).getDescricao(), produtos.get(i).getUnidadeCompra(), produtos.get(i).getSecao() , i);//pega as informaçoes dos produtos e instancia itens com eles
			listas.get(0).adicionarItem(x);	
			x.setPreco(i*2);
			listas.get(1).adicionarItem(x);	
			carrinho.adicionarItem(x);
		}
		
		
		
	}

	
	public List<Produto> getProdutos() {
		return produtos;
	}


	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

	public List<ListaCompras> getListas() {
		return listas;
	}

	public void setListas(List<ListaCompras> listas) {
		this.listas = listas;
	}

	public List<Secao> getSecoes() {
		return secoes;
	}

	public void setSecoes(List<Secao> secoes) {
		this.secoes = secoes;
	}

	public List<Moeda> getMoedas() {
		return moedas;
	}

	public void setMoedas(List<Moeda> moedas) {
		this.moedas = moedas;
	}

	public CarrinhoCompras getCarrinho() {
		return carrinho;
	}
}
