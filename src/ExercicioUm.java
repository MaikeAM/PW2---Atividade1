
public class ExercicioUm {
	/*public static void main(String[] args) {
		System.out.println(ehDiaSemana("Domingo"));
	}*/
	public static boolean ehDiaSemana(String dia) {
		if (dia.equalsIgnoreCase("Segunda-Feira") || dia.equalsIgnoreCase("Terça-Feira") || 
				dia.equalsIgnoreCase("Quarta-Feira") || dia.equalsIgnoreCase("Quinta-Feira")
				|| dia.equalsIgnoreCase("Sexta-Feira")) {

			return true;
		} else {
			return false;
		}
	}
}
