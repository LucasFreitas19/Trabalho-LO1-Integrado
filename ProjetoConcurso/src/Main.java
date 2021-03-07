import java.time.LocalDateTime;
import java.util.Scanner;

import sun.util.locale.provider.LocaleDataMetaInfo;

public class Main {

	public static void main(String[] args) {

		// 1 - Cadastrar a prova
		// 2 - Cadastrar um candidato
		// 3 - Inscrever um candidato para uma determinada prova
		// 4 - Mostrar concursos com intervalos entre datas
		// Ex.: Os concursos entre 20/01/2020 - 28/01/2020
		// 5 - Mostrar os concursos com salarios maiores que um determinado valor
		// Ex.: O usuário informa R$ 2000,00 e o sistema mostra todos
		// os consursos que estão pagando acima deste valor
		// 6 - Mostrar os concursos de uma determinada cidade
		// Ex.: O usuário informa Porto Alegre e o sistema mostra todos
		// os consursos que são desta cidade
		// 7 - Mostrar os concursos com um determinado numero de vagas
		// 8 - Sair

		
		Scanner teclado = new Scanner(System.in);
		String opcao = "S";
		BancodeDados bancodedados = new BancodeDados();
		while (opcao.equals("S")) {

			System.out.println("Informe uma opcao do menu");
			System.out.println("1- Cadastrar prova");
			System.out.println("2- Cadastrar um candidato");
			System.out.println("3 - Inscrever um candidato para uma determinada prova");
			System.out.println("4 - Mostrar concursos com intervalos entre datas");
			System.out.println(" Mostrar os concursos com salarios maiores que um determinado valor");

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
				System.out.println("Informe seu Bairro");
				String bairro = teclado.next();
				System.out.println("Informe sua rua");
				String road = teclado.next();
				System.out.println("Informe seu numero");
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

				Candidato candidato = new Candidato(name, cpf);
				bancodedados.AdicionarCandidato(candidato);
				int id = bancodedados.getCandidatos().size() + 1;

				for (Candidato cand : bancodedados.getCandidatos()) {

					System.out.println(cand.getName());
					System.out.println(cand.getCpf());
				}

				System.out.println("Deseja continuar?");
				opcao = teclado.next();

			}
			
			else if(opcaoMenu == 3) {
				
				
				System.out.println("Informe o indicador da prova");
				int indicadorProva = teclado.nextInt();
				System.out.println("Informe o indicador do aluno");
				String cpf = teclado.next();
				
				
				Candidato encontrado = bancodedados.filtro(cpf);
				if(encontrado == null) {
					
					System.out.println("Candidato n�o encontrado");
				}
				
				
				Prova encontrada = bancodedados.filtrop(indicadorProva);
				if(encontrada == null) {
					
					System.out.println("Prova n�o encontrada");
					
				}
				
				
				
			}

		}

	}
}
