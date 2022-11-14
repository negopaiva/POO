package CartaoWeb;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<CartaoWeb> Lista = new ArrayList<CartaoWeb>(); 
				
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		Scanner input = new Scanner(System.in);
		
		int op = 0;
		
		do {
			System.out.println("Informe a Opcao:\n\n 1 - Dia dos Namorados\n 2 - Natal\n 3 - Aniversário\n 4- Imprime Lista\n 5- Sair\n");
			op = sc.nextInt();
			
			switch(op) {
				
				
				
				case 1:
					
					DiadosNamorados amor = new DiadosNamorados();
					System.out.println("Informe o nome:\n");
					amor.setDestinatario(input.nextLine());
					Lista.add(amor); 
					
					break; 
				case 2:
					Natal n = new Natal();
					System.out.println("Informe o nome:\n");
					n.setDestinatario(input.nextLine());
					Lista.add(n); 
					
					
					break;
				case 3:
					Aniversario A = new Aniversario();
					System.out.println("Informe o nome:\n");
					A.setDestinatario(input.nextLine());
					Lista.add(A); 
					
					break;
				case 4:
					for(CartaoWeb c: Lista) {
						 c.ShowMessage();
					}

					
					break;
				default:
					if(op == 5) {
						break;
					}else {
						System.out.println("Opcao Invalida!\n\n");
					}
					break; 
			}
			
			
		}while(op != 5);
			sc.close(); 
			input.close();
	}

}
