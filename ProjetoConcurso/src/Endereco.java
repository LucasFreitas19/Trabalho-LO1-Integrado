
public class Endereco {
	
	private String city;
	private String road;
	private int number;
	private String state;
	private String bairro;
	public String getCity() {
		return city;
	}
	public String getRoad() {
		return road;
	}
	public int getNumber() {
		return number;
	}
	public String getState() {
		return state;
	}
	public String getBairro() {
		return bairro;
	}
	
	
	public Endereco(String city, String road, int number, String state, String bairro) {
		super();
		this.city = city;
		this.road = road;
		this.number = number;
		this.state = state;
		this.bairro = bairro;
	}
	
	
	

}
