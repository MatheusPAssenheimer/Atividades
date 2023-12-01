package ProjetoEscola; 
import java.util.Scanner;
import java.util.InputMismatchException;


public class Aluno extends Pessoa {
	private byte ra;
	protected NomeCurso nomeCurso;
	private Curso curso;
	
	
	Scanner ler = new Scanner(System.in);
	Curso curs =  new Curso();
	
	public Aluno() {
		super();
	}

	

	public Aluno(String cpf, String nome, Sexo sexo, Cidade cidade, Endereco endereco, byte ra, NomeCurso nomecurso, Curso curso) {
		super(cpf, nome, sexo, cidade, endereco);
		this.ra = ra;
		this.nomeCurso = nomecurso;
		this.curso = curso;
		this.endereco = endereco;
	}



	public byte getRa() {
		return ra;
	}

	public void setRa(byte ra) {
		System.out.print("Digite o Registro Academico do aluno(a): ");
		ra = ler.nextByte();
		this.ra = ra;
	}
	
	

	public NomeCurso getNomeCurso() {
		return nomeCurso;
	}



	public void setNomeCurso(NomeCurso nomeCurso) {
		boolean saida = true;
	
			do {	
				try {
					System.out.println("Qual e o curso?\n(1,2 ou 3)");
					System.out.println("1- ADS" +"\n2- Ciencia da Computacao" + "\n3- Sistema da Informacao");
					byte opcNomeCurso = ler.nextByte();
					switch (opcNomeCurso) {
					case 1:
						nomeCurso = NomeCurso.ADS;
						saida = true;
						break;
					case 2:
						nomeCurso = NomeCurso.Computacao;
						saida = true;
						break;
					case 3:
						nomeCurso = NomeCurso.Sis_Info;
						saida = true;
						break;
					default:
						System.out.println("\n ...por favor, digite 1, 2 ou 3! ...\n");
						saida = false;
						break;
					}
				}catch (InputMismatchException e){
					System.out.println("Digite o curso, por favor.");
					saida = false;
					ler.nextLine();
				}finally {
					this.nomeCurso = nomeCurso;
				}
		} while(saida != true);
	}



	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curs) {			
		System.out.println("Digite a escolaridade do aluno: ");
		System.out.println("1 - Tecnologo");
		System.out.println("2 - Bacharelado");
		System.out.println("3 - Licenciatura");
		int curos = ler.nextByte();
		curs.setTipo(String.valueOf(curos));
		curs.CalculoMensalidade(curos);
		
		this.curs = curs;
	}
	
	


	public void cadastrarAluno(Scanner ler) {

		System.out.println("\n-- Cadastramento --");
		
		setCpf(cpf);
		setNome(nome);
		setSexo(sexo);
		setCidade(cidade);
		setEndereco(end);
		setNomeCurso(nomeCurso);
		setRa(ra);
		setCurso(curs);
		
	}
	
	
	

	public void dadosAluno() {
		System.out.println("\n Pessoa Fisica\n" 
							+ "-----------------" 
							+ "\nCPF: " + getCpf() 
							+ "\nNome: "	+ getNome() 
							+ "\nSexo: " + getSexo()
							+ "\nCidade: " + getCidade()
							+ "\nRua: " + end.getRua() 
							+ "\nNumero: " + end.getNumero() 
							+ "\nBairro: " + end.getBairro() 
							+ "\nUF: " + end.getUF()
							+ "\nNomeCurso: "	+ getNomeCurso() 
							+ "\nRA: " + getRa()
							+ "\nTipo do curso: " + curs.getTipo()
							+ "\nCarga horaria: " + curs.getCh()
							+ "\nMensalidade: " + curs.getMensalidade());

	}

}