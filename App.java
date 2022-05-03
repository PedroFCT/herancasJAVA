package br.com.fiap.banco;

public class App {
	
	public static void main(String[] args) {
		
		Conta conta = new Conta(8645);
		conta.depositar(100);
		
		System.out.println(conta.getNumero() + " " + conta.getSaldo());
	}		

}
