import java.util.Random;

public class DesafioEd {

	public static void main(String[] args) {
		/*
		 * Fa�a um programa que entre com tr�s n�meros e coloque em ordem crescente.
		 */
		
		Random r = new Random();
		int n1, n2, n3;
		
		n1=r.nextInt(100);
		n2=r.nextInt(100);
		n3=r.nextInt(100);
		
		if(n1>=n2 && n1>=n3 && n2>=n3)
		{
			System.out.println(n1+" | "+n2+" | "+n3);
		}

	}

}
