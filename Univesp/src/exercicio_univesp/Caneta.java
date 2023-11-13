package exercicio_univesp;

//Classe Caneta
public class Caneta {
 private String marca;
 private String cor;
 private int tamanho;

 // Construtor
 public Caneta(String marca, String cor, int tamanho) {
     this.marca = marca;
     this.cor = cor;
     this.tamanho = tamanho;
 }

 // Getters
 public String getMarca() {
     return marca;
 }

 public String getCor() {
     return cor;
 }

 public int getTamanho() {
     return tamanho;
 }

 // Setters
 public void setMarca(String marca) {
     this.marca = marca;
 }

 public void setCor(String cor) {
     this.cor = cor;
 }

 public void setTamanho(int tamanho) {
     this.tamanho = tamanho;
 }

 // Método toString
 @Override
 public String toString() {
     return "Caneta{" +
             "marca='" + marca + '\'' +
             ", cor='" + cor + '\'' +
             ", tamanho=" + tamanho +
             '}';
 }
}
