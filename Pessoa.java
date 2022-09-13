package mine;

import java.util.Random;
import java.util.Scanner;

public class Pessoa {
	Scanner Sc = new Scanner(System.in);

	public int num;
	public int yes;
	public int confirm;

	public void cadastrar() {

		Random random = new Random();
		int numeroDaConta = random.nextInt(999999999) + 100000000;
		int agencia = random.nextInt(9999) + 1000;
		int digito = random.nextInt(9);

		System.out.println("Digite seu nome: ");
		String nome = Sc.next();

		System.out.println("Digite seu endere�o: ");
		String endereco = Sc.nextLine();

		endereco = Sc.nextLine();

		System.out.println("Digite sua profissão: ");
		String prof = Sc.next();

		System.out.println("Digite seu CPF: ");
		String cpf = Sc.next();

		System.out.println("Digite sua renda: ");
		String renda = Sc.next();

		System.out.println(
				"Escolha um tipo de conta: \n1 - MERCURY\n Conta padrão, sem taxas \n2- VENUS\n Taxa de inscrição: R$100,00\n Recebe 2% de cashback todo mês para a realização de investimentos conosco \n3 - EARTH (RECOMENDADO) \n Taxa de adesão: R$300,00 \n10% de cashback mensal para a realização de investimentos em criptomoedas ");
		int conta = Sc.nextInt();

		String sConfirm = "";

		if (conta == 1) {
			System.out.println("Nome: " + nome + "\nEndereco: " + endereco + "\nProfissao:" + prof + "\nCPF: " + cpf
					+ "\nRenda: " + renda + "\nConta MERCURY\nCONFIRMAR DADOS? 1-SIM 2-NAO");
			sConfirm = Sc.next();

			confirm = Integer.valueOf(sConfirm);
		} else if (conta == 2) {
			System.out.println("Nome: " + nome + "\nEndereco: " + endereco + "\nProfissao:" + prof + "\nCPF: " + cpf
					+ "\nRenda: " + renda + "\nConta VENUS\nCONFIRMAR DADOS? 1-SIM 2-NAO");
			sConfirm = Sc.next();

			confirm = Integer.valueOf(sConfirm);
		} else {
			System.out.println("Nome: " + nome + "\nEndereco: " + endereco + "\nProfissao:" + prof + "\nCPF: " + cpf
					+ "\nRenda: " + renda + "\nConta EARTH\nCONFIRMAR DADOS? 1-SIM 2-NAO");
			sConfirm = Sc.next();

			confirm = Integer.valueOf(sConfirm);
		}

		while (confirm != 1) {

			System.out.println(
					"Para mudar o nome: digite 1\nPara mudar o endereco: digite 2\nPara mudar a profissao: digite 3 \nPara mudar o CPF: digite 4 \nPara mudar a renda: digite 5\nPara mudar o tipo da conta: digite 6\nPara voltar: digite 7");
			String sChange = Sc.next();

			int change = Integer.valueOf(sChange);

			if (change == 1) {
				System.out.println("Insira o nome correto: ");
				nome = Sc.next();
				System.out.println("Nome modificado com sucesso!");
				confirm = 1;
			} else if (change == 2) {
				System.out.println("Insira o endereco correto: ");
				endereco = Sc.next();
				System.out.println("Endereco modificado com sucesso!");
				confirm = 1;
			} else if (change == 3) {
				System.out.println("Insira a profissao correta: ");
				prof = Sc.next();
				System.out.println("Profissao modificada com sucesso!");
				confirm = 1;
			} else if (change == 4) {
				System.out.println("Insira o CPF correto: ");
				cpf = Sc.nextLine();
				System.out.println("CPF modificado com sucesso!");
				confirm = 1;
			} else if (change == 5) {
				System.out.println("Insira a renda correta: ");
				renda = Sc.next();
				System.out.println("Renda modificada com sucesso!");
				confirm = 1;
			} else if (change == 6) {
				System.out.println("Escolha um tipo de conta: \n1 - MERCURY\n Conta padrão, sem taxas \n2- VENUS\n Taxa de inscrição: R$100,00"
						+ "\n Recebe 2% de cashback todo mês para a realização de investimentos conosco \n3 - EARTH (RECOMENDADO)"
						+ "\n Taxa de adesão: R$300,00 \n10% de cashback mensal para a realização de investimentos em criptomoedas");
				conta = Sc.nextInt();
				System.out.println("Tipo da conta modificado com sucesso!");
				confirm = 1;
			} else {
				if (conta == 1) {
					System.out.println("Nome: " + nome + "\nEndereco: " + endereco + "\nProfissao:" + prof + "\nCPF: "
							+ cpf + "\nRenda: " + renda + "\nConta MERCURY\nCONFIRMAR DADOS? 1-SIM 2-NAO");
					sConfirm = Sc.next();

					confirm = Integer.valueOf(sConfirm);
				} else if (conta == 2) {
					System.out.println("Nome: " + nome + "\nEndereco: " + endereco + "\nProfissao:" + prof + "\nCPF: "
							+ cpf + "\nRenda: " + renda + "\nConta VENUS\nCONFIRMAR DADOS? 1-SIM 2-NAO");
					sConfirm = Sc.next();

					confirm = Integer.valueOf(sConfirm);
				} else {
					System.out.println("Nome: " + nome + "\nEndereco: " + endereco + "\nProfissao:" + prof + "\nCPF: "
							+ cpf + "\nRenda: " + renda + "\nConta EARTH\nCONFIRMAR DADOS? 1-SIM 2-NAO");
					sConfirm = Sc.next();

					confirm = Integer.valueOf(sConfirm);
				}
			}
		}

		if (confirm == 1) {
			System.out.println("Crie uma senha de 6 digitos numericos (sem comecar com 0): ");
			String sSenha = Sc.next();

			int senha = Integer.valueOf(sSenha);

			while (senha < 100000 || senha > 999999) {
				System.out.println("Senha invalida. Digite uma nova senha: ");
				senha = Sc.nextInt();
			}
			System.out.println("Conta criada com sucesso! \nNumero: " + numeroDaConta + "\nAgencia: " + agencia
					+ "\nDigito: " + digito + "\n\nDigite 1 para ir para a tela de login");
			String sYes = Sc.next();

			yes = Integer.valueOf(sYes);
		}
	}

	public void fazerLogin() {
		Scanner Sc = new Scanner(System.in);

		System.out.println("Nome: ");
		String nomeLogin = Sc.next();

		System.out.println("Senha: ");
		String senhaLogin = Sc.next();

		System.out.println("Login realizado com sucesso! Para ir para a tela inicial, digite 1");
		String sNum = Sc.next();

		num = Integer.valueOf(sNum);

		Sc.close();
	}

}
