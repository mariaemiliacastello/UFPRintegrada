package classes;

public class Documento {
	private String nome;
    private String cpf;
    private String rg;
    private String email;
    
    public Documento(String nome, String cpf, String rg, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public void enviarEmail(String email, String msg) {
    	System.out.println("Enviando email para: " + email);
        System.out.println("Mensagem: " + msg);
    }

}
