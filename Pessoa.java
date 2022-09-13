package mine;

import java.util.Random;
import java.util.Scanner;

public class Pessoa {
	public int num;
	public int yes;
	public int confirm;

	public void cadastrar() {
		Scanner Sc = new Scanner(System.in);

		Random random = new Random();
		int numeroDaConta = random.nextInt(999999999) + 100000000;
		int agencia = random.nextInt(9999) + 1000;
		int digito = random.nextInt(9);

		System.out.println("Digite seu nome: ");
		String nome = Sc.nextLine();

		System.out.println("Digite seu endere�o: ");
		String endereco = Sc.nextLine();

		System.out.println("Digite sua profissão: ");
		String prof = Sc.nextLine();

		System.out.println("Digite seu CPF: ");
		String cpf = Sc.nextLine();

		System.out.println("Digite sua renda: ");
		String renda = Sc.nextLine();

		System.out.println("Nome: " + nome + "\nEndereco: " + endereco + "\nProfissao:" + prof + "CPF: " + cpf
				+ "Renda: " + renda + "\nCONFIRMAR DADOS? 1-SIM 2-NAO");
		String sConfirm = Sc.nextLine();

		confirm = Integer.valueOf(sConfirm);

		while (confirm != 1) {

			System.out.println(
					"Para mudar o nome: digite 1\nPara mudar o endereco: digite 2\nPara mudar a profissao: digite 3 \nPara mudar o CPF: digite 4 \nPara mudar a renda: digite 5\nPara voltar: digite 6");
			String sChange = Sc.nextLine();

			int change = Integer.valueOf(sChange);

			if (change == 1) {
				System.out.println("Insira o nome correto: ");
				nome = Sc.nextLine();
				System.out.println("Nome modificado com sucesso!");
				confirm = 1;
			} else if (change == 2) {
				System.out.println("Insira o endere�o correto: ");
				endereco = Sc.nextLine();
				System.out.println("Endere�o modificado com sucesso!");
				confirm = 1;
			} else if (change == 3) {
				System.out.println("Insira a profissao correta: ");
				prof = Sc.nextLine();
				System.out.println("Profissao modificada com sucesso!");
				confirm = 1;
			} else if (change == 4) {
				System.out.println("Insira o CPF correto: ");
				cpf = Sc.nextLine();
				System.out.println("CPF modificado com sucesso!");
				confirm = 1;
			} else if (change == 5) {
				System.out.println("Insira a renda correto: ");
				renda = Sc.nextLine();
				System.out.println("Renda modificada com sucesso!");
				confirm = 1;
			} else {
				System.out.println("Nome: " + nome + "\nEndere�o: " + endereco + "\nCONFIRMAR DADOS? 1-SIM 2-N�O");
				sConfirm = Sc.nextLine();
				confirm = Integer.valueOf(sConfirm);

			}
		}

		if (confirm == 1) {
			System.out.println("Crie uma senha de 6 d�gitos num�ricos (n�o pode come�ar com 0): ");
			String sSenha = Sc.nextLine();

			int senha = Integer.valueOf(sSenha);

			while (senha < 100000 || senha > 999999) {
				System.out.println("Senha inv�lida. Digite uma nova senha: ");
				senha = Sc.nextInt();
			}
			System.out.println("Conta criada com sucesso! \nN�mero: " + numeroDaConta + "\nAg�ncia: " + agencia
					+ "\nD�gito: " + digito + "\n\nDigite 1 para ir para a tela de login");
			String sYes = Sc.nextLine();

			yes = Integer.valueOf(sYes);
		}
	}

	public void fazerLogin() {
		Scanner Sc = new Scanner(System.in);

		System.out.println("Nome: ");
		String nomeLogin = Sc.nextLine();

		System.out.println("Senha: ");
		String senhaLogin = Sc.nextLine();

		System.out.println("Login realizado com sucesso! Para ir para a tela inicial, digite 1");
		String sNum = Sc.nextLine();

		num = Integer.valueOf(sNum);
		
		Sc.close();
	}

}
