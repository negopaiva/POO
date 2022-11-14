package Conta;

public class SeguroVida implements Tributavel{

	@Override
	public void verTaxas() {
		System.out.println("Taxas do seguro de vida!");
	}

}
