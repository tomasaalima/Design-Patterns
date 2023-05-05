package bakery;
public class ChocolateCake extends Cake {
	private String description = "Chocolate cake  ";
	private int cost = super.getCost();
	
	public ChocolateCake(Cake cake) {
		this.description += cake.getDescription();
		this.cost += cake.getCost();
	}
	
	public ChocolateCake() {}
	
	public int getCost() {
		return this.cost;
	}
	
    @Override
    public String getDescription() {
        return this.description;
    }
}
