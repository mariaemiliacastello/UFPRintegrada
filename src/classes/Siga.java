package classes;

public class Siga {
	private Aluno[] alunos;
	private Professor[] professores;
	
	public Siga(Aluno[] alunos, Professor[] professores) {
        this.alunos = alunos;
        this.professores = professores;
    }
	
	public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }
    
    public Professor[] getProfessores() {
    	return professores;
    }
    
    public void setProfessores(Professor[] professores) {
    	this.professores = professores;
    }
}
