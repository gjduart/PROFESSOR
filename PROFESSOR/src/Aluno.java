import java.util.ArrayList;

public class Aluno extends Usuario{
	ArrayList< Disciplina > Disciplinas = new ArrayList< Disciplina >();
	
	
	Aluno(String Nome, int Matricula, int CargaHorariaTotal) {
		super(Nome, Matricula, CargaHorariaTotal);
		
	}

	
	
	public void Matricular(String nome,int Cargahoraria, int semestre) {
			Disciplina n = new Disciplina(nome, Cargahoraria, semestre);
			Disciplinas.add(n);
	}

	
	public void CalcularCargaHorária() { 
		int i;
		for(i=0;i<Disciplinas.size()-1;i++) 
			setCargaHorariaTotal(Disciplinas.get(i).getCargahoraria() +  getCargaHorariaTotal());
	}


	public String toString() {
		return "\n====================" + super.toString() +Disciplinas.toString()   ;
			
					
	}
	
	
}