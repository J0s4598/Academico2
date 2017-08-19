import java.util.ArrayList;

public class Turma {
	private String codigo;
	private String professor;
	private String disciplina;
	private ArrayList<Aluno> aluno;
	
	//Metodo construtor
	public Turma(String codigo, String professor, String disciplina) {
		super();
		this.codigo = codigo;
		this.professor = professor;
		this.disciplina = disciplina;
		this.aluno = new ArrayList<Aluno>();
	}

	//toString
	public String toString() {
		return "Turma [codigo: " + codigo + ", professor: " + professor + ", disciplina: " + disciplina + "]";
	}
    
	//Get e Set
	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getProfessor() {
		return professor;
	}

	public void setProfessor(String professor) {
		this.professor = professor;
	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
	
	public ArrayList<Aluno> getAluno() {
		return aluno;
	}

	public void setAluno(ArrayList<Aluno> aluno) {
		this.aluno = aluno;
	}
	
	
	//Metodo que adiciona 1 aluno na turma
	public void adicionarAluno(Aluno aluno){
		this.aluno.add(aluno);
	}

	
	
	
	
	
	
	
	
	
	

}
