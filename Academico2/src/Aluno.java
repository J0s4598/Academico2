import java.util.Calendar;

public class Aluno {
	private String nome;
	private String RA;
	private String sexo;
	private Calendar dataNascimento;
	
	//Metodo construtor
	public Aluno(String nome, String rA, String sexo, Calendar dataNascimento) {
		super();
		this.nome = nome;
		RA = rA;
		this.sexo = sexo;
		this.dataNascimento = dataNascimento;
	}
    
	//toString
	public String toString() {
		return "Aluno [nome: " + nome + ", RA: " + RA + ", sexo: " + sexo + ", Data de Nascimento: " + dataNascimento + "]";
	}


	//get e set
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRA() {
		return RA;
	}

	public void setRA(String rA) {
		RA = rA;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public Calendar getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Calendar dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	
	//Metodo para String 
		public String getDataNacimentoComoString (){
			return this.dataNascimento.get(Calendar.DAY_OF_MONTH) + "/" +
		           this.dataNascimento.get(Calendar.MONTH) + "/" +
				   this.dataNascimento.get(Calendar.YEAR);
		}
	
	
	
	
	
	

}
