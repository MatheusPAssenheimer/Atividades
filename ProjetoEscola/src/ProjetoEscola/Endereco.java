package ProjetoEscola; 

public class Endereco {
	private String rua;
	private int numero;
	private String bairro;
	private String UF;
	
	
	public Endereco() {
	
	}

	public Endereco(String rua, int numero, String bairro, String UF) {
		super();
		this.rua = rua;
		this.numero = numero;
		this.bairro = bairro;
		this.UF = UF;
	}


	public String getRua() {
		return rua;
	}


	public void setRua(String rua) {
		this.rua = rua.toUpperCase();
	}


	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}


	public String getBairro() {
		return bairro;
	}


	public void setBairro(String bairro) {
		this.bairro = bairro.toUpperCase();
	}

	public String getUF() {
		return UF;
	}


	public void setUF(String UF) {
		this.UF = UF.toUpperCase();
	}
	
	
	
	

	

}
