package negocio;

public class CarrinhoCompras extends Compras {
	private Moeda moeda;
	
	public CarrinhoCompras(Moeda m) {
		moeda = m;
	}
	
	public void mostrarItens() {// metodo para mostrar os elementos da lista, por enquanto só printa o nome
		System.out.printf("Carrinho de Compras:\n");
		for (int i = 0; i < listaItem.length; i++) {
			 if(listaItem[i]==null)
				 break;
			 System.out.printf("Item %d = %s \n", i,listaItem[i].getNome());
             
        } 		
	}
	
	public double calcularPrecoTotal() {
		double total = 0;
		for (int i = 0; i < listaItem.length; i++) {
			if(listaItem[i]==null)
				break;
			total = total + (listaItem[i].getPreco() * listaItem[i].getQuantidade());
           
		} 		
		return total;
	}
	
	public void mostrarPrecoTotal() {
		double total = this.calcularPrecoTotal();
		System.out.printf("Preco total do carrinho : %s %f", moeda.getSimbolo(),total);
	}
	
	
	
}
