package Veiculo;

public class Caminhão extends Veiculo {
	Double tonelada;
	Double altMaxima;
	Double comprimento;
	
	
	public Caminhão() {
		super();
		this.tonelada = 0.0;
		this.altMaxima = 0.0;
		this.comprimento = 0.0;
		// TODO Auto-generated constructor stub
	}
	public Caminhão(Double peso, Double VelocidadeMaxima, Double preco, Pessoa dono, Double tonelada, Double altMaxima, Double comprimento) {
		super(peso, VelocidadeMaxima, preco, dono);
		this.tonelada = tonelada; 
		this.altMaxima = altMaxima; 
		this.comprimento = comprimento; 
		// TODO Auto-generated constructor stub
	}
	public Double getTonelada() {
		return tonelada;
	}
	public void setTonelada(Double tonelada) {
		this.tonelada = tonelada;
	}
	public Double getAltMaxima() {
		return altMaxima;
	}
	public void setAltMaxima(Double altMaxima) {
		this.altMaxima = altMaxima;
	}
	public Double getComprimento() {
		return comprimento;
	}
	public void setComprimento(Double comprimento) {
		this.comprimento = comprimento;
	}
	@Override
	public String toString() {
		return "Caminhão [tonelada=" + tonelada + ", altMaxima=" + altMaxima + ", comprimento=" + comprimento
				+ ", peso=" + peso + ", VelocidadeMaxima=" + VelocidadeMaxima + ", preco=" + preco + ", dono=" + dono
				+ "]";
	}
	
	
	
	
	
	
	

}
