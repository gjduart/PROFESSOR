
public class Usuario {
			private String Nome;
			private int Matricula,CargaHorariaTotal;
			static int usuarios = 0;
			
	Usuario(String Nome, int Matricula, int CargaHorariaTotal){
			this.Nome = Nome;
			this.Matricula = Matricula;
			this.CargaHorariaTotal = CargaHorariaTotal;
			usuarios++;
		
	}		
	
	public String toString() {
		return  "\nNome: " + Nome +
				"\nMatricula: " + Matricula +
				"\nCarga Horaria Total: " + CargaHorariaTotal ;
}






	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	
	public int getCargaHorariaTotal() {
		return CargaHorariaTotal;
	}

	public void setCargaHorariaTotal(int cargaHorariaTotal) {
		CargaHorariaTotal = cargaHorariaTotal;
	}

	public int getMatricula() {
		return Matricula;
	}

	public void setMatricula(int matricula) {
		Matricula = matricula;
	}

	
}
