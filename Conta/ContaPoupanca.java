package Conta;

public class ContaPoupanca extends Conta{

	public ContaPoupanca(int conta, int agencia) {
		super(conta, agencia);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void getTipo() {
		System.out.println("Sou uma CP!");
	}

}
