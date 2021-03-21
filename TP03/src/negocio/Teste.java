package negocio;



public class Teste {//Teste das funções

	public static void main(String[] args) {
		
		//Testa referente as classes Secao e Moeda, testando as funcoes de alteração
		Secao secao = new Secao("Frios","Frios");
		Moeda moeda = new Moeda("Real","R$");
		
		System.out.printf("%s , %s\n", secao.getNome(),secao.getDescricao());
		System.out.printf("%s , %s\n", moeda.getNome(),moeda.getSimbolo());
		
		secao.alterar("Congelados", "Congelados");
		moeda.alterar("Dolar", "US$");
		
		System.out.printf("%s , %s\n", secao.getNome(),secao.getDescricao());
		System.out.printf("%s , %s\n", moeda.getNome(),moeda.getSimbolo());
		
		secao = null;//deletar secao
		
	}

}
