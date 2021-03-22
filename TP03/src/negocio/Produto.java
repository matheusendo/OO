package negocio;

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
	
	public void alterar(String nome, String descricao, String unidadeCompra, Secao secao) {//Altera o nome , descricao , unidade de compra e secao
		this.nome = nome;
		this.descricao = descricao;
		this.unidadeCompra = unidadeCompra;
		this.secao = secao;
		
	}
	
	public void alterarSecao(String nome, String descricao) {//Altera o nome e descricao da secao do produto
		
		this.secao.alterar(nome, descricao);
		
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
