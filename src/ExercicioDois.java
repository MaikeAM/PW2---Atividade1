public class ExercicioDois {
	
	public static void main(String[] args) {
		String dia = "Segunda-Feira";
		int hora = 15;

		if (possoIrBanco(dia,hora)) {
			System.out.println("Voc� poder� ir ao banco �s " + hora + "H de " + dia);
		}
		else
		{
			System.out.println("Voc� n�o poder� ir ao banco �s " + hora + "H de " + dia);
		}
	}

	public static boolean possoIrBanco(String dia, int hora) {
		if (ExercicioUm.ehDiaSemana(dia)  && hora >= 10 && hora <= 16) {
			return true;
		}

		else {
			return false;

		}
	}
}
