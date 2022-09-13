package mine;
import java.util.Scanner;

public class Main {
	static Scanner Sc = new Scanner(System.in);
	
	public static void main(String[] args) {

		Pessoa pessoa = new Pessoa();
		Movimentacao movimentacao = new Movimentacao();

		int yes;

		System.out.print("SEJA BEM-VINDO AO SOLAR BANK!\n\nVocê já é cadastrado? Digite 1 para sim e 2 para não");
		String sYes = Sc.next();

		yes = Integer.valueOf(sYes);

		if (yes == 2) {
			pessoa.cadastrar();
		}
		if (yes == 1 || pessoa.yes == 1) {
			pessoa.fazerLogin();
		}

		if (pessoa.num == 1) {
			while (movimentacao.continuar != 1) {
				int option = 0;
				System.out.println(
						"O que você deseja fazer? \n1 - Ver saldo\n2 - Depositar\n3 - Sacar \n4 - Transferir \n5 - Ver portfólio de criptomoedas \n6 - SAIR");
				
				option = Sc.nextInt();
				
//				Sc.nextLine();
//				
//				String sOption = Sc.nextLine();
//				
//				int option = Integer.valueOf(sOption);
				
				switch (option) {
				case 1:
					movimentacao.mostrarSaldo();
					break;
				case 2:
					movimentacao.depositar();
					break;
				case 3:
					movimentacao.sacar();
					break;

				case 4:
					movimentacao.transferir();
					break;

				case 5: 
					movimentacao.verPortfolio();
					break;
					
				case 6:
					movimentacao.continuar = 1;
					break;
				}
			}
			if (movimentacao.continuar == 1) {
				System.out.println("Obrigado pela preferência, até mais!");
			}
			
		}
	}
}
