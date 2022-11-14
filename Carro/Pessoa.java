package Carro;

public class Pessoa {

		private String nome;
		private int apt;
		
		public Pessoa(String nome, int a) {
			this.nome = nome; 
			this.apt = a; 
			
		}
		
		public Pessoa() {
			this.nome= "*";
			this.apt = 0; 
			
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public int getApt() {
			return apt;
		}

		public void setApt(int apt) {
			this.apt = apt;
		}
		
		public String toString() {
			return "Nome: " + nome +"\nApt: " + apt + "." ; 
		}
		
		
		
		
}
