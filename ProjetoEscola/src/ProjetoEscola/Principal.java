package ProjetoEscola;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);

		Aluno a = new Aluno();
		Professor p = new Professor();

		byte opc;
		do { 
			System.out.println("\n..: Menu Principal :..");
			System.out.println("----------------------");
			System.out.println("1 - Menu do Aluno");
			System.out.println("2 - Menu do Professor");
			System.out.println("3 - Sair do sistema ");
			System.out.print("Digite uma opcao: ");
			opc = ler.nextByte();
			
			switch(opc) { //switch para decisão do usuário
			case 1: //caso 1 - aluno
					System.out.println("\n..: Menu do Aluno :..");
					System.out.println("----------------------");
					System.out.println("1 - Cadastrar aluno");
					System.out.println("2 - Mostrar os dados do aluno");
					System.out.println("3 - Sair do sistema ");
					System.out.print("Digite uma opcao: ");
					opc = ler.nextByte();
					switch (opc) { //switch para decisão dos métodos do aluno
					case 1:
						a.cadastrarAluno(ler);
						break;
					case 2:
						System.out.println("\n Mostrando os dados digitados:");
						a.dadosAluno();
						break;
					case 3:
						System.out.println("Saindo do sistema......");
						break;
					default:
						System.out.println("Opcao Invalida!");
					}
					break;
			case 2: //caso 2 - professor
					System.out.println("\n..: Menu do Professor :..");
					System.out.println("----------------------");
					System.out.println("1 - Cadastrar professor");
					System.out.println("2 - Mostrar os dados do professor");
					System.out.println("3 - Sair do sistema ");
					System.out.print("Digite uma opcao: ");
					opc = ler.nextByte();
					switch (opc) { //switch para decisão dos métodos do professor
					case 1:
						p.cadastrarProfessor(ler);
						break;
					case 2:
						System.out.println("\n Mostrando os dados digitados:");
						p.dadosProfessor();
						break;
					case 3:
						System.out.println("Saindo do sistema......");
						break;
					default:
						System.out.println("Opcao Invalida!");
					}
					break;
			case 3: 
				System.out.println("Saindo do sistema...");
				break;
			}
		} while (opc != 3);

		ler.close();
	}
			
			
}