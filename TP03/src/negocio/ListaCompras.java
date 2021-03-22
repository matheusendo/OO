package negocio;

public class ListaCompras extends Compras {
	private String nome;
	
	public ListaCompras(String n) {
		nome = n;
	}
	
	public void renomearLista(String nome) {
		this.nome=nome;
	}
	
	public void mostrarItens() {// metodo para mostrar os elementos da lista, por enquanto só printa o nome
		System.out.printf("%s:\n",this.nome);
		for (int i = 0; i < listaItem.length; i++) {
			 if(listaItem[i]==null)
				 break;
			 System.out.printf("Item %d = %s \n", i,listaItem[i].getNome());
             
        } 		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
