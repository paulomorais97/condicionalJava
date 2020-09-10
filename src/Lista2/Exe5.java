package Lista2;

import java.util.Scanner;

public class Exe5 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
	
		int numero, soma=0, contador;
		
		do {
			System.out.print("\nDigite um número: ");
			numero=ler.nextInt();
			contador=numero;
			soma+=contador;
		}
		while(numero!=0);
		System.out.println("\n---------------------");
		System.out.println("Soma dos numeros: "+soma);
	}

}
