import java.util.Random;

public class Exe4 {

	public static void main(String[] args) {
		/*
		 * Fa�a um programa em que permita a entrada de um 
		 * n�mero qualquer e exiba se este n�mero � par ou �mpar.
		 *  Se for par exiba tamb�m a raiz quadrada do mesmo; 
		 *  se for �mpar exiba o n�mero elevado ao quadrado.
		 */
		Random r = new Random();
		
		int numero;
		
		numero = r.nextInt(100);
		
		
		if ((numero%2)==0)
		{
			System.out.println("O n�mero "+numero+" � par...");
		}
		else {
			System.out.println("Este n�mero "+numero+" � impar");
		}
	}
	

}
