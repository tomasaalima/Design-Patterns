package main;

public class CeilingFan {
	private int speed;
	
	public void high() {
		System.out.println("Ventilador no Alto!");
		this.speed = 80;
	}
	
	public void medium() {
		System.out.println("Ventilador no médio!");
		this.speed = 50;
	}
	
	public void low() {
		System.out.println("Ventilador no baixo!");
		this.speed = 20;
	}
	
	public void off() {
		System.out.println("Ventilador desligado!");
		this.speed = 0;
	}
	
	public void getSpeed() {
		System.out.println(speed + "rotações por minuto");
	}
}
