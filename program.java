package Program;

import java.util.Locale;
import java.util.Scanner;

import Entities.Relogio;

public class program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.printf("Set the time\nHours: ");
		int hours = sc.nextInt();
		System.out.println("Minutes: ");
		int minutes = sc.nextInt();

		Relogio hora = new Relogio(hours, minutes);

		while (true) {
			minutes = hora.getMinutes() + 1;
			hora.setMinutes(minutes);
			hora.incrementMinute(hours, minutes);
			System.out.println(hora.mostraHora());
			try {
				long milissegundos = 59000;
				Thread.sleep(milissegundos);
			} catch (InterruptedException e) {
			}

		}
	}
}
