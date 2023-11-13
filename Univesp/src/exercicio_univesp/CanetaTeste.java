package exercicio_univesp;

//Classe CanetaTeste
public class CanetaTeste {
public static void main(String[] args) {
   Caneta caneta = new Caneta("BIC", "Azul", 10);
   
   System.out.println(caneta.toString());
   
   caneta.setMarca("Faber-Castell");
   caneta.setCor("Vermelho");
   caneta.setTamanho(15);
   
   System.out.println(caneta.toString());
 }
}
