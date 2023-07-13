package banco;

import java.util.Scanner;

public class ContaTerminal {
	
	public static Conta criarConta() {
		Conta c = new Conta();
		Scanner e = new Scanner(System.in);
		
		System.out.println("Insira o NÚMERO da conta(ex:1071) =>");
			c.numero_conta = e.nextInt();
		System.out.println("Insira a AGÊNCIA (ex:067-8) =>");
			c.agencia= e.next();
		System.out.println("Insira o NOME do CLIENTE =>");
			c.nome_cliente = e.next();
		System.out.println("Insira o SALDO => R$ ");
			c.saldo = e.nextDouble();
		
		e.close();
		return c;
	}
}
