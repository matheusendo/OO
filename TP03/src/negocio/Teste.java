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
		
		System.out.printf("%s , %s, %s, %s\n", p1.getNome(), p1.getDescricao(), p1.getUnidadeCompra(),p1.secao.getNome());
		System.out.printf("%s , %s, %s , %d , %f\n", i1.getNome(), i1.getDescricao(), i1.getUnidadeCompra(), i1.getQuantidade(), i1.getPreco());
		
		//altera a secao, preco e quantidade
		p1.alterarSecao("Congelados", "Àrea de produtos congelados");
		i1.alterarPreco(4.5);
		i1.alterarQuantidade(10);
		
		//Checa se a alteracao foi feita
		System.out.printf("%s , %s, %s, %s\n", p1.getNome(), p1.getDescricao(), p1.getUnidadeCompra(),p1.secao.getNome());
		System.out.printf("%s , %s, %s , %d , %f\n", i1.getNome(), i1.getDescricao(), i1.getUnidadeCompra(), i1.getQuantidade(), i1.getPreco());
	}

}
