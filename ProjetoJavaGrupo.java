package ProjetoJava;

import java.util.Scanner;

import ProjetoJava.cadastroPessoa;

public class ProjetoJavaGrupo {

	public static void main(String[] args) {
		//variaveis delcaradas com strings, inteiros e vetor.Também estamos utilizando o vetor para avaliação do usuário.
		Scanner sc = new Scanner(System.in);
		String nome,sobreNome,resp;
		String sexo = "";
		String resultado, senha;
		int numeroMindSet;
		int idadePessoa = 0;
		int x;
		int ava1[] = new int [1];
		int n1,nota=0;
		//nomeRecebe os metodos da classe Pessoa Cadastro.E instanciamos para ser lida no campo de Dados do Usuário
		cadastroPessoa nomeRecebe = new cadastroPessoa();
		//inicio de boas vindas e coleta de valores digitado pelo usuário.Usamos o laço while para que o usuário digite corretamente a letra correta usando o .equals.
		System.out.println("\n********************************|");
		System.out.println("\n     OLÁ, SEJAM BEM VINDES !");
		System.out.println("\n********************************|");
		System.out.println("Vamos conhecer seu Mindset ?");
		System.out.println("\nColoque seu primeiro nome: ");sc.skip("\\R?");nome = sc.nextLine();
		System.out.println("\nColoque seu sobrenome: "); sc.skip("\\R?"); sobreNome = sc.nextLine();
		while(!sexo.equals("m")  && !sexo.equals("f") && !sexo.equals("o") && !sexo.equals("p")) {
			System.out.println("\nColque o seu sexo [m](Masculino), [f](Feminino), [o](Outros) ou [p](Prefiro não dizer).");sexo = sc.next();	
		}
		System.out.println("Coloque sua idade: ");idadePessoa = sc.nextInt();
		System.out.println("Coloque sua senha> ");sc.skip("\\R?"); senha = sc.nextLine();
		while(!senha.equals("turma59")) {
			System.out.println("Coloque sua senha: ");sc.skip("\\R?"); senha = sc.nextLine();
			
		}
		System.out.println("<< << << OBRIGADO POR CONFIRMAR SEUS DADOS >> >> >>");
		System.out.println("*************************************************");
		System.out.println("*************************************************");
		//nomeRecebe pegando dados do usuário e settiando para aparecer os dados do usuário.
		System.out.printf("<< << << << Usuário logado com sucesso >> >> >> >>");
		System.out.println("                                                  ");
		nomeRecebe.getNomePessoa();
		nomeRecebe.setNomePessoa(nome);
		nomeRecebe.getSobrenomePessoa();
		nomeRecebe.setSobrenomePessoa(sobreNome);
		nomeRecebe.getSexo();
		nomeRecebe.setSexo(sexo);
		nomeRecebe.getDataNasc();
		nomeRecebe.setDataNasc(idadePessoa);
		nomeRecebe.getSenha();
		nomeRecebe.setSenha("*********");
		nomeRecebe.imprimirInfo();
		System.out.println("                                                  ");
		System.out.println("==================================================");
		//laço condicional para verificar se o usuário é maior de idade, caso não for maior não poderá seguir com a interação.E também utilizamos o equals para que o usuário digite ok corretamente.
		if(idadePessoa>=18) {
			System.out.println("\nOk ! Você é maior de idade, vamos continuar?");
			System.out.println("\nPara continuar digite [ok] ");resp = sc.next();
			}
		else{
			System.out.println("Opa! desculpe mas você é não é maior de idade e nao podemos continuar!");
			return;
		}
		while(!resp.equals("ok")) {
			System.out.println("\nPara continuar digite [ok] ");resp = sc.next();
		}
		//laço condicional escolha caso, para que o usuário escolha o seu potencial e mostrar o resultado final da sua mentalidade.
		System.out.println("==================================");
		System.out.println("AGORA VAMOS TESTAR O SEU MINDSET");
		System.out.println("==================================");
		System.out.println("\n<< << DIGITE O NÚMERO QUE CORRESPONDE COM SUAS CARACTERÍSTICAS >> >>");
		System.out.println("\nDigite [1] para | AQUELE QUE NÃO DESISTE, É MUITO ÁGIL E MUITO CORAJOSO|");
		System.out.println("\nDigite [2] para | BEM ORGANIZADO, MUITO RESPONSÁVEL E AQUELE QUE NÃO DÁ DESCULPAS|");
		System.out.println("\nDigite [3] para | MUITO DETALHISTA, BEM ATENTO E BEM PROATIVO|");
		System.out.println("\nDigite [4] para | QUEM GOSTA DE CONTRUIR RELACIONAMENTO, BEM INFORMATIVO E TRABALHO EM GRUPO|");
		System.out.println("\nDigite [5] para | QUEM CRIA UM ROTEIRO PRA VIDA, COMO AS COISAS IMPACTAM SUA VIDA E VER O PROGRESSO|");
		System.out.println("\nDigite [6] para | QUEM TOMA DECISÕES OPORTUNAS, PROCURA SOLUÇÕES PRESENTES E FUTURAS E ASSUME RESPONSABILIDADE|");
		System.out.println("\nDigite [7] para | DE INSPIRAR CONFIANÇA, TRABALHAR JUNTOS E E ATINGIR OBJETIVOS|");
		System.out.println("\nDigite [8] para | QUEM GOSTA DE APRIMORAR SUA CAPACIDADE, SUPERA AS ADVERSIDADES E GOSTA DE DESAFIOS|");
		numeroMindSet = sc.nextInt();
		//escolha caso delacradas.
		switch(numeroMindSet) {
		case 1:
			resultado = ("PERSISNTECIA");
			System.out.println("=======================================");
			System.out.println("O SEU MINDSET É: "+resultado);
			System.out.println("=======================================");
			break;
		case 2:
			resultado = ("RESPONSABILIDADE PESSOAL");
			System.out.println("=======================================");
			System.out.println("O SEU MINDSET É: "+resultado);
			System.out.println("=======================================");
			break;	
		case 3:
			resultado = ("ORIENTAÇÃO AO DETALHE");
			System.out.println("=======================================");
			System.out.println("O SEU MINDSET É: "+resultado);
			System.out.println("=======================================");
			break;	
		case 4:
			resultado = ("COMUNICAÇÃO");
			System.out.println("=======================================");
			System.out.println("O SEU MINDSET É: "+resultado);
			System.out.println("=======================================");
			break;
		case 5:
			resultado = ("ORIENTAÇÃO AO FUTURO");
			System.out.println("=======================================");
			System.out.println("O SEU MINDSET É: "+resultado);
			System.out.println("=======================================");
			break;
		case 6:
			resultado = ("PROATIVIDADE");
			System.out.println("=======================================");
			System.out.println("O SEU MINDSET É: "+resultado);
			System.out.println("=======================================");
			break;
		case 7:
			resultado = ("TRABALHO EM EQUIPE");
			System.out.println("=======================================");
			System.out.println("O SEU MINDSET É: "+resultado);
			System.out.println("=======================================");
			break;
		case 8:
			resultado = ("MENTALIDADE DE CRESCIMENTO");
			System.out.println("=======================================");
			System.out.println("O SEU MINDSET É: "+resultado);
			System.out.println("=======================================");
			break;
		default:
			System.out.println("\nOpção inválida!!!");
				}
		//aqui estamos puxando o laço de repetiçao for junto com o vetor com apenas 1 para valor.Para a avaliação da aplicação
		System.out.println("                      ");
		System.out.println("OBRIGADO POR PARTICPAR");
		System.out.println("======================");
		System.out.println("                      ");
		System.out.println("DEIXE SUA AVALIAÇÃO");
		System.out.println("======================");
		for(x=0;x<1;x++) {
			System.out.println("*******************************");
			System.out.println("\nCOLOQUE AQUI SUA NOTA: ");
			System.out.println("[1][2][3][4][5]");n1 = sc.nextInt();
			ava1[x] = (n1);
			nota += ava1[x];
		}
		for(x=0;x<1;x++) {
			if(ava1[x]==5) {
			System.out.println("\n================================");
			System.out.println("\nSUA AVALIAÇÃO FOI DE: "+ava1[x]+".0");
			System.out.println("OBRIGADO POR NOS AVALIAR !!!");
			}
			else if(ava1[x]==4){
				System.out.println("\n================================");
				System.out.println("\nSUA AVALIAÇÃO FOI DE: "+ava1[x]+".0");
				System.out.println("OBRIGADO POR NOS AVALIAR !!!");
			}
			else if(ava1[x]==3) {
				System.out.println("\n================================");
				System.out.println("\nSUA AVALIAÇÃO FOI DE: "+ava1[x]+".0");
				System.out.println("OBRIGADO POR NOS AVALIAR !!!");
				System.out.println("QUE PENA PELA SUA NOTA, IREMOS MELHORAR");
			}
			else if(ava1[x]==2){
				System.out.println("\n================================");
				System.out.println("\nSUA AVALIAÇÃO FOI DE: "+ava1[x]+".0");
				System.out.println("OBRIGADO POR NOS AVALIAR !!!");
				System.out.println("QUE PENA MESMO !!! VAMOS MELHORAR !!!");	
			}
			else if(ava1[x] ==1) {
				System.out.println("\n================================");
				System.out.println("\nSUA AVALIAÇÃO FOI DE: "+ava1[x]+".0");
				System.out.println("OBRIGADO POR NOS AVALIAR !!!");
				System.out.println("SENTIMOS MUITO POR NÃO AGRADAR VOCÊ, MAS IREMOS MELHORAR SEMPRE !!!");	
			}
			else {
				System.out.println("OPÇÃO INVÁLIDA");
			}
			
		}
		
			/* GRUPO 3 GENERATION BORA ZÉ TECH
			*PESSOAS JAVA DESENVOLVEDORES FULL STACK JUNIOR
			*ADÃO TORRES
			*GUILHERME SOUZA
			*HENRIQUE FERREIRA
			*WILLIAN MATHEUS
			*JOEL 
			*MARCELO CALABRARO
			 MATHEUS CAMARGO*/
		}
	

}
