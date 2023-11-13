package urna;

import java.util.ArrayList;
import java.util.Scanner;

public class Eleitor {
  // Atributos da classe Eleitor
  private int opcao; // Opção do menu de votação
  private ArrayList<Candidato> candidatos; // Lista de candidatos disponíveis
  private Scanner sc; // Objeto Scanner para ler a entrada do usuário

  // Construtor da classe Eleitor
  public Eleitor() {
    this.opcao = -1; // Inicializa a opção com um valor inválido
    this.candidatos = new ArrayList<Candidato>(); // Inicializa a lista de candidatos vazia
    this.sc = new Scanner(System.in); // Inicializa o objeto Scanner
  }

  // Métodos da classe Eleitor
  // ...

  // Método para adicionar um candidato à lista de candidatos
  public void adicionarCandidato(Candidato candidato) {
    this.candidatos.add(candidato);
  }
  
  public int getOpcao() {
	  return this.opcao;
	}


  // Método para exibir o menu de votação na tela
  public void votar() {
    System.out.print("Digite o código de votação do candidato: ");
    int codigo = sc.nextInt(); // Lê um inteiro e atribui ao código

    // Procura o candidato na lista de candidatos
    for (Candidato candidato : this.candidatos) {
      if (candidato.getCodigo_votacao() == codigo) {
        // Se o candidato for encontrado, incrementa o número de votos
        candidato.receberVoto();
        System.out.println("Voto registrado com sucesso!");
        return;
      }
    }

    // Se o candidato não for encontrado, exibe uma mensagem de erro
    System.out.println("Candidato não encontrado!");
  }

  public void mostrarMenu() {
    System.out.println("Escolha uma opção:");
    System.out.println("1 - Votar (Irá solicitar o código de votação de um candidato)");
    System.out.println("2 - Votar branco");
    System.out.println("3 - Votar nulo");
    System.out.println("999 - Carregar a lista de candidatos do servidor");
    System.out.println("888 – Finalizar as votações da urna e enviar ao servidor");
    System.out.print("Opção: ");
  }

  // Método para ler a opção digitada pelo usuário
  public void lerOpcao() {
    this.opcao = sc.nextInt(); // Lê um inteiro e atribui à opção
  }
  
  //Lista de candidatos
  public ArrayList<Candidato> getCandidatos() {
	  return this.candidatos;
	}

  // Método para validar a opção digitada pelo usuário
  public boolean validarOpcao() {
    if (this.opcao == 1 || this.opcao == 2 || this.opcao ==3 || this.opcao ==999 || this.opcao ==888) {
      return true; // A opção é válida
    } else {
      return false; // A opção é inválida
    }
  }

  public void fecharScanner() {
    if (this.sc != null) {
      this.sc.close();
    }
  }
  
  public void imprimirResultados() {
	  System.out.println("Resultados da votação:");
	  for (Candidato candidato : this.candidatos) {
	    System.out.println("Candidato: " + candidato.getNome_candidato());
	    System.out.println("Partido: " + candidato.getPartido());
	    System.out.println("Votos: " + candidato.getNum_votos());
	    System.out.println("-------------------------");
	  }
	}
}

