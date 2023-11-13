package exercicios;

import java.util.Scanner;

public class dado {

	public static void main(String[] args) {
		char resp = 's';
		Scanner teclado = new Scanner(System.in);
		
		while (resp == 's') {
			int dado = (int)(Math.random()*6) + 1;
			System.out.println(dado);
			System.out.print("Você quer jogar novamente [s|n]?");
			resp = teclado.next().charAt(0);
		}
		teclado.close();
	}
}
