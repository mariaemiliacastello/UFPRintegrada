package classes;

import java.util.Date;

public class Disciplina {
	private String nome;
	private Date data;
    private String sala;
    private Aluno[] alunos;
    private String professor;
    private float[] notas;

    public Disciplina(String nome, Date data, String sala, Aluno[] alunos, String professor, float notas[]) {
        this.nome = nome;
    	this.data = data;
        this.sala = sala;
        this.alunos = alunos;
        this.professor = professor;
        this.notas = notas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
    
    public String getSala() {
    	return sala;
    }
    
    public void setSata(String sala) {
    	this.sala = sala;
    }
    
    public Aluno[] getAlunos() {
    	return alunos;
    }
    
    public void setAlunos(Aluno[] alunos) {
    	this.alunos = alunos;
    }
    
    public String getProfessor() {
    	return professor;
    }
    
    public void setProfessor(String professor) {
    	this.professor = professor;
    }
    
    public float[] getNotas() {
    	return notas;
    }
    
    public void setNotas(float[] notas) {
    	this.notas = notas;
    }
    
    public void criarNota() {
    }
    
    public void mandarNotificacao(String msg, Disciplina disciplina) {
    	Aluno[] alunos = disciplina.getAlunos();
        for (Aluno aluno : alunos) {
            Documento documento = aluno.getHistoricoEsclr();
            String email = documento.getEmail();
            documento.enviarEmail(email, msg);
        }
    }
}
