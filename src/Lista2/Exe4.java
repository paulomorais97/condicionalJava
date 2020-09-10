package Lista2;

import java.util.Locale;
import java.util.Scanner;

public class Exe4 {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		final int LIMITE = 150;
		int pessoas =0;
		int idade, sexo, opcao;
		int pessoasCalmas=0, mulheresNervosas=0, homensAgressivos=0, nervososMais40=0, calmasMenos18=0;

		System.out.println("*****Pesquisa de Características Psicológicas*****");
		
		while(pessoas<LIMITE)
		{
			
			System.out.print("\nDigite sua idade: ");
			idade =ler.nextInt();
			System.out.println("------------------------------------------");
			System.out.println("1 - Feminino | 2 - Masculino ");
			System.out.print("\n Qual seu Sexo? ");
			sexo = ler.nextInt();
			System.out.println("------------------------------------------");
			System.out.println("1 - Calma | 2 - Nervosa | 3 - Agressiva");
			System.out.print("\nBaseado na tabela acima. \nVocê se acha uma pessoas calma, nervosa ou agressiva? ");
			opcao = ler.nextInt();
			System.out.println("\n------------------------------------------");
			
			switch(opcao) {
			case 1:
				pessoasCalmas++;
				if(idade<18) {	calmasMenos18++; }
				break;
			case 2:
				if(sexo==1) { mulheresNervosas++; }
				else if(idade>40) { nervososMais40++; }
				break;
			case 3:
				if(sexo ==2) 
				 { homensAgressivos++; 	}
				break;
			}	
			pessoas++;
		}
		System.out.println("\n\n============================================");
		System.out.print("Número de pessoas calmas: "+pessoasCalmas);
		System.out.print("\nNúmero de mulheres nervosas: "+mulheresNervosas);
		System.out.print("\nNúmero de homens agressivos: "+homensAgressivos);
		System.out.print("\nNúmero de pessoas nervosas com mais de 40 anos: "+nervososMais40);
		System.out.print("\nPessoas calmas com menos de 18 anos: "+calmasMenos18);
		System.out.print("\nTotal de pessoas que participaram da pesquisa: "+pessoas);
		
		ler.close();
	}

}
