package negocio;

public class Moeda {//moeda dos valores dos produtos, nome da simbolo e simbolo(ex: R$)
	private String nome;
	private String simbolo;
	
	
	public Moeda(String n, String s) {
		nome = n;
		simbolo = s;
		
	}

	
	public void alterar(String nome, String simbolo) {//altera o nome e simbolo da moeda.
		this.nome = nome;
		this.simbolo = simbolo;
	}
	
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getSimbolo() {
		return simbolo;
	}


	public void setSimbolo(String simbolo) {
		this.simbolo = simbolo;
	}
	
}
