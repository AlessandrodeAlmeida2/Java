package urna;

import java.util.ArrayList;

public class Urna {
	  public static void main(String[] args) {
	    // Criação dos objetos Candidato
	    Candidato joao = new Candidato(10, "João", "Partido A");
	    Candidato maria = new Candidato(15, "Maria", "Partido B");
	    Candidato paulo = new Candidato(11, "Paulo", "Partido C");

	    // Criação do objeto Eleitor
	    Eleitor eleitor = new Eleitor();

	    // Adição dos candidatos à lista de candidatos do eleitor
	    eleitor.adicionarCandidato(joao);
	    eleitor.adicionarCandidato(maria);
	    eleitor.adicionarCandidato(paulo);

	    // Loop para exibir o menu e ler a opção do usuário
	    while (true) {
	      // Exibição do menu de votação
	      eleitor.mostrarMenu();

	      // Leitura da opção digitada pelo usuário
	      eleitor.lerOpcao();

	      // Validação da opção digitada pelo usuário
	      if (eleitor.validarOpcao()) {
	        System.out.println("Opção válida!");
	        // Trata a opção escolhida pelo usuário
	        switch (eleitor.getOpcao()) {
	          case 1: // Votar
	            eleitor.votar();
	            break;
	          case 2: // Votar branco
	            // Adicione aqui o código para votar em branco
	            break;
	          case 3: // Votar nulo
	            // Adicione aqui o código para votar nulo
	            break;
	          case 999: // Carregar a lista de candidatos do servidor
	        	  // Adicione aqui o código para carregar a lista de candidatos do servidor
	        	  ArrayList<Candidato> candidatosDoServidor = eleitor.getCandidatos();
	        	  for (Candidato candidato : candidatosDoServidor) {
	        	    System.out.println("Candidato: " + candidato.getNome_candidato());
	        	    System.out.println("Partido: " + candidato.getPartido());
	        	    System.out.println("Nº: " + candidato.getCodigo_votacao());
	        	    System.out.println("-------------------------");
	        	  }
	        	  break;
	          case 888: // Finalizar as votações da urna e enviar ao servidor
	        	  // Adicione aqui o código para finalizar as votações da urna e enviar ao servidor
	        	  eleitor.imprimirResultados(); // Imprime os resultados da votação
	        	  eleitor.fecharScanner(); // Fecha o Scanner antes de sair
	        	  return; // Sai do loop e termina o programa
	        }
	      } else {
	        System.out.println("Opção inválida!");
	      }
	    }
	  }
	}
