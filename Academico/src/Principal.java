
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Aluno a1 = new Aluno ("Alexandra", "20708050", 21, "Medicina", "Manha", "Feminina");
		Disciplina d1 = new Disciplina ("fisionomia", "Medicina", 40);
		
		Aluno a2 = new Aluno ("Josue", "21708452", 18, "Ciencia da Computacao", "Noturno", "Masculino");
		Disciplina d2 = new Disciplina ("LP 1", "CC", 40);
		
		System.out.println(a1.imprimirAluno());
		System.out.println(d1);
		System.out.println(a2.imprimirAluno());
		System.out.println(d2);
		
		System.out.println(a1.getNome());
		System.out.println(a1.getIdade());
		
		

	}

}
