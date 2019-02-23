import java.util.ArrayList;
public class Professor extends Usuario {
	ArrayList< Disciplina > Disciplinas = new ArrayList< Disciplina >();
	int carga;
	

	Professor(String nome,int matricula,int Cargahoraria) {
		super(nome, matricula ,Cargahoraria);
		if(Cargahoraria!=0) {
			inicio();
			
		}
	}
	
    public void inicio() {
    	Disciplinas.add(new Disciplina("Disciplina a",4,2));
    	Disciplinas.add(new Disciplina("Disciplina b",6,4));
    }

    
	public void AbrirDiSciplina(String nome,int CargaHorariaDisciplina,int semestre) {
	  if(getCargaHorariaTotal() != 0) {
		CalcularCargaHoraria();
	    	if (getCarga() > getCargaHorariaTotal()) {
	    		System.out.printf("\nExcedida carga horaria semanal");
			
	    	}	
	    	else {
	    		Disciplinas.add(new Disciplina(nome,CargaHorariaDisciplina,semestre));
	    	}
		}
	}
	public void CalcularCargaHoraria() { 
			int i;
			for(i=0;i<Disciplinas.size()-1;i++) {
				setCarga((Disciplinas.get(i).getCargahoraria()*2) +  getCarga());
	
		}
	}
	
	
	
	public String toString() {
		if (getCargaHorariaTotal()!=0) {
		return "\n\n====================" +
				super.toString() +Disciplinas.toString() ;
				
						
	}else {
		return "\n\n\nCARGA HORARIA INVALIDA";
	}}
	
	public int getCarga() {
		return carga;
	}

	public void setCarga(int carga) {
		this.carga = carga;
	}

}
