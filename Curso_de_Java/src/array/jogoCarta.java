package array;

public class jogoCarta {

	public static void main(String[] args) {
		String[] cartas = {"A", "2","3","4","5","6","7","8","9","10","Q","J","K"};
		String[] nipes = {"Ouros", "Copas", "Espadas", "Paus"};
		String nipe = nipes[(int) (Math.random()*4)];
		String carta = cartas[(int) (Math.random()*cartas.length)];
		System.out.println(carta + " de " + nipe);

	}

}
