
public class ExercicioUm {

	public static void main(String[] args) {

		if (ehDiaSemana("Sabado")) {
			System.out.println("Dia da Semana");
		}
		else
		{
			System.out.println("Final de Semana");
		}
	}

	public static boolean ehDiaSemana(String dia) {
		if (dia.equalsIgnoreCase("Segunda-Feira") || dia.equalsIgnoreCase("Terça-Feira")
				|| dia.equalsIgnoreCase("Quarta-Feira") || dia.equalsIgnoreCase("Quinta-Feira")
				|| dia.equalsIgnoreCase("Sexta-Feira")) {

			return true;
		} else {
			return false;
		}
	}
}