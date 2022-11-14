package Carro;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ler = new Scanner(System.in);
		
		Pessoa p1 = new Pessoa();
		
		System.out.println("Digite um Nome: ");
		p1.setNome(ler.next());
		
		System.out.println("Digite o num do apt: ");
		p1.setApt(ler.nextInt());
		
		
		System.out.println("Informe a Placa do Carro ");
		String apart = ler.next();
		
		Carro c1 = new Carro(apart, p1);
		
		
		
		//System.out.println(p1);
		System.out.println(c1);
		
		ler.close(); 
		
		
	}

}
