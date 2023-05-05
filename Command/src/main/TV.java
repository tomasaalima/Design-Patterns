package main;

public class TV {
	public void on() {
		System.out.println("Televião ligada!");
	}
	
	public void off() {
		System.out.println("Televião desligada!");
	}
	
	public void setInputChanel(int chanel) {
		System.out.println("Canal sincronizado: " + chanel);
	}
	
	public void setVolume(int volume) {
		System.out.println("Volume sincronizado: " + volume);
	}
}
