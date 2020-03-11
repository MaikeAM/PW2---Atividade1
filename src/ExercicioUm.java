
public class ExercicioUm {
	public static void main(String[] args) {
		System.out.println(ehDiaSemana("Domingo"));
	}

	public static boolean ehDiaSemana(String dia) {
		if (dia == "Segunda-Feira" || dia == "Terça-Feira" || dia == "Quarta-Feira" || dia == "Quinta-Feira"
				|| dia == "Sexta-Feira") {

			return true;
		} else {
			return false;
		}
	}
}
