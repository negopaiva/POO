package Veiculo;

public class Veiculo{
	Double peso;
	Double VelocidadeMaxima;
	Double preco;
	Pessoa dono; 
	
	
	public Veiculo() {
		this.peso = 0.0;
		this.VelocidadeMaxima = 0.0;
		this.preco = 0.0;
		this.dono = new Pessoa();
		
	}
	
	public Veiculo(Double peso, Double VelocidadeMaxima, Double preco, Pessoa dono) {
		this.peso = peso;
		this.VelocidadeMaxima = VelocidadeMaxima;
		this.preco = preco;
		this.dono = dono; 
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	public Double getVelocidadeMaxima() {
		return VelocidadeMaxima;
	}

	public void setVelocidadeMaxima(Double velocidadeMaxima) {
		VelocidadeMaxima = velocidadeMaxima;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public Pessoa getDono() {
		return dono;
	}

	public void setDono(Pessoa dono) {
		this.dono = dono;
	}

	@Override
	public String toString() {
		return "Veiculo [peso=" + peso + ", VelocidadeMaxima=" + VelocidadeMaxima + ", preco=" + preco + ", dono="
				+ dono + "]";
	}
	
	
	
	

	
}
