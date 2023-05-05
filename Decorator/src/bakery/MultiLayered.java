package bakery;

public class MultiLayered extends Cake {
	private String description = "Multi-Layered ";
	private int cost = 5;

	public MultiLayered(Cake cake) {
		this.description += cake.getDescription();
		this.cost += cake.getCost();
	}
	
	public int getCost() {
		return this.cost;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return this.description;
	}

}
