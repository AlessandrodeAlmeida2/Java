package exercicios;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class jokenpo {

	public static void main(String[] args) {
		// variáveis
		int p1;
		// objetos
		Random rand = new Random();
		int num = rand.nextInt(3) + 1;
		Scanner teclado = new Scanner(System.in);
		// entrada
		System.out.println("JoKenPo");
		System.out.println("1. Pedra");
		System.out.println("2. Papel");
		System.out.println("3. Tesoura");
		System.out.print("Digite a opção desejeda: ");
		System.out.println("");
		p1 = teclado.nextInt();
		switch(p1) {
		case 1:
			System.out.println("Você escolheu PEDRA");
			break;
		case 2:
			System.out.println("Você escolheu PAPEL");
			break;
		case 3:
			System.out.println("Você escolheu TESOURA");
			break;
			default:
				System.out.println("Opção inválida");
				break;
		}
		
		switch(num) {
		case 1:
			System.out.println("O pc escolheu PEDRA");
			break;
		case 2:
			System.out.println("O pc escolheu PAPEL");
			break;
		case 3:
			System.out.println("O pc escolheu TESOURA");
			break;
			default:
				System.out.println("Opção inválida");
				break;
		}
		System.out.println("");
		// saída;
		if (p1 == num) {
			System.out.println("Empate");
		} else if ((p1 == 1 && num == 2) || (p1 == 2 && num == 3) || (p1 == 3 && num == 1)) {
			System.out.println("Você perdeu!");
		} else if ((p1 == 1 && num == 3) || (p1 == 2 && num == 1) || (p1 == 3 && num == 2)) {
			System.out.println("Você ganhou!");
		}
		teclado.close();

	}

}
