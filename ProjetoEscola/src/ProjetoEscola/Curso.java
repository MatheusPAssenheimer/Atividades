package ProjetoEscola;

import java.util.Scanner;

public class Curso implements Mensalidade{

	private String tipo;
	private int ch;
	protected double mensalidade;
	
	public Curso() {
		
	}
	
	public Curso(String tipo, int ch, double mensalidade) {
		super();
		this.tipo = tipo;
		this.ch = ch;
		this.mensalidade = mensalidade;
	}


	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		if (tipo == "1") {
			tipo = "Tecnlogo";
		}else if (tipo == "2") {
			tipo = "Bacharelado";
		}else{
			tipo = "Licenciatura";
		}
		this.tipo = tipo;
	}

	public int getCh() {
		return ch;
	}

	public void setCh(int ch) {
		this.ch = ch;
	}

	public double getMensalidade() {
		return mensalidade;
	}

	public void setMensalidade(String escolaridade) {
		this.mensalidade = mensalidade;
	}

	@Override
	public double CalculoMensalidade (int Curso) { 
		
		switch(Curso) {
		case 1:
			mensalidade = tecnologo;
			ch = chTecnologo;
			break;
		case 2:
			mensalidade = bacharelado;
			ch = chBacharelado;
			break;
		case 3: 
			mensalidade = licenciatura;
			ch = chLicenciatura;
			break;
		}	
		
		return mensalidade;
	}
}