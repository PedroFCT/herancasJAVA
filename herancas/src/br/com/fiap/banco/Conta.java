package br.com.fiap.banco;

public class Conta {

	private int numero;
	private String nomeDoTitular;
	private double saldo;

	public Conta(int numero) {
		this.numero = numero;
	}
	
	public Conta(int numero, String nomeDoTitular) {
		this.numero = numero;
		this.nomeDoTitular = nomeDoTitular;
	}
	
	public void depositar(double valor) {
		if (valor > 0) this.saldo += valor;
		
	}
	
	public void sacar (double valor) {
		if (valor > 0) this.saldo -= valor;
	}
	
	public void transferir (double valor, Conta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
	}
	
	public String getNomeDoTitular() {
		return nomeDoTitular;
	}

	public void setNomeDoTitular(String nomeDoTitular) {
		this.nomeDoTitular = nomeDoTitular;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}

}
