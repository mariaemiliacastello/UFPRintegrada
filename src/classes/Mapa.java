package classes;

public class Mapa {
	private String campus;
	private String predios;
	private Ensalamento ensalamento;
	
	public Mapa(String campus, String predios, Ensalamento ensalamento) {
        this.campus = campus;
        this.predios = predios;
        this.ensalamento = ensalamento;
    }
	
	public String getCampus() {
        return campus;
    }

    public void setCampus(String campus) {
        this.campus = campus;
    }
    
    public String getPredios() {
    	return predios;
    }
    
    public void setPredios(String predios) {
    	this.predios = predios;
    }
    
    public Ensalamento getEnsalamento() {
    	return ensalamento;
    }
    
    public void setEnsalamento(Ensalamento ensalamento) {
    	this.ensalamento = ensalamento;
    }
    
    public void filtrarMaterias() {
    	System.out.println("Filtrar materias");
    }
}
