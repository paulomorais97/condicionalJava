import java.util.Random;
import java.util.Scanner;

public class Exe2 {

	public static void main(String[] args) {
		
		Random r = new Random();
	//	Scanner ler = new Scanner(System.in);
		int num1, num2, num3;
		num1 = r.nextInt(100);
		num2 = r.nextInt(100);
		num3 = r.nextInt(100);
		
	/*	System.out.println("Digite o valor 1: ");
		num1 = ler.nextInt();
		System.out.println("Digite o valor 2: ");
		num2 = ler.nextInt();
		System.out.println("Digite o  valor 3: ");
		num3 = ler.nextInt();
	*/
		System.out.println("Número 1: "+num1+" | Número 2: "+num2+" | Número 3: "+num3);
		System.out.println("--------------------------------------------");
		
			if(num1<=num2 && num1<= num3 ) {
				if(num2<= num3) {
					System.out.println(num1+" | "+num2+" | "+num3);
				}
				else {
					System.out.println(num1+" | "+num3+" | "+num2);
				}
			}
			else if(num1>num2 && num3>= num2) {
				if(num1<num3) {
					System.out.println(num2+" | "+num1+" | "+num3);
				}
				else {
					System.out.println(num2+" | "+num3+" | "+num1);
				}
			}
			else if(num1>num3 && num2>num3) {
				if(num1<num2) {
					System.out.println(num3+" | "+num1+" | "+num2);
				}
				else {
					System.out.println(num3+" | "+num2+" | "+num1);
				}
			}	 
		
	}

}
