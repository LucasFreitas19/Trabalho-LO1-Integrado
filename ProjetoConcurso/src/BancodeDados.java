import java.util.ArrayList;

import java.util.List;

public class BancodeDados {

	private List<Candidato> candidatos = new ArrayList<Candidato>();

	public void AdicionarCandidato(Candidato candidato) {

		this.candidatos.add(candidato);

	}

	public Candidato filtro(String cpf) {

		for (Candidato loop : candidatos) {
			if (loop.getCpf().equals(cpf)) {
				return loop;
			}
		}

		return null;
	}

	public List<Candidato> getCandidatos() {
		return candidatos;
	}

	private List<Prova> prova = new ArrayList<Prova>();
	
	
	
	

	public void AdicionarProva(Prova prova) {

		this.prova.add(prova);

	}
	
	
	public Prova filtrop(int indicadorProva) {
		
		for (Prova loop : prova) {
			if(loop.getNumerodevagas() == indicadorProva) {
				
				return loop;
			}
			
			
		}
		
		
		return null;
		
	}

	public List<Prova> getProva() {
		return prova;
	}

}