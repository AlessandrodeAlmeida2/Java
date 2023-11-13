package exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class hora_servico {

	public static void main(String[] args) {
		// variáveis
		double hora, remuneracao, cargaHoraria, custo;
		// objetos
		Scanner teclado = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("#0.0");
		// entrada
		System.out.println("Calculo da hora de um serviço");
		System.out.print("Carga horária mensal: ");
		cargaHoraria = teclado.nextDouble();
		System.out.print("Custo operacional mensal: ");
		custo = teclado.nextDouble();
		System.out.print("Remuneração mensal: ");
		remuneracao = teclado.nextDouble();
		// processamento
		hora = (remuneracao + (remuneracao*0.3) + custo + (remuneracao*0.2)) / cargaHoraria;
		// saida
		System.out.println("Valor da hora trabalhada: " + formatador.format(hora));
		teclado.close();

	}

}
