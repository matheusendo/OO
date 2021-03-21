package negocio;

public class Secao {//Classe referente as se��es do mercado, com nome e descri��o
	private String nome;
	private String descricao;
	
	public Secao(String n, String desc) {
		nome = n;
		descricao = desc;
		
	}
	
	public void alterar(String nome, String descricao) {//Altera o nome e descricao da secao
		this.nome = nome;
		this.descricao = descricao;
		
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
	
}
