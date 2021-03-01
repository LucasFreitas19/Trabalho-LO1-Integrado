
public class Prova {
	
	
	
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
	public Prova(String empresa, int numerodevagas, double salariobase, Endereco local, String descricao) {
		super();
		this.empresa = empresa;
		this.numerodevagas = numerodevagas;
		this.salariobase = salariobase;
		this.local = local;
		this.descricao = descricao;
	}
	
	
	
	
	
	
	
	
	
}
