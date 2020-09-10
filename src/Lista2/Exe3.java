package Lista2;

import java.util.Scanner;

public class Exe3 {

	public static void main(String[] args) {
	
		Scanner ler = new Scanner(System.in);
		
		int idade, menos21=0, mais50=0, outros=0;
		
		System.out.print("Digite sua idade: ");
		idade = ler.nextInt();
		
		while(idade<99) {
			if(idade<=0) {
				System.out.println("Idade não reconhecidade, por favor tente novamente!");
			}
			else if(idade <=21) {
				menos21++;
			}
			else if(idade>=50) {
				mais50++;
			}
			
			else {
				outros++;
			}
			System.out.print("\nDigite sua idade: ");
			idade = ler.nextInt();
		}
		System.out.println("\nExistem "+menos21+" pessoas com 21 anos ou menos. \nExistem "+mais50+" pessoas com 50 anos ou mais. \nExistem "+outros+" pessoas entre 21 e 50 anos.");
		
		
	}

}
