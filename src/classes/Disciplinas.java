package classes;

public class Disciplinas {
	private Disciplina[] disciplinas;
	
	public Disciplinas(Disciplina[] disciplinas) {
        this.disciplinas = disciplinas;
    }
	
	public Disciplina[] getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(Disciplina[] disciplinas) {
        this.disciplinas = disciplinas;
    }
    
    public Disciplina getDisciplinaPorNome(Disciplinas disciplinas, String nome) {
    	for (int i = 0; i < disciplinas.getDisciplinas().length; i++) {
            if(disciplinas.getDisciplinas()[i].getNome() == nome) {
            	return disciplinas.getDisciplinas()[i];
            }
        }
		return null;
    }
    
    public Disciplina getDisciplina(Disciplina d) {
    	System.out.println("Get disciplina");
    	return d;
    }
}
