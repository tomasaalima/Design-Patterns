package bakery;

public class Saying extends Cake{
	private String saying;
	private String description = "with saying ";
	private int cost;
	private String layer = "";
	
	public Saying(Cake cake, String saying) {
		this.saying = saying;
		this.cost += cake.getCost();
		this.layer = cake.getDescription();
	}
	
	public Saying(String saying) {
		this.saying = saying;
	}
	
	public Saying() {}

  public int getCost(){
    return this.cost;
  }

  @Override
  public String getDescription() {
    // TODO Auto-generated method stub
    return this.description + '"' + this.saying + '"' + " " + this.layer;
  }
  
}
