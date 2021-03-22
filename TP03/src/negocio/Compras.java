package negocio;

public abstract class Compras {//classe abstrata Compras, utiliza para a lista e para o carrinho
	protected Item[] listaItem = new Item[250];//tamanha maximo de itens na lista de compras e do carrinho
	
	public Compras(){//a classe nao pode ser instanciada, chama o construtor de object, que nao faz nada
		super();		
	}
	
	public void mostrarItens() {//Metodo a ser sobreescrito nas classes filhas
	 		
	}
	
	
	
	public void retirarItens(Item item) { // metodo para retirar itens da lista
		Item[] copia = new Item[250];//Faz uma copia do tamanho do array

		for (int i = 0, j = 0; i < listaItem.length; i++) {//itera sobre o array copiando o conteudo, checa se a descricao for a mesma, se for nao copia
		    if(listaItem[i]==null)
		    	break;
			if (item.getDescricao()==listaItem[i].getDescricao()) {
		        copia[j++] = listaItem[i];
		    }
		}
		listaItem = copia;
	}
	
	public void adicionarItem(Item item) {	
		for (int i = 0; i < listaItem.length; i++) {//itera sobre o array ate achar uma referencia null, se for null adiciona o item
		    if (listaItem[i] == null ) {
		        listaItem[i]=item;
		        break;
		    }
		}
	}

	public Item[] getListaItem() {
		return listaItem;
	}

	public void setListaItem(Item[] listaItem) {
		this.listaItem = listaItem;
	}
}
