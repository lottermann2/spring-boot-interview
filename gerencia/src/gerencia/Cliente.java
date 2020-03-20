package gerencia;

import java.util.ArrayList;
import java.util.Iterator;

public class Cliente 
{

	private int id;
	private String nome;
	private String sexo;
	private String nascimento;
	private String cidadeMora;
	
	
	public Cliente(String nome, String sexo, String nascimento, String cidadeMora, int id) {
		super();
		this.nome = nome;
		this.sexo = sexo;
		this.nascimento = nascimento;
		this.cidadeMora = cidadeMora;
		this.id = id;
	}


public void consultarNome(String nome, ArrayList listaCliente, ArrayList listaCidade, Cidade cidade)
{
	Iterator<Cliente> it = listaCliente.iterator();							// Outro Iterator para percorrer a Lista
	while (it.hasNext())													// Passado por referencia a cidade e a listaCidade para poder pesquisar o estado da cidade
	{
		Cliente nomeConsulta = it.next();
		if (nomeConsulta.getNome().startsWith(nome))
		{
			System.out.println("Nome: " + nomeConsulta.getNome() + "\nID: " + nomeConsulta.getId() + "\nSexo " + nomeConsulta.getSexo() + "\nCidade");
			cidade.consultarCidadeNome(nomeConsulta.getCidadeMora(), listaCidade);				//Busca a cidade e o estado.
		}
	}
}

public void consultarID(int id, ArrayList listaCliente, ArrayList listaCidade, Cidade cidade)
{
	Iterator<Cliente> it = listaCliente.iterator();						// Unica diferença para o "ConsultarNome" é a verificação, que verifica o ID
	while (it.hasNext())												// ao inves do nome
	{
		Cliente idConsulta = it.next();
		if (idConsulta.getId() ==id )
		{
			System.out.println("Nome:" + idConsulta.getNome() + "\nID: " + idConsulta.getId() + "\nSexo: " + idConsulta.getSexo() + "\nCidade:");
			cidade.consultarCidadeNome(idConsulta.getCidadeMora(), listaCidade);
		}
	}
}

public void alteraNome(String nomeAntigo, String nomeNovo, ArrayList listaCliente)
{
	Iterator<Cliente> it = listaCliente.iterator();					// Utiliza a Classe Iterator para percorrer a lista e quando encontrar o nome ele o substitui
	while (it.hasNext()) 
	{
		Cliente nome = it.next();
		if (nome.getNome().startsWith(nomeAntigo))
		{
			
			nome.setNome(nomeNovo);
			System.out.println("Nome alterado com sucesso!\n");
		}
			
	}
}

public void removerCliente(String nomeCliente, ArrayList listaCliente)
{
	Iterator<Cliente> it = listaCliente.iterator();				// Utiliza a Classe Iterator para percorrer a lista e quando encontrar o nome ele o exclui da lista.
	while (it.hasNext()) {
		Cliente nome = it.next();
		if (nome.getNome().startsWith(nomeCliente))
		{
			it.remove();
		}
	}
}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getNascimento() {
		return nascimento;
	}
	public void setNascimento(String nascimento) {
		this.nascimento = nascimento;
	}
	public String getCidadeMora() {
		return cidadeMora;
	}
	public void setCidadeMora(String cidadeMora) {
		this.cidadeMora = cidadeMora;
	}
	
	
	
}
