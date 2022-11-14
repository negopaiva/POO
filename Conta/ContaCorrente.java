package Conta;

public class ContaCorrente extends Conta implements Tributavel{
	String nome;
	public ContaCorrente(int conta, int agencia) {
		super(conta, agencia);
	}
	@Override
	public void getTipo() {
		System.out.println("Sou uma CC.");
	}
	@Override
	public void verTaxas() {
		System.out.println("Taxas da CC!");
	}

}
