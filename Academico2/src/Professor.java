
public class Professor {
	private String nome;
	private String matricula;
	private String titulacao;
	private String CPF;
	
	//Metodo construtor
	public Professor(String nome, String matricula, String titulacao, String cPF) {
		super();
		this.nome = nome;
		this.matricula = matricula;
		this.titulacao = titulacao;
		CPF = cPF;
	}

	//toString
	public String toString() {
		return "Professor [nome: " + nome + ", matricula: " + matricula + ", titulacao: " + titulacao + ", CPF: " + CPF
				+ "]";
	}
	
	//Get e Set
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getTitulacao() {
		return titulacao;
	}

	public void setTitulacao(String titulacao) {
		this.titulacao = titulacao;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}
	
	
	
	
	
	
	

}
