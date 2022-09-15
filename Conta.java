package mine;
import java.util.Random;
import java.util.Scanner;

public class Conta {
	static Scanner Sc = new Scanner(System.in);

	public int num = 0;
	public int yes, confirm, numero, agencia, digito;
	public int conta = 0;
	public String nome, endereco, prof, cpf, renda, tipo;

	public void verificarConta() {
		if (conta == 1) {
			tipo = "MERCURY";
		} else if (conta == 2) {
			tipo = "VENUS";
		} else if (conta == 3) {
			tipo = "EARTH";
		}
	}

	public void criarSenha() {
		System.out.println("Crie uma senha de 6 digitos numericos (sem comecar com 0): ");
		Sc.nextLine();

		int senha = Sc.nextInt();

		while (senha < 100000 || senha > 999999) {
			System.out.println("Senha invalida. Digite uma nova senha: ");
			senha = Sc.nextInt();
		}
	}

	public void confirmar() {
		verificarConta();
		System.out.println("Nome: " + nome + "\nEndereco: " + endereco + "\nProfissao:" + prof + "\nCPF: " + cpf
				+ "\nRenda: " + renda + "\nConta " + tipo + "\nCONFIRMAR DADOS? 1-SIM 2-NAO");
		confirm = Sc.nextInt();
	}

	public void atualizar() {
		System.out.println("Dados atualizados com sucesso!");
	}

	public void mudarDados() {
		while (confirm != 1) {

			System.out.println(
					"Para mudar o nome: digite 1\nPara mudar o endereco: digite 2\nPara mudar a profissao: digite 3 \nPara mudar o CPF: digite 4 \nPara mudar a renda: digite 5\nPara mudar o tipo da conta: digite 6\nPara voltar: digite 7");
			int change = Sc.nextInt();

			if (change == 1) {
				System.out.println("Insira o nome correto: ");
				Sc.nextLine();
				nome = Sc.nextLine();
				System.out.println("Nome modificado com sucesso!");
				confirmar();
			} else if (change == 2) {
				System.out.println("Insira o endereco correto: ");
				Sc.nextLine();
				endereco = Sc.nextLine();
				System.out.println("Endereco modificado com sucesso!");
				confirmar();
			} else if (change == 3) {
				System.out.println("Insira a profissao correta: ");
				Sc.nextLine();
				prof = Sc.nextLine();
				System.out.println("Profissao modificada com sucesso!");
				confirmar();
			} else if (change == 4) {
				System.out.println("Insira o CPF correto: ");
				Sc.nextLine();
				cpf = Sc.nextLine();
				System.out.println("CPF modificado com sucesso!");
				confirmar();
			} else if (change == 5) {
				System.out.println("Insira a renda correta: ");
				Sc.nextLine();
				renda = Sc.nextLine();
				System.out.println("Renda modificada com sucesso!");
				confirmar();
			} else if (change == 6) {
				System.out.println(
						"Escolha um tipo de conta: \n1 - MERCURY\n Conta padrão, sem taxas \n2- VENUS\n Taxa de inscrição: R$100,00"
								+ "\n Recebe 2% de cashback todo mês para a realização de investimentos conosco \n3 - EARTH (RECOMENDADO)"
								+ "\n Taxa de adesão: R$300,00 \n10% de cashback mensal para a realização de investimentos em criptomoedas");
				Sc.nextLine();
				conta = Sc.nextInt();
				System.out.println("Tipo da conta modificado com sucesso!");
				confirmar();
			} else {

				confirmar();
			}
		}
	}

	public void cadastrar() {

		Random random = new Random();
		numero = random.nextInt(999999999) + 100000000;
		agencia = random.nextInt(9999) + 1000;
		digito = random.nextInt(9);

		System.out.println("Digite seu nome: ");
		nome = Sc.nextLine();

		System.out.println("Digite seu endereco: ");
		endereco = Sc.nextLine();

		System.out.println("Digite sua profissão: ");
		prof = Sc.nextLine();

		System.out.println("Digite seu CPF: ");
		cpf = Sc.nextLine();

		System.out.println("Digite sua renda: ");
		renda = Sc.nextLine();

		System.out.println(
				"Escolha um tipo de conta: \n1 - MERCURY\n Conta padrão, sem taxas \n2- VENUS\n Taxa de inscrição: R$100,00\n Recebe 2% de cashback todo mês para a realização de investimentos conosco \n3 - EARTH (RECOMENDADO) \n Taxa de adesão: R$300,00 \n10% de cashback mensal para a realização de investimentos em criptomoedas ");
		conta = Sc.nextInt();

		confirmar();

		mudarDados();

		if (confirm == 1) {
			criarSenha();
			System.out.println("Conta criada com sucesso! \nNumero: " + numero + "\nAgencia: " + agencia
					+ "\nDigito: " + digito + "\n\nDigite 1 para ir para a tela inicial");
			Sc.nextLine();
			num = Sc.nextInt();
		}

	}

	public void fazerLogin() {

		System.out.println("Nome: ");
		nome = Sc.nextLine();

		System.out.println("Senha: ");
		Sc.nextLine();

		System.out.println("Login realizado com sucesso! Para ir para a tela inicial, digite 1");
		num = Sc.nextInt();

	}

	public void mostrarDados() {
		System.out.println("Nome: " + nome + "\nNumero da conta: " + numero + "\nAgencia: " + agencia
				+ "\nDigito: " + digito + "\nEndereco: " + endereco + "\nProfissao:" + prof + "\nCPF: " + cpf
				+ "\nRenda: " + renda
				+ "\nConta MERCURY\nDESEJA MODIFICAR DADOS PESSOAIS? \n1-SIM \n2-MUDAR SENHA \n3-VOLTAR");
		int change = Sc.nextInt();

		if (change == 1) {
			mudarDados();
			atualizar();
			System.out.println("Para ir para a tela inicial, digite 1");
			num = Sc.nextInt();
		} else if (change == 2) {
			criarSenha();
			System.out.println("Senha modificada com sucesso! Para ir para a tela inicial, digite 1");
			num = Sc.nextInt();
		} else {
			num = 1;
		}
	}
}