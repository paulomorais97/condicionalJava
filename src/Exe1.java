
import java.util.Random;

public class Exe1 {

	public static void main(String[] args) {
		
		Random r = new Random();
		
		int num1, num2, num3;
		 num1 = r.nextInt(100);
		 num2 = r.nextInt(100);
		 num3 = r.nextInt(100);
		 
		 System.out.println("N�mero 1: "+num1+" | N�mero 2: "+num2+" | N�mero 3: "+num3);
		 if (num1>num2 && num1>num3) {
			 System.out.println("O n�mero "+num1+" � o maior valor.");
		 }
		 else if(num2>num3 && num2>num1) {
			 System.out.println("O n�mero "+num2+" � o maior valor.");
		 }
		 else if(num3>num1 && num3>num2) {
			 System.out.println("O n�mero "+num3+" � o maior valor");
		 }
		
	}

}
