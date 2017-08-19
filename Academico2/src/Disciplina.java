
public class Disciplina {
	private String nome;
	private String curso;
	private int cargaHoraria;
	
	//Metodo construtor
	public Disciplina(String nome, String matricula, int cargaHoraria) {
		super();
		this.nome = nome;
		this.curso = matricula;
		this.cargaHoraria = cargaHoraria;
	}

	//toString
	public String toString() {
		return "Disciplina [nome: " + nome + ", matricula: " + curso + ", Carga Horaria: " + cargaHoraria +  "]";
	}
	
	//Get e Set
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMatricula() {
		return curso;
	}

	public void setMatricula(String matricula) {
		this.curso = matricula;
	}

	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	
	
	
	
	
	
	
	
	

}
