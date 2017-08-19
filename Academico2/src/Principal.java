
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Aluno Numero 1*
		Disciplina d1 = new Disciplina ("LP 1", "CC", 40);	
		Professor p1 = new Professor ("Marco", "1643297852", "Pos-Graduação", "70292998172");
		Turma t1 = new Turma ("B", p1.getNome(), d1.getNome());
	
		
		//Instanciar objeto da classe
		Aluno a1 = new Aluno ("Alexandra", "20708050", "Feminina", LocalDate.of(1995, Month.JUNE, 21));
		Aluno a2 = new Aluno ("Josue", "21708452", "Masculina", LocalDate.of(1999, Month.MAY, 25));
		Aluno a3 = new Aluno ("Gago", "25639852", "Masculina", LocalDate.of(2000, Month.MARCH, 03));
		Aluno a4 = new Aluno ("Alberto", "24236981", "Masculina", LocalDate.of(1996, Month.JANUARY, 12));
		Aluno a5 = new Aluno ("Rodrigo", "34529156", "Masculina", LocalDate.of(1996, Month.SEPTEMBER, 30));
		Aluno a6 = new Aluno ("Luize", "46825645", "Masculina", LocalDate.of(1998, Month.DECEMBER, 02));
		
		
		/*//Imprimir imformaçao basica
		System.out.println(a1);
		System.out.println(d1);
		System.out.println(p1);
		System.out.println(t1);*/
				
				
		//Adicionar aluno em turma1
		t1.adicionarAluno(a1);
		t1.adicionarAluno(a2);
		t1.adicionarAluno(a3);
		t1.adicionarAluno(a4);
		t1.adicionarAluno(a5);
		t1.adicionarAluno(a6);
		
		
		/*//Imprimindo aluno na array
		System.out.println(t1.getAluno().get(0).getNome());
		System.out.println(t1.getAluno().get(1).getNome());
		System.out.println(t1.getAluno().get(2).getNome());
		System.out.println(t1.getAluno().get(3).getNome());
		System.out.println(t1.getAluno().get(4).getNome());
		System.out.println(t1.getAluno().get(5).getNome());*/
		
		
		/*//Navegar pela estrutura do ArrayList de aluno que está dentro da turma
		
		for (int i = 0; i < t1.getAluno().size(); i++) {
			System.out.println(t1.getAluno().get(i).getNome());			
		}*/
		
		System.out.println(t1.ListarAluno());
		
		//Determinar mancao e aprovaçao com base na nota
		Calculadora c1 = new Calculadora();		
		
		System.out.println("Menção: " + c1.calcularMencao(6.7) + " e Resultado: " + c1.cacularResultado("MM"));
		   
		    }
		}
	
