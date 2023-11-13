package array;

public class Array2 {

	public static void main(String[] args) {
		String[][] agenda = {{"José", "999-9999", "jose@gmail.com"}, {"Bill", "2222-2222", "bill@hotmail.com"}, {"Linus", "888-8888", "linus@gmail.com"}};
		// a linha abaixo recupera o telefono do José
		System.out.println(agenda[0][1]);
		for (int i = 0; i < agenda.length; i++) {
			System.out.println("____________________________");
			for (int j = 0; j < agenda.length; j++) {
				System.out.println(agenda[i][j]);
			}
		}

	}

}
