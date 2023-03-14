package bakery;
public class VanillaCake extends Cake {
	private String description = "Vanilla cake ";
	private int cost;
	
	public VanillaCake(Cake cake) {
		this.description += cake.getDescription();
		this.cost += cake.getCost();
	}
	
	public VanillaCake() {}
	
	@Override
	public int getCost() {
		// TODO Auto-generated method stub
		return super.getCost() + this.cost;
	}
	
    @Override
    public String getDescription() {
        return this.description;
    }
}

