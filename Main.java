package mine;

import java.util.Scanner;

public class Main {

	static Scanner Sc = new Scanner(System.in);

	public static void main(String[] args) {

		Conta conta = new Conta();
		Movimentacao movimentacao = new Movimentacao();

		int yes;

		System.out.print("SEJA BEM-VINDO AO SOLAR BANK!\n\nVocê já é cadastrado? Digite 1 para sim e 2 para não");
		yes = Sc.nextInt();

		if (yes == 2) {
			conta.cadastrar();
		} else {
			conta.fazerLogin();
		}

		if (conta.num == 1) {
			while (movimentacao.continuar != 2) {
				int option = 0;
				System.out.println(
						"O que você deseja fazer? \n1 - Ver saldo\n2 - Depositar\n3 - Sacar \n4 - Transferir \n5 - Ver portfólio de criptomoedas \n6 - Ver dados pessoais \n7 - SAIR");

				option = Sc.nextInt();

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
					movimentacao.continuar = 2;
					movimentacao.verPortfolio();
					break;

				case 6:
					conta.mostrarDados();
					break;
				case 7:
					movimentacao.continuar = 2;
					break;
				}
			}
			if (movimentacao.continuar == 2) {
				System.out.println("Obrigado pela preferência, até mais!");
			}

		}
	}
}
