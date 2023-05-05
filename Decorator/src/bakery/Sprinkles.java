package bakery;

public class Sprinkles extends Cake {
	private String description = "with sprinkles ";
	private int cost = 2;
	
	public Sprinkles(Cake cake) {
		this.description += cake.getDescription();
		this.cost += cake.getCost();
	}
	
	public Sprinkles() {}
	
	
	public int getCost() {
		return this.cost;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return this.description;
	}

}
