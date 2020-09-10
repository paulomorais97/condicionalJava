import java.util.Scanner;

public class Vih {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ler = new Scanner(System.in);
		
		int resultado=0 , raiz1=0, raiz2=0;
		
		raiz1 =(int)Math.pow((Math.sqrt(81)), 2);
		raiz2 =(int)Math.pow((Math.sqrt(16)), 2);
		
		resultado = (int) 20-(8 +(raiz1*raiz2));
		
		System.out.println(resultado);
		
		ler.close();
	}

}
