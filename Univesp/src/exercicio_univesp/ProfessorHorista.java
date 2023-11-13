package exercicio_univesp;

//Classe ProfessorHorista
public class ProfessorHorista extends Professor {
 private int horas;

 // Construtor
 public ProfessorHorista(String matricula, String nome, double salario, int horas) {
     super(matricula, nome, salario);
     this.horas = horas;
 }

 // Getter
 public int getHoras() {
     return horas;
 }

 // Setter
 public void setHoras(int horas) {
     this.horas = horas;
 }

 // Método para calcular o salário
 @Override
 public double getSalario() {
     return super.getSalario() * horas;
 }
}
