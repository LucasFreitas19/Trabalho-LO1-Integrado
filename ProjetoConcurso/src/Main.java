import java.time.LocalDateTime;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		

		Scanner teclado = new Scanner(System.in);
		String opcao = "S";
		BancodeDados bancodedados = new BancodeDados();
		while (opcao.equals("S")) {

			System.out.println("Informe uma opcao do menu");
			System.out.println("1- Cadastrar prova");
			System.out.println("2- Cadastrar um candidato");
			System.out.println("3 - Inscrever um candidato para uma determinada prova");
			System.out.println("4 - Mostrar concursos com intervalos entre datas");
			System.out.println("5 -  Mostrar os concursos com salarios maiores que um determinado valor");
			System.out.println("6 - Mostrar os concursos de uma determinada cidade");
			System.out.println("7 - Mostrar os concursos com um determinado numero de vagas");
			System.out.println("8 - Sair");

			int opcaoMenu = teclado.nextInt();
			if (opcaoMenu == 1) {

				System.out.println("Informe seu Estado");
				String state = teclado.next();
				System.out.println("Informe sua Cidade");
				String city = teclado.next();
				System.out.println("Informe empresa");
				String empresa = teclado.next();
				System.out.println("Informe a descricao");
				String descricao = teclado.next();
				System.out.println("Informe o numero de vagas");
				int numerodevagas = teclado.nextInt();
				System.out.println("Informe o salario base");
				double salariobase = teclado.nextDouble();
				System.out.println("Informe o Bairro");
				String bairro = teclado.next();
				System.out.println("Informe a rua");
				String road = teclado.next();
				System.out.println("Informe o numero");
				int number = teclado.nextInt();
				System.out.println("informe o ano da prova");
				int ano = teclado.nextInt();
				System.out.println("informe o mes da prova");
				int mes = teclado.nextInt();
				System.out.println("informe o dia da prova");
				int dia = teclado.nextInt();
				System.out.println("informe o hora da prova");
				int hora = teclado.nextInt();
				System.out.println("informe o minuto da prova");
				int minuto = teclado.nextInt();
				System.out.println("Informe o indicador da prova");
				int idProva = teclado.nextInt();

				int id = bancodedados.getProva().size() + 1;

				Endereco endereco = new Endereco(city, road, number, state, bairro);
				LocalDateTime timer = LocalDateTime.of(ano, mes, dia, hora, minuto);

				Prova prova = new Prova(empresa, numerodevagas, salariobase, endereco, descricao, timer, idProva);
				bancodedados.AdicionarProva(prova);
				for (Prova prov : bancodedados.getProva()) {

					System.out.println(prov.getLocal().getCity());
					System.out.println(prov.getEmpresa());
					System.out.println(prov.getDescricao());
					System.out.println(prov.getNumerodevagas());
					System.out.println(prov.getSalariobase());
					System.out.println(prov.getTime());

				}

			}

			else if (opcaoMenu == 2) {
				System.out.println("Informe o Nome");
				String name = teclado.next();
				System.out.println("Informe o Cpf");
				String cpf = teclado.next();

				Candidato candidato = new Candidato(cpf, name);
				bancodedados.AdicionarCandidato(candidato);
				int id = bancodedados.getCandidatos().size() + 1;

				for (Candidato cand : bancodedados.getCandidatos()) {

					System.out.println(cand.getName());
					System.out.println(cand.getCpf());
				}

			}

			else if (opcaoMenu == 3) {

				System.out.println("Informe o indicador da prova");
				int indicadorProva = teclado.nextInt();
				System.out.println("Informe o indicador do aluno");
				String cpfencontrado = teclado.next();

				Candidato encontrado = bancodedados.filtro(cpfencontrado);
				if (encontrado == null) {

					System.out.println("Candidato não encontrado");
				}

				Prova encontrada = bancodedados.filtrop(indicadorProva);
				if (encontrada == null) {

					System.out.println("Prova não encontrada");

				}
				
				if(encontrado != null && encontrada != null) {
					
					encontrada.IncreverCandidato(encontrado);
					
					
					
				}
			} else if(opcaoMenu == 4){
				
				
				System.out.println("Informe o ano da prova");
				int anoInicial = teclado.nextInt();
				System.out.println("Informe o mes da prova");
				int mesInicial = teclado.nextInt();
				System.out.println("Informe o dia da prova");
				int diaInicial = teclado.nextInt();
				
				System.out.println("Informe o ano da prova");
				int anoFinal = teclado.nextInt();
				System.out.println("Informe o ano da prova");
				int mesFinal = teclado.nextInt();
				System.out.println("Informe o ano da prova");
				int diaFinal = teclado.nextInt();
				
				LocalDateTime dataInicial = LocalDateTime.of(anoInicial, mesInicial, diaInicial, 0, 0);
				LocalDateTime dataFinal = LocalDateTime.of(anoFinal, mesFinal, diaFinal, 23, 59);
				
				List<Prova> provasencontradas = bancodedados.filtroPeriodo(dataInicial, dataFinal);
				
				if(provasencontradas.isEmpty()) {
					System.out.println("Nenhuma prova encontrada");
					
					
				}else {
					
					for(Prova loop : provasencontradas) {
						
						System.out.println(loop.getIdProva() + " - " + loop.getEmpresa() + " - " + loop.getTime()
						+ " - " + loop.getSalariobase() + "R$");
					}
					
				}
				
				
				
				
				
				
			}
			
			
			
			
			else if (opcaoMenu == 5) {

				System.out.println("Qual o salario minimo que o curso deve oferecer?");
				double clientsalary = teclado.nextDouble();

				List<Prova> selecionada = bancodedados.Fsalarioprova(clientsalary);

				if (selecionada == null) {
					System.out.println("Não existe nenhuma prova com o salario requerido");
				} else {

					System.out.println("As provas requeridas são:");
					for (Prova loop : selecionada) {

						System.out.println(loop.getIdProva() + " - " + loop.getEmpresa() + " - " + loop.getTime()
								+ " - " + loop.getSalariobase() + "R$");

					}

				}

			} else if (opcaoMenu == 6) {

				System.out.println("Qual a cidade que voce quer requerir a lista de provas?");
				String cidaderequerida = teclado.next();

				List<Prova> selecionadas = bancodedados.Fcidadesprova(cidaderequerida);

				if (selecionadas.equals(null)) {
					System.out.println("Está cidade não possui provas");
				} else {

					System.out.println("A cidade " + cidaderequerida + " possui estas provas:");
					for (Prova loop : selecionadas) {

						System.out.println(loop.getIdProva() + " - " + loop.getEmpresa() + " - " + loop.getTime()
								+ " - " + loop.getSalariobase() + "R$");
						System.out.println("Está prova acontecerá no bairro " + loop.getLocal().getBairro() + " - "
								+ loop.getLocal().getRoad() + " - " + loop.getLocal().getNumber());

					}

				}

			} else if (opcaoMenu == 7) {

				System.out.println("Voce quer ver os concursos com quantas vagas?");
				int Qvagasrequerida = teclado.nextInt();

				List<Prova> requeridas = bancodedados.Fvagasreuqeridas(Qvagasrequerida);

				if (requeridas == null) {

					System.out.println("Não há concursos com este numero de vagas");

				} else {

					System.out.println("As provas com " + Qvagasrequerida + "é:");
					for (Prova loop : requeridas) {

						System.out.println(loop.getIdProva() + " - " + loop.getEmpresa() + " - " + loop.getTime()
								+ " - " + loop.getSalariobase() + "R$");

					}

				}

			} else if (opcaoMenu == 8) {

				opcao = "dslkdjkk";

			}
		}
	}
}
