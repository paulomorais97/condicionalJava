import java.util.Random;

public class Exe4 {

	public static void main(String[] args) {
		
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
