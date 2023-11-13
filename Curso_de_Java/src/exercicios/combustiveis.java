package exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class combustiveis {

	public static void main(String[] args) {
		// variáveis
		double comp, gasolina, alcool;
		// objetos
		Scanner teclado = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("#0.0");
		// entrada
		System.out.println("Comparação entre gasolina e alcool");
		System.out.print("Preço do litro da gasolina: ");
		gasolina = teclado.nextDouble();
		System.out.print("Preço do litro do alcool: ");
		alcool = teclado.nextDouble();
		// processamento
		comp = gasolina*0.7;
		if (alcool < comp) {
			// saida
			System.out.println("Melhor abastecer com alcool.");
		} else {
			// saida
			System.out.println("Melhor abastecer com gasolina.");
		}
		teclado.close();
	}

}
