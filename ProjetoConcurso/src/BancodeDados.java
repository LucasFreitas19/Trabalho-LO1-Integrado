import java.time.LocalDateTime;
import java.util.ArrayList;

import java.util.List;

public class BancodeDados {

	private List<Candidato> candidatos = new ArrayList<Candidato>();

	public void AdicionarCandidato(Candidato candidato) {

		this.candidatos.add(candidato);

	}

	public Candidato filtro(String cpfencontrado) {

		for (Candidato loop : candidatos) {
			if (loop.getCpf().equals(cpfencontrado)) {
				return loop;
			}
		}

		return null;
	}
	
	public List<Prova> filtroPeriodo(LocalDateTime dataInicial, LocalDateTime dataFinal){
		
		List<Prova> provasencontradas = new ArrayList<Prova>();
		for(Prova loop : prova) {
			if(loop.getTime().isAfter(dataInicial) && loop.getTime().isBefore(dataFinal)) {
				provasencontradas.add(loop);
			}
			
		}
		
		return provasencontradas;
		
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
			if (loop.getIdProva() == indicadorProva) {

				return loop;
			}

		}

		return null;

	}

	public List<Prova> Fsalarioprova(double clientsalary) {
		List<Prova> FiltroSPencontradas = new ArrayList<Prova>();
		for (Prova FiltroSPloop : prova) {

			if (FiltroSPloop.getSalariobase() >= clientsalary) {

				FiltroSPencontradas.add(FiltroSPloop);

			}

		}

		return FiltroSPencontradas;

	}

	public List<Prova> Fcidadesprova(String cidaderequerida) {
		List<Prova> FiltroCPencontradas = new ArrayList<Prova>();
		for (Prova filtroCPloop : prova) {
			if (filtroCPloop.getLocal().getCity().equals(cidaderequerida)) {

				FiltroCPencontradas.add(filtroCPloop);

			}

		}

		return FiltroCPencontradas;

	}

	public List<Prova> Fvagasreuqeridas(int Qvagasrequeridas) {
		List<Prova> FiltroQvagasrequeridas = new ArrayList<Prova>();
		for (Prova loopQvagasrequeridas : prova) {

			if (loopQvagasrequeridas.getNumerodevagas() == Qvagasrequeridas) {

				FiltroQvagasrequeridas.add(loopQvagasrequeridas);

			}

		}

		return FiltroQvagasrequeridas;
	}

	public List<Prova> getProva() {
		return prova;
	}

}