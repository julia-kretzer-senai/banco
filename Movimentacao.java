package mine;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Movimentacao {
	Scanner Sc = new Scanner(System.in);
	public double saldo = 0;
	public double deposito, saque, transferencia;
	public int continuar = 0;

	public void continuar() {
		System.out.println("\nPara continuar, digite 1\nPara encerrar a sessão, digite 2");
		continuar = Sc.nextInt();
	}

	public void mostrarSaldo() {
		System.out.print("Seu saldo atual é de R$" + saldo);
		continuar();
	}

	public void depositar() {
		System.out.print("Insira o valor do deposito: ");
		deposito = Sc.nextDouble();
		saldo += deposito;

		System.out.println("\nDepósito realizado com sucesso! Seu saldo atual é de R$" + saldo);
		continuar();
	}

	public void sacar() {
		System.out.println("Insira o valor que deseja sacar: ");
		saque = Sc.nextDouble();

		while (saque > saldo) {
			System.out.print(
					"Você não possui esse saldo em conta. \nInsira 1 para ir para a tela de depósito \nou \nInsira outro valor (maior que 1): ");
			saque = Sc.nextDouble();

			if (saque == 1) {
				depositar();
				System.out.println("Insira o valor que deseja sacar: ");
				saque = Sc.nextDouble();

			}
		}
		saldo -= saque;
		System.out.println("\nSaque realizado com sucesso! Seu saldo atual é de R$" + saldo);
		continuar();
	}

	public void transferir() {
		int confirmar = 0;

		while (confirmar != 1) {
			System.out.print("Digite o número da conta para a qual deseja transferir: ");
			int recebe = Sc.nextInt();
			System.out.print("Digite o valor que deseja transferir: ");
			transferencia = Sc.nextDouble();

			while (transferencia > saldo) {
				System.out.print(
						"Você não possui esse saldo em conta. \nInsira 1 para ir para a tela de depósito \nou \nInsira outro valor (maior que 1): ");
				transferencia = Sc.nextDouble();

				if (transferencia == 1) {
					depositar();
					System.out.print("Digite o número da conta para a qual deseja transferir: ");
					recebe = Sc.nextInt();
					System.out.print("Digite o valor que deseja transferir: ");
					transferencia = Sc.nextDouble();
				}
			}

			System.out.print("Cofirmar transferência de R$" + transferencia + " para conta nº" + recebe
					+ "?\n 1 - SIM \n 2 - NÃO");
			confirmar = Sc.nextInt();

			if (confirmar == 1) {
				saldo = saldo - transferencia;
			}
		}

		System.out.println("\nTransferência realizada com sucesso! Seu saldo atual é de R$" + saldo);
		continuar();
	}

	public void verPortfolio() {

		int back = 0;
		double bitcoin = 111174;
		double ethereum = 8370;
		double dogecoin = 0.32;

		double btcSaldo = 0;
		double ethSaldo = 0;
		double dogeSaldo = 0;
		double btc = btcSaldo * bitcoin;
		double eth = ethSaldo * ethereum;
		double doge = dogeSaldo * dogecoin;

		DecimalFormat df = new DecimalFormat("####.###");

		while (back != 2) {
			// reais / precobtc = quantidadebitcoin
			// quantidadebtc * precobtc = reais

			System.out.println("CRIPTO PORTFÓLIO\nBitcoin: " + df.format(btcSaldo) + " BTC = R$" + btc + "\nEthereum: "
					+ df.format(ethSaldo) + " ETH = R$" + eth + "\nDogecoin: " + df.format(dogeSaldo) + " DOGE = R$"
					+ doge);
			System.out.println("\n1- Comprar moedas\n2- VOLTAR");

			int buy = Sc.nextInt();

			double qtd;

			if (buy == 2) {
				back = 2;
				continuar();
			} else {
				System.out.println("Qual moeda deseja comprar? \n1- Bitcoin \n2- Ethereum \n3- Dogecoin");
				Sc.nextLine();
				int coin = Sc.nextInt();

				System.out.println("Quantos R$ deseja usar para comprar?");
				Sc.nextLine();
				qtd = Sc.nextDouble();

				while (qtd > saldo) {
					System.out.print(
							"Você não possui esse saldo em conta. \nInsira 1 para ir para a tela de depósito \nou \nInsira outro valor (maior que 1): ");
					qtd = Sc.nextDouble();

					if (qtd == 1) {
						depositar();
						System.out.println("Qual moeda deseja comprar? \n1- Bitcoin \n2- Ethereum \n3- Dogecoin");
						Sc.nextLine();
						coin = Sc.nextInt();

						System.out.println("Quantos R$ deseja usar para comprar?");
						Sc.nextLine();
						qtd = Sc.nextDouble();
					}
				}
				if (qtd <= saldo) {
					if (coin == 1) {
						System.out
								.println("Compra de BTC realizada com sucesso! Digite 1 para voltar para o portfólio");
						btcSaldo += qtd / bitcoin;
						btc += qtd;
						back = Sc.nextInt();
					} else if (coin == 2) {
						ethSaldo += qtd / ethereum;
						eth += qtd;
						System.out
								.println("Compra de ETH realizada com sucesso! Digite 1 para voltar para o portfólio");
						back = Sc.nextInt();
					} else if (coin == 3) {
						dogeSaldo += qtd / dogecoin;
						doge += qtd;
						System.out
								.println("Compra de DOGE realizada com sucesso! Digite 1 para voltar para o portfólio");
						back = Sc.nextInt();
					}

					saldo -= qtd;
				}

			}
		}

	}

}
