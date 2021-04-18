package modelo;

public class CarrinhoCompras extends Compras {
	private Moeda moeda;
	
	public CarrinhoCompras(Moeda m) {
		moeda = m;
	}
	
	public double calcularPrecoTotal() {
		double total = 0;
		for (int i = 0; i < listaItem.size(); i++) {
			if(listaItem.get(i) == null)
				break;
			total = total + (listaItem.get(i).getPreco() * listaItem.get(i).getQuantidade());
           
		} 		
		return total;
	}
	
	public void mostrarPrecoTotal() {
		double total = this.calcularPrecoTotal();
		System.out.printf("Preco total do carrinho : %s %f", moeda.getSimbolo(),total);
	}
	
	
	
}
