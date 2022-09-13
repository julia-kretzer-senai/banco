package mine;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		Pessoa pessoa = new Pessoa();
		Movimentacao movimentacao = new Movimentacao();

		int yes;

		System.out.print("Você já é cadastrado? Digite 1 para sim e 2 para não");
		String sYes = Sc.nextLine();

		yes = Integer.valueOf(sYes);

		if (yes == 2) {
			pessoa.cadastrar();
		}
		if (yes == 1 || pessoa.yes == 1) {
			pessoa.fazerLogin();
		}

		if (pessoa.num == 1) {
			String sOption;
			while (movimentacao.continuar != 1) {
				System.out.println(
						"O que você deseja fazer? \n1 - Ver saldo\n2 - Depositar\n3 - Sacar \n4 - Transferir \n5 - SAIR");
				sOption = Sc.nextLine();
				
				int option = Integer.parseInt(sOption);
				
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
