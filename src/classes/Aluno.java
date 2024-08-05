package classes;

public class Aluno {
    private String nome;
    private String grr;
    private Documento historicoEsclr;
    private float ira;
    private Disciplinas matriculas;

    public Aluno(String nome, String grr, Documento historicoEsclr, float ira, Disciplinas matriculas) {
        this.nome = nome;
        this.grr = grr;
        this.historicoEsclr = historicoEsclr;
        this.ira = ira;
        this.matriculas = matriculas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGrr() {
        return grr;
    }

    public void setGrr(String grr) {
        this.grr = grr;
    }
    
    public Documento getHistoricoEsclr() {
        return historicoEsclr;
    }

    public void setHistoricoEsclr(Documento historicoEsclr) {
        this.historicoEsclr = historicoEsclr;
    }
    
    public float getIra() {
        return ira;
    }

    public void setIra(float ira) {
        this.ira = ira;
    }
    
    public Disciplinas getMatriculas() {
        return matriculas;
    }

    public void setMatriculas(Disciplinas matriculas) {
        this.matriculas = matriculas;
    }

}
