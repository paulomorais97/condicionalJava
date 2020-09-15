package Lista2;

import java.util.Random;
import java.util.Scanner;

public class Exe2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ler = new Scanner(System.in);
		Random r = new Random();
		int i, numero, par=0, impar=0;	
		
		for(i=0; i<10;i++) {	
			//System.out.print("Digite o "+(i+1)+"º número: ");
			//numero = ler.nextInt();
			numero=r.nextInt(100);
			if(numero%2==0) {	par++;	}
			else {	impar++;	}
			System.out.println((i+1)+"º número: "+numero);
		}
		System.out.println("\n-------------------------------------------");
		System.out.println(par+" números são pares e "+impar+" números são impares");
	}

}
