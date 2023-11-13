package exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class porcentagem {

	public static void main(String[] args) {
		// variáveis
		double n, p, x;
		// objetos
		Scanner teclado = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("#0.0");
		// entrada
		System.out.println("Porcentagem");
		System.out.print("Digite o número para calcular a porcentagem: ");
		n = teclado.nextDouble();
		System.out.print("Digite a porcentagem: ");
		p = teclado.nextDouble();
		// processamento
		x = p / 100 * n;
		// saida
		System.out.println("Porcentagem: " + p + "% de " + n + " = " + formatador.format(x));
		teclado.close();

	}

}
