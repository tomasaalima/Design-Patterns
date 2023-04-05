import java.util.ArrayList;
import java.util.List;

public class Car implements Component{
	private List<Component> partsList;

    public Car() {
    	partsList = new ArrayList<>();
    	partsList.add(new Chassis());
    	partsList.add(new Bodywork());
    }

    public double weightCalculator() {
    	double total = 0;
        for (Component part : partsList) {
            total += part.weightCalculator();
        }
        System.out.println("Peso total do carro: " + total);
        return total;
    }
}