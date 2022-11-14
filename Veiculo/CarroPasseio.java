package Veiculo;

public class CarroPasseio extends Veiculo {
		String cor;
		String modelo;
		
		
		public CarroPasseio() {
			super();
			this.cor = "=";
			this.modelo = "=";
			// TODO Auto-generated constructor stub
		}
		public CarroPasseio(Double peso, Double VelocidadeMaxima, Double preco, Pessoa dono, String cor, String modelo) {
			super(peso, VelocidadeMaxima, preco, dono);
			this.cor = cor;
			this.modelo = modelo;
			// TODO Auto-generated constructor stub
		}
		public String getCor() {
			return cor;
		}
		public void setCor(String cor) {
			this.cor = cor;
		}
		public String getModelo() {
			return modelo;
		}
		public void setModelo(String modelo) {
			this.modelo = modelo;
		}
		@Override
		public String toString() {
			return "CarroPasseio [cor=" + cor + ", modelo=" + modelo + ", peso=" + peso + ", VelocidadeMaxima="
					+ VelocidadeMaxima + ", preco=" + preco + ", dono=" + dono + "]";
		}
		
		
		
		
}
