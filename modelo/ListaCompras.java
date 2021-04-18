package modelo;



public class ListaCompras extends Compras {
	private String nome;
	
	public ListaCompras(String n) {
		nome = n;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
