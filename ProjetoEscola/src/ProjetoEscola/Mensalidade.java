package ProjetoEscola;

public interface Mensalidade {
			
			// Valores ficticios
			final double tecnologo = 600.90; // mensalidade do Ensino Médio  
			final double bacharelado = 750.50; // mensalidade do Ensino Fundamental
			final double licenciatura = 850.80; // mensalidade do Curso integral (EM + Técnico)
			
			final int chTecnologo = 2000;
			final int chBacharelado = 3000;
			final int chLicenciatura = 3400;
				
			public abstract double CalculoMensalidade (int Curso);
		}