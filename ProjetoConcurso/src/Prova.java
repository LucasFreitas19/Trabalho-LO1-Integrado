import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Prova {

	private int idProva;
	private LocalDateTime time;
	private String empresa;
	private int numerodevagas;
	private double salariobase;
	private Endereco local;
	private String descricao;

	private List<Candidato> candidatos = new ArrayList<Candidato>();

	public int getNumerodevagas() {
		return numerodevagas;
	}

	public double getSalariobase() {
		return salariobase;
	}

	public Endereco getLocal() {
		return local;
	}

	public String getDescricao() {
		return descricao;
	}

	public String getEmpresa() {
		return empresa;
	}

	public LocalDateTime getTime() {
		return time;
	}

	public int getIdProva() {
		return idProva;
	}

	public Prova(String empresa, int numerodevagas, double salariobase, Endereco local, String descricao,
			LocalDateTime time, int idProva) {
		super();
		this.empresa = empresa;
		this.numerodevagas = numerodevagas;
		this.salariobase = salariobase;
		this.local = local;
		this.descricao = descricao;
		this.time = time;
		this.idProva = idProva;
	}

	public List<Candidato> getCandidatos() {
		return candidatos;
	}

	public void IncreverCandidato(Candidato candidatos) {

		boolean candidatoInscrito = validar(candidatos);
		if (candidatoInscrito) {

			System.out.println("O candidato já está inscrito");
			return;

		}

		this.candidatos.add(candidatos);

	}

	private boolean validar(Candidato candidato) {

		for (Candidato candidadoInscrito : candidatos) {
			if (candidadoInscrito.getCpf().equals(candidato.getCpf())) {
				return true;

			}

		}

		return false;

	}

}
