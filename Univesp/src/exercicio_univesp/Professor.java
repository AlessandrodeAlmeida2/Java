package exercicio_univesp;

//Classe Professor
public class Professor {
 private String matricula;
 private String nome;
 private double salario;

//Construtor
 public Professor(String matricula, String nome, double salario) {
     this.matricula = matricula;
     this.nome = nome;
     this.salario = salario;
 }

 // Getters
 public String getMatricula() {
     return matricula;
 }

 public String getNome() {
     return nome;
 }

 public double getSalario() {
     return salario;
 }

 // Setters
 public void setMatricula(String matricula) {
     this.matricula = matricula;
 }

 public void setNome(String nome) {
     this.nome = nome;
 }

 public void setSalario(double salario) {
     this.salario = salario;
 }
}
