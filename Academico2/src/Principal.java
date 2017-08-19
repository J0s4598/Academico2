import java.util.Calendar;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Registrar Nascimento
		Calendar dataNascimento1 = Calendar.getInstance();
		dataNascimento1.set(Calendar.YEAR, 1995); 
		dataNascimento1.set(Calendar.MONTH, Calendar.AUGUST); 
		dataNascimento1.set(Calendar.DAY_OF_MONTH, 21);
		
		
		Aluno a1 = new Aluno ("Alexandra", "20708050", "Feminina", dataNascimento1);
		Disciplina d1 = new Disciplina ("LP 1", "CC", 40);	
		Professor p1 = new Professor ("Marco", "1643297852", "Pos-Graduação", "70292998172");
		Turma t1 = new Turma ("01", p1.getNome(), d1.getNome());
		
		System.out.println(a1);
		System.out.println(d1);
		System.out.println(p1);
		System.out.println(t1);
		
		
		

	}

}
