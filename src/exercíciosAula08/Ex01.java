package exercíciosAula08;
import java.util.Scanner;


public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner receba = new Scanner(System.in);
		int option;
		double preco = 0;
		int quantidade;
		
		System.out.println("Menu Lanchonete");
		System.out.println("- Café (R$4)");
		System.out.println("b- Suco (R$6)");
		System.out.println("c- Sanduíche (R$10)");
		System.out.println("ESCOLHA A OPÇAO");
		
		option = receba.next().charAt(0);
		System.out.println("Digite a quantidade");
		quantidade = receba.nextInt();
		
		switch(option) {
		case 'a':
			preco = 4 * quantidade;
			break;
		case 'b':
			preco = 6 * quantidade;
			break;
		case 'c' :
			preco = 10 * quantidade;
			break;
		default:
			System.out.println("Opcao inválida");
			
		}
		System.out.println("Total da compra R$ " + preco);
		receba.close();

			
		


	}

}
