package bakery;

public class StrawberryCake extends Cake {
	private String description = "Strawberry Cake ";
	private int cost;

	public StrawberryCake(Cake cake) {
		this.description += cake.getDescription();
		this.cost += super.getCost() * 2;
		this.cost += cake.getCost();	
	}
	
	public StrawberryCake() {}
	
	public int getCost() {
		return this.cost;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return this.description;
	}

}
