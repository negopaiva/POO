package Veiculo;

public class Pessoa {
	String nome;
	int rg; 


	public Pessoa() {
		this.nome = "=";
		this.rg = 0;
	}
	
	public Pessoa(String nome, int rg) {
		this.nome = nome;
		this.rg = rg;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getRg() {
		return rg;
	}

	public void setRg(int rg) {
		this.rg = rg;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", rg=" + rg + "]";
	}
	
	

}



