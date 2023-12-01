package ProjetoEscola;

import java.util.Scanner;

public class Formacao implements Mensalidade {
	
	private String Titulo;
	private int CH;
	
	
	public Formacao () {
		
	}


	public Formacao(String titulo, int cH) {
		super();
		Titulo = titulo;
		CH = cH;
	}


	public String getTitulo() {
		return Titulo;
	}


	public void setTitulo(String titulo) {
		if (titulo == "1") {
			titulo = "Tecnlogo";
		}else if (titulo == "2") {
			titulo = "Bacharelado";
		}else{
			titulo = "Licenciatura";
		}
		Titulo = titulo;
	}




	public int getCH() {
		return CH;
	}


	public void setCH(int cH) {
		CH = cH;
	}
	
	@Override
	public double CalculoMensalidade (int Curso) { 

		switch(Curso) {
		case 1:
			CH = chTecnologo;
			break;
		case 2:
			CH = chBacharelado;
			break;
		case 3: 
			CH = chLicenciatura;
			break;
		}	
		
		return CH;
	}

}
