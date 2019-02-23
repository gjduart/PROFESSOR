
public class Disciplina {
		private String Nome;
		private int Cargahoraria,Semestre;
		


	Disciplina(String Nome , int Cargahoraria, int Semestre){
		this.Nome = Nome ;
		this.Cargahoraria = Cargahoraria;
		this.Semestre = Semestre;
 }

	
	public String toString() {
		return 	"\n-------------------------\nDisciplina: " + Nome +
				"\nCarga Horaria: " + Cargahoraria +"h"+ 
				"\nSemestre: " + Semestre;
	}

	
	//Getters and Setters
	public String getNome() {
		return Nome;
	}


	public void setNome(String nome) {
		Nome = nome;
	}


	public int getCargahoraria() {
		return Cargahoraria;
	}


	public void setCargahoraria(int cargahoraria) {
		Cargahoraria = cargahoraria;
	}


	public int getSemestre() {
		return Semestre;
	}


	public void setSemestre(int semestre) {
		Semestre = semestre;
	}

	
}
