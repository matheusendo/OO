package modelo;

import java.util.ArrayList;
import java.util.List;

public abstract class Compras {//classe abstrata Compras, utilizada para a lista e para o carrinho
	
	protected List<Item> listaItem = new ArrayList<Item>();//lista de itens
	
	public Compras(){//a classe nao pode ser instanciada, chama o construtor de object, que nao faz nada
		super();		
	}
	
	public void mostrarItens() {//Metodo a ser sobreescrito nas classes filhas
	 		
	}
	
	public void retirarItens(Item item) { // metodo para retirar itens da lista
		listaItem.remove(item);
	}
	
	public void adicionarItem(Item item) {	
		listaItem.add(item);
	}

	public List<Item> getListaItem() {
		return listaItem;
	}

	public void setListaItem(List<Item> listaItem) {
		this.listaItem = listaItem;
	}
}
