package classes;

public class Ensalamento {
	private Disciplinas cursos;
	
	public Ensalamento(Disciplinas cursos) {
        this.cursos = cursos;
    }
	
	public Disciplinas getCursos() {
        return cursos;
    }

    public void setCursos(Disciplinas cursos) {
        this.cursos = cursos;
    }
    
    public void acessarDisciplina() {
    	System.out.println("Acessar disciplina");
    }
    
    public void getMateriasProximas() {
    	System.out.println("Get materias proximas");
    }
}
