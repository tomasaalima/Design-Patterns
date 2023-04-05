import java.util.ArrayList;
import java.util.List;

public class Chassis implements Component {
    private List<Component> partsList;

    public Chassis() {
    	partsList = new ArrayList<>();
    	partsList.add(new PowerTrain());
    	partsList.add(new Part("suspensão", 100));
    }

    public double weightCalculator() {
        double total = 0;
        for (Component part : partsList) {
            total += part.weightCalculator();
        }
        return total;
    }
}