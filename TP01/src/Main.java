import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Arrays;

public class Main {

	static double [][] arrayTemp = new double[120][31]; /*array de array para as temperaturas */
	
	static Scanner ler = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		for (double[] coluna: arrayTemp) {/*inicializa o array com valor -200000 para saber se ele foi ou não preenchido*/
		    Arrays.fill(coluna, -200000);
		}
		for(int i=1 ; i<=31 ; i++) { /*popula janeiro de 2020 com valores aleatorios entre -50 e 50*/
			arrayTemp[108][i-1]= ThreadLocalRandom.current().nextDouble(-50, 50);
			
		}
		menu();

	}
	
	public static int printaMenu() {/* Printa as opções do menu na tela e retorna a opção*/
		int opcao=0;
		
		do {/*enquanto a opção não for válida continua no menu*/
			System.out.print("Bem Vindo ao INMTE\n");  
			System.out.print("1.Entrada das temperaturas\n");  
			System.out.print("2.Cálculo da temperatura média\n"); 
			System.out.print("3.Cálculo da temperatura mínima\n"); 
			System.out.print("4.Cálculo da temperatura máxima\n"); 
			System.out.print("5.Relatório meteorológico\n"); 
			System.out.print("6.Sair\n"); 
			System.out.print("Digite a opção desejada:\n");
			opcao = ler.nextInt();
			if (opcao>6 || opcao <1) {
				System.out.print("Opção Inválida\n\n");
			}
		} while (opcao>6 || opcao <1);
			
		return opcao;
	}
	
	public static int[] verificaData() {/*pede a data para o usuario e verifica sua validade*/
		int mes,ano;
		int[] data = new int[2];
		
		
		do {/*continua pedindo a data até ela ser válida*/
			System.out.print("Entre com o mês(em numeral): \n");
			mes = ler.nextInt();
			System.out.print("Entre com o ano(2011 a 2020): \n");
			ano = ler.nextInt();
			if(mes>12 || mes<1 || ano<2011 || ano>2020) {
				System.out.print("Data Inválida: \n");
			}
		}while( mes>12 || mes<1 || ano<2011 || ano>2020 );
		
		data[0]=mes;
		data[1]=ano;
		return data;
		
	}
	
	public static int calcDias(int mes, int ano) {/*calc o numero de dias do mes, levando em conta também o ano*/
		if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10|| mes == 12) {
            return 31;
        } 
		else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            return 30;
        } 
		else if (mes == 2) {/*caso seja fevereiro checa se o ano é bissexto*/
        	if ((ano%4 == 0 && ano%100 != 0) || ano%400 == 0) {
        		return 29;
        	}
        	else {
        		return 28;
        	}
        }
		return 0;
	}
	
	public static void entradaTemp() {/*funcao para a entrada dos dados*/
		int dias, mes, ano;
		int posArray;
		int[] data = new int[2];
		String texto;
		double tempMedia;
		
		
		
		data=verificaData();/*utiliza função para pegar e validar a data*/
		mes=data[0];
		ano=data[1];
		
		posArray=((ano-2011)*12)+mes-1; /*calcula a posicao no array referente as temperaturas, utilizando o ano e mes, subtraindo 1 devido a indexação começar em 0*/
		dias = calcDias(mes,ano); /*função para o calculo do numero de dias do mes/ano */
		
		
		for(int i=1 ; i<=dias ; i++) { /*dado o numero de dias do mes pede a entrada das medias de cada dia*/
			System.out.print("Entre com a media do dia " + i + "(em celsius):\n");
			texto = ler.next();/*pega o valor da temperatura como texto para poder aceitar ambos , e . para sepração decimal*/
			tempMedia = Double.parseDouble(texto.replace(',','.'));/*faz o parser de texto para double e substitui , por . */
			arrayTemp[posArray][i-1]=tempMedia;
			
		}
		System.out.print("Obrigado!\n");
		
		System.out.println("Pressione \"ENTER\" para voltar ao menu");
		ler.nextLine();
		menu();/*volta ao menu apos a inserção dos dados*/
		
	}
	
	public static void mediaTemp(int opcao, int[] data) {/*se a opcao for 1 pede a data ao usuario e sobreescreve o array(veio do menu), caso contrário não(veio do relatorio)*/
		int dias, mes, ano;
		int posArray;
		
		double total=0;
		
		if(opcao==1) {/*reescreve a data*/
			data = verificaData(); /*utiliza função para pegar e validar a data*/
			mes=data[0];
			ano=data[1];
		}
		else {
			mes=data[0];
			ano=data[1];
		}
		posArray=((ano-2011)*12)+mes-1; /*calcula a posicao no array referente as temperaturas, utilizando o ano e mes, subtraindo 1 devido a indexação começar em 0*/
		dias = calcDias(mes,ano); /*função para o calculo do numero de dias do mes/ano */
		
		for(int i=1 ; i<=dias ; i++) { /*dado o numero de dias do mes calcula a media*/
			if(arrayTemp[posArray][i-1]==-200000) {/*checa se existem dados reais no array*/
				System.out.println("Não existem dados referente ao mes.\n");
				System.out.println("Pressione \"ENTER\" para voltar ao menu");
				ler.nextLine();
				ler.nextLine();
				menu();
			}
			
			total=total + arrayTemp[posArray][i-1];
		}
		System.out.print("\nA média do mês "+ mes + " do ano de " + ano + " foi: " + total/dias+ "°\n");
		if(opcao==1) {
			System.out.println("Pressione \"ENTER\" para voltar ao menu");
			ler.nextLine();
			ler.nextLine();
			menu();
		}
		
	}
	
	public static void minTemp(int opcao, int[] data) {/*se a opcao for 1 pede a data ao usuario e sobreescreve o array(veio do menu), caso contrário não(veio do relatorio)*/
		int dias, mes, ano;
		int posArray;
		double min;
		
		if(opcao==1) {/*reescreve a data*/
			data = verificaData(); /*utiliza função para pegar e validar a data*/
			mes=data[0];
			ano=data[1];
		}
		else {
			mes=data[0];
			ano=data[1];
		}
		
		posArray=((ano-2011)*12)+mes-1; /*calcula a posicao no array referente as temperaturas, utilizando o ano e mes, subtraindo 1 devido a indexação começar em 0*/
		dias = calcDias(mes,ano); /*função para o calculo do numero de dias do mes/ano */
		
		min=arrayTemp[posArray][0]; /*minimo inicial é o primeiro valor*/
		for(int i=2 ; i<=dias ; i++) { /*dado o numero de dias do mes pega o minimo*/
			if(arrayTemp[posArray][i-1]==-200000) {/*checa se existem dados reais no array*/
				System.out.println("Não existem dados referente ao mes.\n");
				System.out.println("Pressione \"ENTER\" para voltar ao menu");
				ler.nextLine();
				ler.nextLine();
				menu();
			}
			if (arrayTemp[posArray][i-1]<min) {/*se a media do dia for menor que o min atual, o min e atualizado*/
				min=arrayTemp[posArray][i-1];
			}
		}
		System.out.print("\nA temperatura minima do mês "+ mes + " do ano de " + ano + " foi: " + min+ "°\n");
		
		if(opcao==1) {/*printa os dias em que ocorreram as temperaturas minimas somente no caso 1, do menu*/
			System.out.print("Essa temperatura foi atingida na(s) data(s): \n");
			for(int i=1 ; i<=dias ; i++) { /*dado o minimo percorre o array para checar se existem outros dias com a mesma media */
				if (arrayTemp[posArray][i-1]==min) {
					System.out.println(i + "/" + mes + "/" + ano);
				}
			}
			System.out.println("Pressione \"ENTER\" para voltar ao menu");
			ler.nextLine();
			ler.nextLine();
			menu();
		}
		
	}
	
	public static void maxTemp(int opcao, int[] data) {/*se a opcao for 1 pede a data ao usuario e sobreescreve o array(veio do menu), caso contrário não(veio do relatorio)*/
		int dias, mes, ano;
		int posArray;
		double max;
		
		if(opcao==1) {/*reescreve a data*/
			data = verificaData(); /*utiliza função para pegar e validar a data*/
			mes=data[0];
			ano=data[1];
		}
		else {
			mes=data[0];
			ano=data[1];
		}
		
		posArray=((ano-2011)*12)+mes-1; /*calcula a posicao no array referente as temperaturas, utilizando o ano e mes, subtraindo 1 devido a indexação começar em 0*/
		dias = calcDias(mes,ano); /*função para o calculo do numero de dias do mes/ano */
		
		max=arrayTemp[posArray][0]; /*maximo inicial é o primeiro valor*/
		for(int i=2 ; i<=dias ; i++) { /*dado o numero de dias do mes pega o maximo*/
			if(arrayTemp[posArray][i-1]==-200000) {/*checa se existem dados reais no array*/
				System.out.println("Não existem dados referente ao mes.\n");
				System.out.println("Pressione \"ENTER\" para voltar ao menu");
				ler.nextLine();
				ler.nextLine();
				menu();
			}
			if (arrayTemp[posArray][i-1]>max) {/*se a media do dia for maior que o max atual, o max e atualizado*/
				max=arrayTemp[posArray][i-1];
			}
		}
		System.out.print("\nA temperatura maxima do mês "+ mes + " do ano de " + ano + " foi: " + max + "°\n");
		
		if(opcao==1) {/*printa os dias em que ocorreram as temperaturas maximas somente no caso 1, do menu*/
			System.out.print("Essa temperatura foi atingida na(s) data(s): \n");
			for(int i=1 ; i<=dias ; i++) { /*dado o maximo percorre o array para checar se existem outros dias com a mesma media */
				if (arrayTemp[posArray][i-1]==max) {
					System.out.println(i + "/" + mes + "/" + ano);
				}
			}
			System.out.println("Pressione \"ENTER\" para voltar ao menu");
			ler.nextLine();
			ler.nextLine();
			menu();
		}
		
	}
	
	public static void relTemp() {
		int dias, mes, ano;
		int posArray;
		int[] data = new int[2];
		double tempMedia;
		
		data=verificaData();/*utiliza função para pegar e validar a data*/
		mes=data[0];
		ano=data[1];
		
		posArray=((ano-2011)*12)+mes-1; /*calcula a posicao no array referente as temperaturas, utilizando o ano e mes, subtraindo 1 devido a indexação começar em 0*/
		dias = calcDias(mes,ano); /*função para o calculo do numero de dias do mes/ano */
		
		for(int i=1 ; i<=dias ; i++) { /*dado o numero de dias do mes mostra a media de cada dia*/
			if(arrayTemp[posArray][i-1]==-200000) {/*checa se existem dados reais no array*/
				System.out.println("Não existem dados referente ao mes.\n");
				System.out.println("Pressione \"ENTER\" para voltar ao menu");
				ler.nextLine();
				ler.nextLine();
				menu();
			}
			tempMedia = arrayTemp[posArray][i-1];
			System.out.print("A temperatura media do dia " + i + " do mês "+ mes + " do ano de " + ano + " foi: " + tempMedia + "°\n");
			
		}
		
		System.out.println("Pressione \"ENTER\" para continuar\n");
		ler.nextLine();
		ler.nextLine();
		
		mediaTemp(2,data);/*utiliza funcao para calcular e mostrar a media do mes,faz a chamada com parametro 2 para funcao saber que nao e necessario perguntar a data ao usuario*/
		System.out.println("Pressione \"ENTER\" para continuar");
		ler.nextLine();
		
		minTemp(2,data);/*utiliza funcao para calcular e mostrar o minimo do mes,faz a chamada com parametro 2 para funcao saber que nao e necessario perguntar a data ao usuario*/
		System.out.println("Pressione \"ENTER\" para continuar");
		ler.nextLine();
		
		maxTemp(2,data);/*utiliza funcao para calcular e mostrar o maximo do mes,faz a chamada com parametro 2 para funcao saber que nao e necessario perguntar a data ao usuario*/
		System.out.println("Pressione \"ENTER\" para voltar ao menu");
		ler.nextLine();
		
		menu();
	}
	
	public static void menu() {/*utiliza switch para determinar a opcaoo desejada*/
		int opcao=0;
		int[] data = new int[2];
		
		opcao = printaMenu();/*utiliza funcao para printar o menu e obter a opcao*/
		
		switch (opcao) {
			case 1:
				entradaTemp();
				break;
			case 2:
				mediaTemp(1,data);
				break;
			case 3:
				minTemp(1,data);
				break;
			case 4:
				maxTemp(1,data);
				break;
			case 5:
				relTemp();
				break;
			case 6:
				System.exit(0); 
				break;
		}
		
	}

}
