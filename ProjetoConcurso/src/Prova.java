import java.time.LocalDateTime;

public class Prova {
	
	private int idProva;
	private LocalDateTime time;
	private String empresa;
	private int numerodevagas;
	private double salariobase;
	private Endereco local;
	private String descricao;
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
	public Prova(String empresa, int numerodevagas, double salariobase, Endereco local, String descricao, LocalDateTime time, int idProva) {
		super();
		this.empresa = empresa;
		this.numerodevagas = numerodevagas;
		this.salariobase = salariobase;
		this.local = local;
		this.descricao = descricao;
		this.time = time;
		this.idProva = idProva;
	}
	
	public void inscricao(Candidato candidatos) {
		
		
		String inscrito = candidatos.getCpf();
		inscrito = inscrito + idProva;
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
}
