package Entities;

public class Relogio {
	private int hours, minutes;

	public Relogio(int hours, int minutes) {
		this.hours = hours;
		this.minutes = minutes;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public int getMinutes() {
		return minutes;
	}

	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}
	
	public void incrementMinute(int hours, int minutes) {
		if (getMinutes() > 59) {
			int hour = getHours();
			hour++;
			setHours(hour);
			setMinutes(0);
		}
	}
	
	public String mostraHora() {
		if(getMinutes() < 10) {
			return "A hora atual é : " + getHours() + ":" + "0" + getMinutes();
		}
		else {
			return "A hora atual é : " + getHours() + ":" + getMinutes();
		}
	}
	
	
}
