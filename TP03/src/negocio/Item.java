package negocio;

public class Item extends Produto {
	
	private int quantidade = 1;
	private double preco;
	
	public Item(String n, String desc, String uCompra, Secao s, int q, double p) {
		
		nome = n;
		descricao = desc;	
		unidadeCompra = uCompra;
		secao = s;
		quantidade = q;
		preco = p;
		
	}
	
	public void alterarQuantidade(int quantidade) {//Altera a quantidade do item
		this.quantidade = quantidade;
		
	}
	
	public void alterarPreco(double preco) {//Altera o preço do item
		this.preco = preco;
		
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
