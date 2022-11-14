package Poligono;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		int op = 0;
		
		do {
			System.out.println("Informe a Opcao:\n\n 1 - Triangulo\n 2 - Retangulo\n 3 - Sair");
			op = sc.nextInt(); 
			switch(op) {
				case 1:
					Triangulo t = new Triangulo();
					System.out.println("Infome o Comprimento!\n");
					t.setComprimento(sc.nextDouble());
					System.out.println("Informe a Altura!\n");
					t.setAltura(sc.nextDouble());
					System.out.println(t); 
					System.out.println("Area do Triangulo\t"+  t.area(t.getComprimento(), t.getAltura()) ); 
					
					
					break; 
				case 2:
					Retangulo r = new Retangulo(); 
					System.out.println("Informe o Comprimento!\n");
					r.setComprimento(sc.nextDouble());
					System.out.println("Informe a Altura!\n");
					r.setAltura(sc.nextDouble());
					System.out.println(r);
					System.out.println("Area do Retangulo\t" + r.area(r.getComprimento(), r.getAltura()) );
					
					
					break; 
					
				default:
					if(op == 3) {
						break;
					}else {
						System.out.println("Opcao Invalida!\n\n");
					}
					break; 
			}
			
			
		}while(op != 3);
			sc.close(); 
		
		
		
		
		

	}

}
