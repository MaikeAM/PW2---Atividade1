public class ExercicioDois {
	public static void main(String[] args) {
		System.out.println(possoIrBanco("Ter�a-feira", 15));
	}

	public static boolean possoIrBanco(String dia, int hora) {
		new ExercicioUm();
		if (ExercicioUm.ehDiaSemana(dia)  && hora >= 10 && hora <= 16) {
			return true;
		}

		else {
			return false;

		}
	}
}
