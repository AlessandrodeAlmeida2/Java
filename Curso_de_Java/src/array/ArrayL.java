package array;

import java.util.ArrayList;

public class ArrayL {

	public static void main(String[] args) {
		ArrayList<String> contatos = new ArrayList<>();
		contatos.add("José de Assis");
		contatos.add("9999-9999");
		contatos.add("jose@gmail.com");
		contatos.add("Robson Azevedo");
		contatos.add("555-4444");
		contatos.add("rob@gmail.com");
		System.out.println("Tamanho do array: " + contatos.size());
		System.out.println(contatos);
		System.out.println("E-mail José de Assis (Índice[2]) " + contatos.get(2));
		System.out.println("______________________");
		for (int i = 0; i < contatos.size(); i++) {
			System.out.println(contatos.get(i));
		}

	}

}
