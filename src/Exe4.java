import java.util.Random;

public class Exe4 {

	public static void main(String[] args) {
		/*
		 * Faça um programa em que permita a entrada de um 
		 * número qualquer e exiba se este número é par ou ímpar.
		 *  Se for par exiba também a raiz quadrada do mesmo; 
		 *  se for ímpar exiba o número elevado ao quadrado.
		 */
		Random r = new Random();
		
		int numero;
		
		numero = r.nextInt(100);
		
		
		if ((numero%2)==0)
		{
			System.out.println("O número "+numero+" é par...");
		}
		else {
			System.out.println("Este número "+numero+" é impar");
		}
	}
	

}
