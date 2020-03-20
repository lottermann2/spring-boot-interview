package gerencia;

import java.util.ArrayList;
import java.util.Iterator;
public class Cidade
{
	private String nomeCidade;
	private String EstadoCidade;


public Cidade(String nomeCidade, String estadoCidade, ArrayList listaCidade)
	{
	super();
		
		
		//conferirLista(nomeCidade, listaCidade);						// para evitar que tenha duas cidades com o mesmo nome,
		this.nomeCidade = nomeCidade;									// usei um método "conferirLista".
		this.EstadoCidade = estadoCidade;
		//System.out.println("Adicionou");
	}

	
	public void conferirLista(String nomeCidade, ArrayList listaCidade)
	{																			// TENTATIVA FALHA:
		Iterator<Cidade> it = listaCidade.iterator();							// o metodo usa um iterator para percorrer o arraylist
		int posicaoAtual = 0;													// e verifica se o nome que vai ser inserido já existe
		while (it.hasNext())													// ele algum local, se existir, ele exclui a posição
		{																		// atual e adiciona novamente no final.
			Cidade nome = it.next();
			//System.out.println(nome.getNomeCidade() + "==" + nomeCidade);		//Somente um teste
			//System.out.println(posicaoAtual + "\n");
			if (nome.getNomeCidade().startsWith(nomeCidade))
			{
				System.out.println("Cidade já cadastrada.");
				listaCidade.remove(posicaoAtual);
			}
			posicaoAtual++;														// no fim do while, aumenta a posicao do vetor
		}
		
	}

	
	public void consultarCidadeNome(String nomeCidade, ArrayList listaCidade)
	{																							// Utiliza o Iterator para percorrer a lista
		Iterator<Cidade> it = listaCidade.iterator();											// e assim achar o nome da cidade e retorna ela
		while (it.hasNext())
		{
			Cidade nome = it.next();
			if (nome.getNomeCidade().startsWith(nomeCidade))
				System.out.println(nome.getNomeCidade() + ", " + nome.getEstadoCidade());
		}
	}
	
	public void consultarCidadeEstado (String EstadoCidade, ArrayList listaCidade)
	{
		Iterator <Cidade> it = listaCidade.iterator();										// Unica diferença para o "consultarCidadeNome" é que este retorna todas
				while (it.hasNext())														// as cidades do estado
				{
					Cidade estado = it.next();
					if (estado.getEstadoCidade().startsWith(EstadoCidade))
						System.out.println(estado.getNomeCidade() + ", " + estado.getEstadoCidade());
				}
	}
	
	public String getNomeCidade() {
		return nomeCidade;
	}

	public void setNomeCidade(String nomeCidade) {
		this.nomeCidade = nomeCidade;
	}

	public String getEstadoCidade() {
		return EstadoCidade;
	}

	public void setEstadoCidade(String estadoCidade) {
		EstadoCidade = estadoCidade;
	}
	
	
}
