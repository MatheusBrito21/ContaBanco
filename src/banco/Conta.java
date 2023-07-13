package banco;

public class Conta {
	int numero_conta; 
	String agencia;
	String nome_cliente;
	double saldo;
	
	public Conta() {}

	public Conta(int numero_conta, String agencia, String nome_cliente, double saldo) {
		super();
		this.numero_conta = numero_conta;
		this.agencia = agencia;
		this.nome_cliente = nome_cliente;
		this.saldo = saldo;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("\nOlá "+ this.nome_cliente+", obrigado por criar uma conta em nosso banco."
				+ "\nSua Agência é "+ this.agencia+", conta "+this.numero_conta
				+ " e seu saldo R$ "+this.saldo+" já está disponivel para saque.");
		return sb.toString();
	}
	
	
}
