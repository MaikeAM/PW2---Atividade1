public class ExercicioDois {
	public static void main(String[] args) {
		System.out.println(possoIrBanco("Terça-feira",18 ));
	}

	public static boolean possoIrBanco(String dia, int hora) {
		boolean Convert;
		new ExercicioUm();
		Convert = ExercicioUm.ehDiaSemana(dia);

		if (Convert == true && hora >=10 && hora <= 18) {
			return true;
		}

		else {
			return false;

		}
	}
}
