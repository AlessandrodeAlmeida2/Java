package fundamentos;

public class Fundamentos {

	public static void main(String[] args) {
		String nome = "Alessandro de Almeida";
		int idade = 43;
		char sexo = 'M';
		double temperatura = 29.5;
		boolean arCondicionado = false;
		System.out.println("Nome: " + nome);
		System.out.println("Uso de variáveis na linguagem Java.");
		System.out.println("Exemplos: ");
		System.out.println("Idade: " + idade);
		System.out.println("Sexo: " + sexo);
		System.out.println("Temperatura: " + temperatura);
		System.out.println("Ar condicionado: " + arCondicionado);
		System.out.println("");
		double i = 10;
		System.out.println("Operadores aritméticos e atribuições.");
		System.out.println("Exemplos:");
		System.out.println("i = " + i);
		System.out.println("i = " + i + " + 5   | i = "+ (i + 5));
		System.out.println("i = " + i + " - 5   | i = "+ (i - 5));
		System.out.println("i = " + i + " * 5   | i = "+ (i * 5));
		System.out.println("i = " + i + " / 5   | i = "+ (i / 5));
		System.out.println("i = " + i + " mod 5 | i = "+ (i % 5));
		System.out.println("i += 5         | i = " + (i += 5));
		System.out.println("i -= 5         | i = " + (i -= 5));
		System.out.println("i *= 5         | i = " + (i *= 5));
		System.out.println("i /= 5         | i = " + (i /= 5));
		i++;
		System.out.println("i++            | i = " + i);
		i--;
		System.out.println("i --           | i = " + i);
		System.out.println("---------------------------------------");
		System.out.println("");
		System.out.println("Estruturas de controle");
		System.out.println("");
		System.out.println("Estruturas de controle condicional");
		System.out.println("");
		System.out.println("Exemplo 1 - Uso do if");
		
		if (sexo == 'M') {
			System.out.println("Alistamento militar obrigatório.");
		}
		System.out.println("");
		System.out.println("Exemplo 2 - Uso do if - else");
		if (idade < 18) {
			System.out.println("Menor de idade");
		} else {
			System.out.println("Maior de idade");
		}
		System.out.println("");
		System.out.println("Exemplo 3 - Uso do else if");
		
		if (idade < 16) {
			System.out.println("Proibido votar");
		} else if (idade >= 18 && idade <= 70) {
			System.out.println("Voto obrigatório");
		} else {
			System.out.println("Voto facultativo");
		}
		System.out.println("");
		System.out.println("Exemplo 4 - Uso do switch case");
		System.out.println("1. Cadastro de clientes");
		System.out.println("2. Cadastro de usuários");
		System.out.println("3. Relatórios");
		int opcao = 3;
		switch (opcao) {
		case 1:
			System.out.println("Clientes");
			break;
		case 2:
			System.out.println("Usuários");
			break;
		case 3:
			System.out.println("Relatórios");
			break;
		default:
			System.out.println("Opção inválida");
			break;
		}
		System.out.println("");
		System.out.println("Estruturas de repetição");
		System.out.println("");
		System.out.println("Exemplo 5  - Uso do for");
		for (int j = 10; j > 0; j--) {
			System.out.println(j);
		}
		System.out.println("Exemplo 6  - Tabuada");
		for (int tabuada = 0; tabuada <= 10; tabuada++) {
			System.out.println("");
			for (int valor = 0; valor <= 10; valor++)
				System.out.println(tabuada +" x "+ valor + " = " + tabuada * valor);
		}
		System.out.println("");
		System.out.println("Exemplo 7  - Uso do 'while'");
		int contador = 1;
		while (contador <= 10) {
			System.out.println(contador);
			contador++;
		}
		System.out.println("");
		System.out.println("Exemplo 8  - Uso do 'do while'");
		char novoJogo;
		do {
			System.out.println("Deseja jogar novamente(s/n)?");
			novoJogo = 'n';
		} while (novoJogo == 's');
		System.out.println("GAME OVER");
		
	}

}
