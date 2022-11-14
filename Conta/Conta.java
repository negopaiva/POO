package Conta;

public abstract class Conta {
	private int conta;
	private int agencia;
	public Conta(int conta, int agencia) {
		super();
		this.conta = conta;
		this.agencia = agencia;
	}
	public int getConta() {
		return conta;
	}
	public void setConta(int conta) {
		this.conta = conta;
	}
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	@Override
	public String toString() {
		return "Conta [conta=" + conta + ", agencia=" + agencia + "]";
	}
	
	public abstract void getTipo();
	
}
