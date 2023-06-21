package main;

public abstract class CaffeineBeverage {
	public void prepareRecipe() {
		boilWater();
		brew();
		pourInCup();
		addCondiments();
	}
	
	public void boilWater() {
		System.out.println("Fervendo água");
	}
	
	public abstract void brew();
	
	public void pourInCup() {
		System.out.println("Servindo café");
	}
	
	public abstract void addCondiments();
}0
