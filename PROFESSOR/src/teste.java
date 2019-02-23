
public class teste {

	public static void main(String[] args) {
		
	
			Aluno a,b,c,d;
			Professor p ;
			 d =new Aluno(null, 0, 0);
			 
			a = new Aluno ("Pernalonga",001,85);
			a.Matricular("Calculo",  80, 1);
			a.Matricular("Poo", 60, 3);
			a.Matricular("Fisica1", 40, 2);
			
			b = new Aluno ("Patolino",002,85);
			b.Matricular("Laboratorio c",  80, 1);
			b.Matricular("Ingles", 20, 3);
			b.Matricular("Fisica1", 40, 2);
			
			c = new Aluno ("Taz",003,85);
			c.Matricular("Metodologia cientifica",40  , 1);
			c.Matricular("Poo", 60, 3);
			c.Matricular("Fisica1", 40, 2);
			
			
			a.CalcularCargaHorária();
			b.CalcularCargaHorária();
			c.CalcularCargaHorária();
			
			System.out.println(a.toString());
			System.out.println(b.toString());
			System.out.println(c.toString());
	
			
			p = new Professor("Jefferson", 001, 0);
			
			p.AbrirDiSciplina("Micro", 4, 3);
			p.AbrirDiSciplina("Eletro", 4, 3);
			p.AbrirDiSciplina("pest", 4, 3);
			p.AbrirDiSciplina("Banco de dados", 4, 3);
			p.AbrirDiSciplina("Micro 2", 6, 3);
		     
			
			
	
		
			
			
			System.out.println(p.toString());
			
			System.out.println("\n Numero de Usuarios:" + Usuario.usuarios);
			
			
}
}