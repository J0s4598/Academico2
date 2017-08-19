import java.time.LocalDate;
import java.time.Month;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Aluno Numero 1*
		Aluno a1 = new Aluno ("Alexandra", "20708050", "Feminina", LocalDate.of(1995, Month.JUNE, 21));
		Disciplina d1 = new Disciplina ("LP 1", "CC", 40);	
		Professor p1 = new Professor ("Marco", "1643297852", "Pos-Graduação", "70292998172");
		Turma t1 = new Turma ("01", p1.getNome(), d1.getNome());
		
		System.out.println(a1);
		System.out.println(d1);
		System.out.println(p1);
		System.out.println(t1);
		
		
		

	}

}
