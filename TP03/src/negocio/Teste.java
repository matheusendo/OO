package negocio;



public class Teste {//Teste das funções

	public static void main(String[] args) {
		
		//Testes referente as classes Secao e Moeda, testando as funcoes de alteração
		Secao secao = new Secao("Feira","Àrea de frutas, legumes e verduras");
		Moeda moeda = new Moeda("Real","R$");
		
		System.out.printf("%s , %s\n", secao.getNome(),secao.getDescricao());
		System.out.printf("%s , %s\n", moeda.getNome(),moeda.getSimbolo());
		
		//Altera secao e moeda
		secao.alterar("Congelados", "Àrea de produtos congelados");
		moeda.alterar("Dolar", "US$");
		
		//Checa se a alteracao foi feita
		System.out.printf("%s , %s\n", secao.getNome(),secao.getDescricao());
		System.out.printf("%s , %s\n", moeda.getNome(),moeda.getSimbolo());
		
		secao = null;//deletar secao
		
		
		
		//Testes referentes as classes Produto e Item
		Secao s1 = new Secao("Doces","Àrea de biscoitos e chocolates");
		Produto p1 = new Produto("Oreo", "Biscoito recheado", "Pacote", s1);
		Item i1 = new Item("Oreo", "Biscoito recheado", "Pacote", s1, 2, 3.4);
		//printa as informacoes, vou fazer o toString depois
		System.out.printf("\n%s , %s, %s, %s\n", p1.getNome(), p1.getDescricao(), p1.getUnidadeCompra(),p1.secao.getNome());
		System.out.printf("%s , %s, %s , %d , %f\n", i1.getNome(), i1.getDescricao(), i1.getUnidadeCompra(), i1.getQuantidade(), i1.getPreco());
		
		//altera a secao, preco e quantidade
		p1.alterarSecao("Congelados", "Àrea de produtos congelados");
		i1.alterarPreco(4.5);
		i1.alterarQuantidade(10);
		
		//Checa se a alteracao foi feita
		//printa as informacoes, vou fazer o toString depois
		System.out.printf("%s , %s, %s, %s\n", p1.getNome(), p1.getDescricao(), p1.getUnidadeCompra(),p1.secao.getNome());
		System.out.printf("%s , %s, %s , %d , %f\n", i1.getNome(), i1.getDescricao(), i1.getUnidadeCompra(), i1.getQuantidade(), i1.getPreco());
		
		
		
		//Testes referentes as classes Compras, ListaCompras e CarrinhoCompras.
		Item i2 = new Item("Bono", "Biscoito recheado sabor chocolate", "Pacote", s1, 3, 4);//Cria novo item
		ListaCompras l1 = new ListaCompras("Lista 1");//Cria nova lista de compras
		l1.adicionarItem(i1);//Adiciona os itens i1 e i2
		l1.adicionarItem(i2);
		l1.mostrarItens();//Mostra os itens
		l1.retirarItens(i1);//retira o item 1 da lista
		l1.mostrarItens();
		
		CarrinhoCompras c1 = new CarrinhoCompras(moeda);//Novo carrinho
		c1.adicionarItem(i1);//adiciona os itens no carrinho
		c1.adicionarItem(i2);
		c1.mostrarItens();
		c1.mostrarPrecoTotal();//calcula e mostra o preco total, deve ser 57(10 * 4.5 + 3 * 4)
		
		
	}

}
