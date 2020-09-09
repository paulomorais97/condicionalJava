import java.util.Scanner;

public class Exe3 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		int idade;
		System.out.println("Olá, seja bem-vindo!!!");
		System.out.print("Digite sua idade: ");
		idade = ler.nextInt();
		
		if(idade >=10 && idade<= 14) {
			System.out.println("Você faz parte do time Infantil!");
		}
		else if(idade >=15 && idade <=17) {
			System.out.println("Você faz parte do time Juvenil");
		}
		else if(idade >=18 && idade<= 25) {
			System.out.println("Você faz parte do time Adulto");
		}
		else if (idade <=9) {
			System.out.println("Que pena, você ainda não pode participar de nenhum time :c");
		}
	}

}
