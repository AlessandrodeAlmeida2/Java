package urna;

public class Candidato {
	  // Atributos da classe Candidato
	  private int codigo_votacao;
	  private String nome_candidato;
	  private String partido;
	  private int num_votos;

	  // Construtor da classe Candidato
	  public Candidato(int codigo_votacao, String nome_candidato, String partido) {
	    this.codigo_votacao = codigo_votacao;
	    this.nome_candidato = nome_candidato;
	    this.partido = partido;
	    this.num_votos = 0; // Inicializa o número de votos com zero
	  }

	  // Métodos da classe Candidato
	  // Getters e setters para os atributos
	  public int getCodigo_votacao() {
	    return codigo_votacao;
	  }

	  public void setCodigo_votacao(int codigo_votacao) {
	    this.codigo_votacao = codigo_votacao;
	  }

	  public String getNome_candidato() {
	    return nome_candidato;
	  }

	  public void setNome_candidato(String nome_candidato) {
	    this.nome_candidato = nome_candidato;
	  }

	  public String getPartido() {
	    return partido;
	  }

	  public void setPartido(String partido) {
	    this.partido = partido;
	  }

	  public int getNum_votos() {
	    return num_votos;
	  }

	  public void setNum_votos(int num_votos) {
	    this.num_votos = num_votos;
	  }

	  // Método para incrementar o número de votos do candidato
	  public void receberVoto() {
	    this.num_votos++;
	  }

	}

