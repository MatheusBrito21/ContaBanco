package banco;

public class Banco {
	public static void main(String[] args) {
		System.out.println("Bem vindo ao MazeBank");
		Conta novaConta = ContaTerminal.criarConta();
		System.out.println(novaConta.toString());
	
	}
}
