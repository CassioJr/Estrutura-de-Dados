import java.util.Scanner;

public class AgendaEndereco {
	OperacoesPessoa opPessoa = new OperacoesPessoa();
	
	public static void main(String args[]) {
		AgendaEndereco agendaEnd = new AgendaEndereco();
		agendaEnd.menu();
	}
	
	public void CadastroPessoa() {
		String nome, endereco;
		int telefone;
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o nome do cliente:");
		nome =sc.nextLine();
		System.out.println("Informe o endereço do cliente:");
		endereco =sc.nextLine();
		System.out.println("Informe o telefone do cliente:");
		telefone = sc.nextInt();
		Pessoa pessoa = new Pessoa(nome, endereco, telefone);
		opPessoa.addPessoa(pessoa);
	}
	public void menu() {
		int op;
		String nome;
		do {

		Scanner sc = new Scanner(System.in);
		System.out.println("Menu");
		System.out.println("1- Inserir pessoa");
		System.out.println("2- Consultar pessoa");
		System.out.println("3- Excluir pessoa");
		System.out.println("0 - Sair");
		
		op = sc.nextInt();
		sc.nextLine();
		switch (op) {
		case 1:
			CadastroPessoa();
			break;
		case 2:
			System.out.println("1- Informe o nome do cliente para procurar:");
			nome = sc.nextLine();
			System.out.println(opPessoa.consultaPessoa(nome));
			break;
		case 3:
			System.out.println("t1- Informe o nome do cliente para remover:");
			nome = sc.nextLine();
			opPessoa.RemoverPessoa(nome);
			break;
		}
		}while(op!= 0);
	}

}