package gerencia;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Date;

public class main {
		public static void main (String[] args)
		{
			ArrayList<Cidade> listaCidade = new ArrayList<Cidade>();
			ArrayList<Cliente> listaCliente = new ArrayList<Cliente>();
			
			Cidade cidade = new Cidade("", "", listaCidade);
			Cliente cliente = new Cliente("", "", "", "", 0);
			
			
			listaCidade.add(new Cidade("Santa Cruz do Sul", "Rio Grande do Sul", listaCidade));
			listaCidade.add(new Cidade("GC", "Rio Grande do Sul", listaCidade));
			listaCidade.add(new Cidade("CH", "Rio Grande do Sul", listaCidade));
			listaCidade.add(new Cidade("SJ", "Rio Grande do Sul", listaCidade));
			
			listaCliente.add(new Cliente ("Mateus", "M", "0", "GC", 5));
			listaCliente.add(new Cliente ("Bernardo", "M", "0", "GC", 8));
			listaCliente.add(new Cliente ("Julia", "F", "0", "GC", 7));
			listaCliente.add(new Cliente ("Gabriela", "F", "0", "GC", 15));
			
			Scanner scan = new Scanner(System.in);
			int opcao=0;
			int opcaoSeg=0;
			
			String menuPrincipal = new String (" 1- Novo Cadastro\n 2- Consultas\n 3- Alterar Clientes\n 4- Sair\n");
			String menuCadastro = new String (" 1- Cadastrar Cliente\n 2- Cadastrar Cidade\n 3- Voltar\n");
			String menuConsulta = new String (" 1- Consultar Cidade por Nome\n 2- Consultar Cidade por Estado\n 3- Consultar Cliente por Nome\n 4- Consultar Cliente por ID\n 5- Voltar\n");
			String menuAlterar = new String (" 1- Alterar Nome Cliente\n 2- Remover Cliente\n 3- Voltar\n");
			
			
			do
			{
				
			System.out.println(menuPrincipal);
			opcao = Integer.parseInt(scan.nextLine());
			
			if (opcao == 1)
			{
				System.out.println(menuCadastro);
				opcaoSeg = Integer.parseInt(scan.nextLine());
				if (opcaoSeg == 1)
				{
					System.out.println("Digite o nome do Cliente\n");
					String novoCliente = scan.nextLine();
					System.out.println("Digite o sexo do Cliente\n");
					String novoSexo = scan.nextLine();
					System.out.println("Digite a data de nascimento (utilize DD/MM/AAAA)\n");
					String novaData = scan.nextLine();
					System.out.println("Digite a cidade do Cliente:\n");
					String novaCidade = scan.nextLine();
					System.out.println("Digite o ID do Cliente:\n");
					int novoId = Integer.parseInt(scan.nextLine());
					listaCliente.add(new Cliente(novoCliente, novoSexo, novaData, novaData, novoId));
					
				}
				if (opcaoSeg == 2)
				{
					System.out.println("Digite o nome da Cidade:\n");
					String novaCidade = scan.nextLine();
					System.out.println("Digite o nome do Estado:\n");
					String novoEstado = scan.nextLine();
					
					listaCidade.add(new Cidade(novaCidade, novoEstado, listaCidade));
					
				}
			}
			
			if (opcao == 2)
			{
				System.out.println(menuConsulta);
				opcaoSeg = Integer.parseInt(scan.nextLine());
				
				if (opcaoSeg == 1)
				{
					System.out.println("Digite o nome da Cidade\n");
					String consultaCidade = scan.nextLine();
					cidade.consultarCidadeNome(consultaCidade, listaCidade);
				}
				
				if (opcaoSeg == 2)
				{
					System.out.println("Digite o nome do Estado\n");
					String consultaEstado = scan.nextLine();
					cidade.consultarCidadeEstado(consultaEstado, listaCidade);
				}
				
				if (opcaoSeg == 3)
				{
					System.out.println("Digite o nome do Cliente\n");
					String consultaCliente = scan.nextLine();
					cliente.consultarNome(consultaCliente, listaCliente, listaCidade, cidade);
				}
				
				if (opcaoSeg == 4)
				{
					System.out.println("Digite o ID do Cliente\n");
					int consultaId = Integer.parseInt(scan.nextLine());
					cliente.consultarID(consultaId, listaCliente, listaCidade, cidade);
				}
			}
			
			if (opcao == 3)
			{
				System.out.println(menuAlterar);
				opcaoSeg = Integer.parseInt(scan.nextLine());
				
				if(opcaoSeg == 1)
				{
					System.out.println("Nome do cliente que deseja alterar:\n");
					String nomeAntigo = scan.nextLine();
					System.out.println("Novo nome do cliete:\n");
					String nomeNovo = scan.nextLine();
					cliente.alteraNome(nomeAntigo, nomeNovo, listaCliente);
				}
				
				if(opcaoSeg == 2)
				{
					System.out.println("Nome do cliente que deseja remover:");
					String nomeCliente = scan.nextLine();
					cliente.removerCliente(nomeCliente, listaCliente);
				}
				
			}
			}
			while (opcao != 4);
			
		}
		
	}


