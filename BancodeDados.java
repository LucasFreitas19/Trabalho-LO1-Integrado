import java.util.ArrayList;

import java.util.List;

public class BancodeDados {
	
	
	private List<Candidato> canditos = new ArrayList<Candidato>();

	public void AdicionarCandidato(Candidato candidato) {
		
		this.canditos.add(candidato);
		
		
		
		
	}
	
	public List<Candidato> getCanditos() {
		return canditos;
	}

	private List<Prova> prova = new ArrayList<Prova>();
	
	public void AdicionarProva(Prova prova) {
		
		this.prova.add(prova);
		
		
	}

	public List<Prova> getProva() {
		return prova;
	}

	

}