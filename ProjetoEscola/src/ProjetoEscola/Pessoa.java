package ProjetoEscola; 

import java.util.InputMismatchException;
import java.util.Scanner;

public abstract class Pessoa {
	protected String cpf;
	protected String nome;
	protected Sexo sexo;
	protected Cidade cidade;
	protected Endereco endereco;
	
	Scanner ler = new Scanner(System.in);
	Endereco end = new Endereco();

	public Pessoa() {

	}


	public Pessoa(String cpf, String nome, Sexo sexo, Cidade cidade, Endereco endereco) {
		super();
		this.cpf = cpf;
		this.nome = nome;
		this.sexo = sexo;
		this.cidade = cidade;
		this.endereco = endereco;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		System.out.print("Informe o CPF: ");
		cpf = ler.nextLine();
		try {
			while (cpf.length() != 11) {
				System.out.println("\nCPF invalido!!! \n");	
				System.out.print("Informe o CPF: ");
				cpf = ler.nextLine();
			}
				this.cpf = cpf;
		}catch(InputMismatchException e) {
			System.out.println("Digite um cpf v·lido!");
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		System.out.print("Informe o nome: ");
		nome = ler.nextLine().toUpperCase();
		this.nome = nome;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		boolean saida = true;
		do {
			try {

				System.out.println("Qual È o sexo?");
				System.out.println("1 - Masculino");
				System.out.println("2 - Feminino");
				System.out.print("Digite 1 ou 2: ");
				byte opcSexo = ler.nextByte();

				switch (opcSexo) {
				case 1:
					sexo = Sexo.MASCULINO;
					saida = true;
					break;
				case 2:
					sexo = Sexo.FEMININO;
					saida = true;
					break;
				default:
					System.out.println("\n ...por favor, digite 1 ou 2! ...\n");
					saida = false;
					break;

				}
			}

			catch (InputMismatchException e) {
				System.out.println("Digite o sexo, por favor!\n");
			
				saida = false;
				ler.next();
			}

			finally {
				this.sexo = sexo;
			}
		} while (saida != true);
		
	}
	
	
	public Cidade getCidade() {
		return cidade;
	}


	public void setCidade(Cidade cidade) {
		boolean saida;
			do {	
				try {
					System.out.println("Qual √© sua cidade?\n Digite o n√∫mero(1,2,3...)");
					System.out.println("1 - Belo Horizonte \t 5 - Sabara ");
					System.out.println("2 - NovaLima       \t 6 - Caete ");
					System.out.println("3 - Contagem       \t 7 - Neves ");
					System.out.println("4 - Betim          \t 8 - SantaLuzia ");
					byte opcCidade = ler.nextByte();
						switch (opcCidade) {
					case 1:
						cidade = Cidade.BeloHorizonte;
						saida = true;
						break;
					case 2:
						cidade = Cidade.NovaLima;
						saida = true;
						break;
					case 3:
						cidade = Cidade.Contagem;
						saida = true;
						break;
					case 4:
						cidade = Cidade.Betim;
						saida = true;
						break;
					case 5:
						cidade = Cidade.Sabara;
						saida = true;
						break;
					case 6:
						cidade = Cidade.Caete;
						saida = true;
						break;
					case 7:
						cidade = Cidade.Neves;
						saida = true;
						break;
					case 8:
						cidade = Cidade.SantaLuzia;
						saida = true;
						break;
					default:
						System.out.println("\n ...por favor, digite um n√∫mero da lista! ...\n");
						saida = false;
						break;
						}
				}catch(InputMismatchException e) {
					System.out.println("Digite uma Cidade v·lida!");
					saida = false;
					ler.nextLine();
				}finally {
					this.cidade = cidade;
				}
			} while(saida != true);
		
	}


	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		System.out.print("Rua: ");
		String rua = ler.nextLine();
		rua = ler.nextLine();
		end.setRua(rua);

		System.out.print("Numero: ");
		int numero = ler.nextInt();
		end.setNumero(numero);

		System.out.print("Bairro: ");
		String bairro = ler.nextLine();
		bairro = ler.nextLine();
		end.setBairro(bairro);

		System.out.print("UF: ");
		String UF = ler.nextLine();
		end.setUF(UF);

		this.endereco = endereco;
	}

}