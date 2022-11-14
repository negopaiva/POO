package Agenda;

public class Agenda {
	private Pessoa lista[];
	
	public Agenda() {
		lista = new Pessoa[10];
	}
	
	public Agenda(int tam) {
		lista = new Pessoa[tam]; 
		
	}
	
	public boolean adicionarPessoa(Pessoa x){
		for(int i=0; i < lista.length; i++) {
			if(lista[i] == null ) {
				lista[i] = x; 
				return true;
			}
			
		}
		return false;
	}
	
	public void removerPessoa(int tel) {
		for(int i = 0; i<lista.length; i++) {
			if(lista[i] != null && lista[i].getTelefone() == tel) {
				lista[i] = null;
				return; 
			}
		}
		System.out.println("\n Telefone não Encontrado!");
		
	}
	
	public void imprimirAgenda() {
		System.out.println("======== Agenda ========");
		for(Pessoa p: lista) {
			
			System.out.println(p);
			System.out.println("=========================");
		}
	}
	
	
	public void imprimirPessoa(String nome) {
		for(int i = 0; i<lista.length; i++) {
			if(lista[i] != null && lista[i].getNome().equals(nome)) {
				Pessoa p = lista[i]; 
				System.out.println("======= Contato ========");
				System.out.println(p);
				System.out.println("========================");
				return; 
			}
			
		}
		System.out.println("Pessoa Não Encontrada!\n");
		return; 
		
	}
	
	
	
	

}
