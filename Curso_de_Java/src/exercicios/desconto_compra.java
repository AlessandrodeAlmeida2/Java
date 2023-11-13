package exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class desconto_compra {

	public static void main(String[] args) {
		// variáveis
		double total, desc, pago, total_desc, troco;
		// objetos
		Scanner teclado = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("#0.0");
		// entrada
		System.out.println("Compra com desconto");
		System.out.print("Total da compra: ");
		total = teclado.nextDouble();
		System.out.print("Valor pago: ");
		pago = teclado.nextDouble();
		System.out.print("Desconto: ");
		desc = teclado.nextDouble();
		// processamento
		total_desc = total - total * desc/100;
		troco = total - total_desc;
		// saida
		System.out.println("Total com desconto de " + desc + "% = R$ " + formatador.format(total_desc));
		System.out.println("Troco: R$ " + formatador.format(troco));
		teclado.close();

	}

}
