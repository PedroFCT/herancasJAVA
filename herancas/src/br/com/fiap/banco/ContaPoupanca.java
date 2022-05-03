package br.com.fiap.banco;

public class ContaPoupanca extends Conta {
	
	public ContaPoupanca(int numero) {
		super(numero);
		
	}

	private double taxaDeRendimento;

	public double getTaxaDeRendimento() {
		return taxaDeRendimento;
	}

	public void setTaxaDeRendimento(double taxaDeRendimento) {
		this.taxaDeRendimento = taxaDeRendimento;
	}
	

}
