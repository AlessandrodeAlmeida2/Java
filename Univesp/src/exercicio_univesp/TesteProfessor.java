package exercicio_univesp;

//Classe TesteProfessor
public class TesteProfessor {
public static void main(String[] args) {
   ProfessorConcursado profConcursado = new ProfessorConcursado("123", "João", 5000);
   System.out.println("Matrícula: " + profConcursado.getMatricula());
   System.out.println("Salário: " + profConcursado.getSalario());

   ProfessorHorista profHorista = new ProfessorHorista("456", "Maria", 200, 20);
   System.out.println("Matrícula: " + profHorista.getMatricula());
   System.out.println("Salário: " + profHorista.getSalario());
}
}
