package modelo;

public class Produto {//Classe referente aos produtos, seus atributos sao protegidos pois e superclasse de Item
	
	protected String nome;
	protected String descricao;
	protected String unidadeCompra;
	protected Secao secao;
	
	public Produto() {
		super();
	}
	
	public Produto(String n, String desc, String uCompra, Secao s) {
		
		nome = n;
		descricao = desc;	
		unidadeCompra = uCompra;
		secao = s;
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getUnidadeCompra() {
		return unidadeCompra;
	}

	public void setUnidadeCompra(String unidadeCompra) {
		this.unidadeCompra = unidadeCompra;
	}

	public Secao getSecao() {
		return secao;
	}

	public void setSecao(Secao secao) {
		this.secao = secao;
	}
	
}
