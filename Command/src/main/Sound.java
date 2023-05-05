package main;

public class Sound {
	public void on() {
		System.out.println("Som ligado!");
	}
	
	public void off() {
		System.out.println("Som desligado!");
	}
	
	public void setCd(String cd) {
		System.out.println("Carregando CD: " + cd);
	}
	
	public void setDvd(String dvd) {
		System.out.println("Carregando DVD: " + dvd);
	}
	
	public void setRadio(String frequency) {
		System.out.println("Sincronizando Rádio: " + frequency);
	}
	
	public void setVolume(int volume) {
		System.out.println("Volume sincronizado: " + volume);
	}
}
