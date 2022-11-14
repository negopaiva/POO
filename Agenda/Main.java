package Agenda;

import java.util.Scanner; 

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Agenda a = new Agenda(2);
		Scanner sc = new Scanner(System.in); 
		
		int op = 0; 
		
		do {
			System.out.println("Digite\n1- Para Add\n2-Para Remover\n3-Para Imprimir\n4- Buscar o Nome\n5-Sair");
			op = sc.nextInt(); 
			switch(op) {
			case 1: 
				Pessoa p= new Pessoa(); 
				System.out.println("Digite um nome: \n");
				p.setNome(sc.next());
				System.out.println("Digite um Telefone: \n");
				p.setTelefone(sc.nextInt());
				
				if(a.adicionarPessoa(p))
					System.out.println("Add com Sucesso!");
				else
					System.out.println("Agenda Lotada!");
				
				break;
				
			case 2:
				System.out.println("Digite um Numero para ser removido: \n");
				a.removerPessoa(sc.nextInt());
				
				
				break;
			case 3:
				
				a.imprimirAgenda();
				
				break;
			case 4:
				System.out.println("\nInforme o Nome a ser Buscado!\n");
				String nomeBusca; 
				nomeBusca = sc.next(); 
				a.imprimirPessoa(nomeBusca);
				break;
			case 5:
				System.out.println("Até mais, Volte Sempre!");
				break;
			
			default:
				System.out.println("Opçãp Inválida!\n");
				break; 
			}
			
			
			
		}while(op != 5);
				sc.close();
	}

	
}
