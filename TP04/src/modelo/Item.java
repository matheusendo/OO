package modelo;

public class Item extends Produto {
	private double preco;
	private int quantidade;
	
	public Item(String n, String desc, String uCompra, Secao s, int q, double p) {
		
		nome = n;
		descricao = desc;	
		unidadeCompra = uCompra;
		secao = s;
		quantidade = q;
		preco = p;
		
	}
	
	public Item(String n, String desc, String uCompra, Secao s, int q) {//sobrecarga, caso seja item da lista não há preço(é dado 0)
		
		nome = n;
		descricao = desc;	
		unidadeCompra = uCompra;
		secao = s;
		quantidade = q;
		preco = 0;
		
	}
	
	public int getQuantidade() {
		return quantidade;
	}
	
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	
}
