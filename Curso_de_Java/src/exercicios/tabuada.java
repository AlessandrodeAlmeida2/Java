package exercicios;

import java.util.Scanner;

public class tabuada {

	public static void main(String[] args) {
		int n, resp;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Qual tabuada você quer fazer: ");
		n = teclado.nextInt();
		for (int tabuada = 0; tabuada <= 10; tabuada++) {
			resp = tabuada * n;
			System.out.println(n + " x " + tabuada + " = " + resp);
			teclado.close();
		}

	}

}
