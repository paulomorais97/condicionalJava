
import java.util.Random;

public class Exe1 {

	public static void main(String[] args) {
		
		Random r = new Random();
		
		int num1, num2, num3;
		 num1 = r.nextInt(100);
		 num2 = r.nextInt(100);
		 num3 = r.nextInt(100);
		 
		 System.out.println("Número 1: "+num1+" | Número 2: "+num2+" | Número 3: "+num3);
		 if (num1>num2 && num1>num3) {
			 System.out.println("O número "+num1+" é o maior valor.");
		 }
		 else if(num2>num3 && num2>num1) {
			 System.out.println("O número "+num2+" é o maior valor.");
		 }
		 else if(num3>num1 && num3>num2) {
			 System.out.println("O número "+num3+" é o maior valor");
		 }
		
	}

}
