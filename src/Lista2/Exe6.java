package Lista2;

import java.util.Scanner;

public class Exe6 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		int numero, contador=0, multiplos=0;
		double media=0;
		
		do {
			System.out.println("Digite um numero: ");
			numero=ler.nextInt();
			if(numero%3==0) {
				multiplos+=numero;
				contador++;
			}
		}while(numero!=0);
				media =multiplos/ (contador-1);

		System.out.println("A média dos números multiplos de 3 é: "+media);
	}

}
