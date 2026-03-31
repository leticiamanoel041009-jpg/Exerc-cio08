package exercíciosAula08;
import java.util.Scanner;


public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        int opcao;
        int quantidade;
        double preco = 0;
        double total;
        double desconto = 0;

        System.out.println("=== MENU ===");
        System.out.println("1 - Hambúrguer (R$ 15)");
        System.out.println("2 - Pizza (R$ 20)");
        System.out.println("3 - Refrigerante (R$ 5)");
        
        System.out.print("Escolha uma opção: ");
        opcao = sc.nextInt();

        System.out.print("Digite a quantidade: ");
        quantidade = sc.nextInt();

        // Definindo o preço
        if (opcao == 1) {
            preco = 15;
        } else if (opcao == 2) {
            preco = 20;
        } else if (opcao == 3) {
            preco = 5;
        } else {
            System.out.println("Opção inválida!");
            return;
        }

        total = preco * quantidade;

        // Aplicando desconto
        if (quantidade > 3) {
            desconto = total * 0.10;
            total = total - desconto;
        }

        System.out.println("Valor final: R$ " + total);

        sc.close();
	}

}
