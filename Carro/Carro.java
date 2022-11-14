package Carro;

public class Carro {

		private String placa;
		private Pessoa p; 
		
		public Carro() {
			placa = "-"; 
			p= new Pessoa(); 
		}
		
		public Carro(String placa, Pessoa p) {
			this.placa = placa;
			this.p = p;
		}
		

		public Pessoa getP() {
			return p;
		}
		public void setP(Pessoa p) {
			this.p = p;
		}

		public String getPlaca() {
			return placa;
		}

		public void setPlaca(String placa) {
			this.placa = placa;
		}
		
		public String toString() {
			return "\nPlaca do Carro: "+ placa+ "\nInformacoes do Dono\n"+ this.p + ".";
		}
}
