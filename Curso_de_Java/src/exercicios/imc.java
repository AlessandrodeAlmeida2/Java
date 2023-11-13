package exercicios;
// teclas (ctrl + shift +f) identa o código

import java.text.DecimalFormat;
import java.util.Scanner;

public class imc {

	public static void main(String[] args) {
		// variáveis
		double altura, peso, imc;
		// objetos
		Scanner teclado = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("#0.0");
		// entrada
		System.out.println("IMC");
		System.out.print("Digite sua altura(m): ");
		altura = teclado.nextDouble();
		System.out.print("Digite seu peso(Kg): ");
		peso = teclado.nextDouble();
		// processamento
		imc = peso / (altura*altura);
		// saída
		System.out.println("Seu imc é: " + formatador.format(imc));
		if (imc < 18.5) {
			System.out.println("Abaixo do peso");
		} else if (imc < 25) {
			System.out.println("Peso ideal");
		} else if (imc < 30) {
			System.out.println("Levemente acima do peso");
		} else if (imc < 35 ) {
			System.out.println("Obesidade grau I");
		} else if (imc < 40) {
			System.out.println("Obesidade grau II (severa)");
		} else {
			System.out.println("Obesidade III (mórbida)");
		}
		teclado.close();

	}

}
