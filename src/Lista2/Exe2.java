package Lista2;

import java.util.Scanner;

public class Exe2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ler = new Scanner(System.in);
		int i, numero, par=0, impar=0;	
		
		for(i=0; i<10;i++) {	
			System.out.print("Digite o "+(i+1)+"� n�mero: ");
			numero = ler.nextInt();
			if(numero%2==0) {	par++;	}
			else {	impar++;	}
		}
		System.out.println("-------------------------------------------");
		System.out.println(par+" n�meros s�o pares e "+impar+" n�meros s�o impares");
	}

}
