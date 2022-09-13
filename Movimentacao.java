package mine;

import java.util.Scanner;

public class Movimentacao {
	Scanner Sc = new Scanner(System.in);
	public double saldo = 0;
	public double deposito, saque, transferencia;
	public int continuar = 0;
	
	public void mostrarSaldo() {
		System.out.print("Seu saldo atual é de R$" + saldo);
		System.out.println("\nPara encerrar a sessão, digite 1\nPara continuar, digite 2");
		continuar = Sc.nextInt();
	}
	
	public void depositar() {
		System.out.print("Insira o valor do deposito: ");
		deposito = Sc.nextDouble();
		saldo = saldo + deposito;

		System.out.println("\nDepósito realizado com sucesso! Seu saldo atual é de R$" + saldo);
		System.out.println("\nPara encerrar a sessão, digite 1\nPara continuar, digite 2");
		continuar = Sc.nextInt();
	}
	
	public void sacar() {
		System.out.println("Insira o valor que deseja sacar: ");
		saque = Sc.nextDouble();

		while (saque > saldo) {
			System.out.print("Você não possui esse saldo em conta. Insira outro valor: ");
			saque = Sc.nextDouble();
		}
		saldo = saldo - saque;
		System.out.println("\nSaque realizado com sucesso! Seu saldo atual é de R$" + saldo);
		System.out.println("\nPara encerrar a sessão, digite 1\nPara continuar, digite 2");
		continuar = Sc.nextInt();
	}
	
	public void transferir() {
		int confirmar = 0;

		while (confirmar != 1) {
			System.out.print("Digite o número da conta para a qual deseja transferir: ");
			int recebe = Sc.nextInt();
			System.out.print("Digite o valor que deseja transferir: ");
			transferencia = Sc.nextDouble();

			while (transferencia > saldo) {
				System.out.print("Você não possui esse saldo em conta. Insira outro valor: ");
				transferencia = Sc.nextDouble();
			}

			System.out.print("Cofirmar transferência de R$" + transferencia + " para conta nº" + recebe
					+ "?\n 1 - SIM \n 2 - NÃO");
			confirmar = Sc.nextInt();

			if (confirmar == 1) {
				saldo = saldo - transferencia;
			}
		}

		System.out.println("\nTransferência realizada com sucesso! Seu saldo atual é de R$" + saldo);
		System.out.println("\nPara encerrar a sessão, digite 1\nPara continuar, digite 2");
		continuar = Sc.nextInt();
	}
	
	public void verPortfolio() {
		double btc = 0;
		double eth = 0;
		double doge = 0;
		System.out.println("CRIPTOPORTFÓLIO\nBitcoin: " + btc + "\nEthereum: " + eth + "\nDogecoin: " + doge);
		System.out.println("\n\n1- COMPRAR MOEDAS\n2- SAIR");
		String sBuy = Sc.nextLine();
		
		int buy = Integer.valueOf(sBuy);
		
		if (buy == 2) {
			continuar = 2;
		} else {
			System.out.println("Qual moeda deseja comprar?");
		}
	}
	
	
	
}
