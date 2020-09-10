import java.util.Random;

public class Exe4 {

	public static void main(String[] args) {
		
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
