import java.util.ArrayList;
public class Professor extends Usuario {
	ArrayList< Disciplina > Disciplinas = new ArrayList< Disciplina >();
	
	int carga,ch;
	static boolean b;

	Professor(String nome,int matricula,int Cargahoraria) {
		super(nome, matricula ,Cargahoraria);
		if(Cargahoraria!=0) {
			b=true;
			
		}
	}
	
 
    
	public void AbrirDiSciplina(String nome,int CargaHorariaDisciplina,int semestre) {
	if(b) {
		if(getCargaHorariaTotal() != 0) {
		
		CalcularCargaHoraria(CargaHorariaDisciplina);
		
	    	if (getCarga() < getCargaHorariaTotal()) {
	    		
	    		Disciplinas.add(new Disciplina(nome,CargaHorariaDisciplina,semestre));
	    		ch = getCarga()*2 -getCargaHorariaTotal();
    			
	    	}else {
	    			System.out.printf("\nExcedida carga horaria semanal");
	    	}
		}
	}
}
	public void CalcularCargaHoraria(int CargaHorariaDisciplina) { 
			int i;
			setCarga(0);
			if((getCarga())<getCargaHorariaTotal()) {
				
			for(i=0;i< Disciplinas.size();i++) {
				setCarga((CargaHorariaDisciplina*2)+getCarga());
				
			
		

	}}}
	
	
	public String toString() {
		if(Disciplinas.size()<2) return "\n\nCadastre mais uma disciplina";
			else {
				if (getCargaHorariaTotal()!=0) {
					return "\n\n====================" +
							super.toString() +
							"\nCarga horaria com outras atividades"+ ch +  	Disciplinas.toString() ;
							
						
		}else {
			return "\n\n\nCARGA HORARIA INVALIDA";
		}
	 }
}
	public int getCarga() {
		return carga;
	}

	public void setCarga(int carga) {
		this.carga = carga;
	}

}
