package ProjetoEscola; 

import java.util.Scanner;

public class Professor extends Pessoa implements Imposto {
	
	private int chProf;
	protected NomeCurso nomeCurso;
	private float salario;
	private double salarioIR;
	
	Scanner ler = new Scanner(System.in);
	Formacao forma = new Formacao();
	
	
	public Professor() {
		super();
	}
	
	
	public Professor(int chProf, NomeCurso nomecurso, float salario,  double salarioIR, Scanner ler, Formacao forma) {
		super();
		this.chProf = chProf;
		this.nomeCurso = nomecurso;
		this.salario = salario;
		this.salarioIR = salarioIR;
		this.ler = ler;
		this.forma = forma;
	}


	public int getChProf() {
		return chProf;
	}

	public void setChProf(int chProf) {
		System.out.println("Digite a carga horaria: ");
		chProf = ler.nextInt();
		this.chProf = chProf;
	}


	public NomeCurso getNomeCurso() {
		return nomeCurso;
	}


	public void setNomeCurso(NomeCurso nomeCurso) {
		boolean saida;
		do {	
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
				System.out.println("\n ...por favor, digite 1 ou 2! ...\n");
				saida = false;
				break;
			}
			} while(saida != true);
		this.nomeCurso = nomeCurso;
	}


	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		System.out.println("Digite o salario desejado: ");
		salario = ler.nextFloat();
		this.salario = salario;
	}

	public Formacao getFormacao() {
		return forma;
	}

	public void setFormacao(Formacao forma) {
		

		
		System.out.print("Digite a titulacao do professor(a): ");
		System.out.println("\n1 - Tecnologo");
		System.out.println("2 - Bacharelado");
		System.out.println("3 - Licenciatura");
		int forms = ler.nextByte();
		forma.setTitulo(String.valueOf(forms));
		forma.CalculoMensalidade(forms);

	
		

	}
	
	public void setSalarioIR(double salario) { //novo
        if (salario <= 1903.98) {
            salario -= faixa1;
        } 
        else if (salario > 1903.98 && salario <= 2826.65) 
        {
            salario -= faixa2;
        }
        else if (salario > 2826.66 && salario <= 3751.06) {
            salario -= faixa3;
        }
        else if (salario > 3751.06 && salario <= 4664.68) {
            salario -= faixa4;
        }
        else if (salario > 4664.68) {
            salario -= faixa5;
        }
        salarioIR = salario;
    }
	
	public double getSalarioIR() {
		return salarioIR;
	}


	public void cadastrarProfessor(Scanner ler) {

		System.out.println("\n-- Cadastramento --");
		
		setCpf(cpf);
		setNome(nome);
		setSexo(sexo);
		setCidade(cidade);
		setEndereco(end);
		setNomeCurso(nomeCurso);
		setSalario(salario);
		setSalarioIR(salario);
		setFormacao(forma);
	}

	public void dadosProfessor() {
		System.out.println("\n Pessoa Fisica\n" 
							+ "-----------------" 
							+ "\nCPF: " + getCpf() 
							+ "\nNome: "	+ getNome() 
							+ "\nSexo: " + getSexo()
							+ "\nCidade: " + getCidade()
							+ "\nRua: " + end.getRua() 
							+ "\nNumero: " + end.getNumero() 
							+ "\nBairro: " + end.getBairro() 
							+ "\nUF: " +end.getUF()
							+ "\nTitulo: " + forma.getTitulo()
							+ "\nNomeCurso: " + getNomeCurso()
							+ "\nCarga Horaria: " + forma.getCH()
							+ "\nSalario: " + getSalario()
							+ "\nSalario com desconto de IR: "+ getSalarioIR());

	}

	
	@Override
	public double IR(double salario) { 
		// TODO Auto-generated method stub
		return 0;
	}

}