import java.util.ArrayList;
import java.util.List;

public class Bodywork implements Component {
	private List<Component> partsList;
	
	public Bodywork() {
		partsList = new ArrayList<>();
		partsList.add(new Part("para-lamas", 50));
		partsList.add(new Part("portas", 80));
		partsList.add(new Part("painéis", 100));
		partsList.add(new Part("porta-malas", 120));
		partsList.add(new Part("capô", 70));
	}
	
	public double weightCalculator() {
        double total = 0;
        for (Component part : partsList) {
            total += part.weightCalculator();
        }
        return total;
    }
}