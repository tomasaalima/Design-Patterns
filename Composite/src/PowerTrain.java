import java.util.ArrayList;
import java.util.List;

public class PowerTrain implements Component {
    private List<Component> partsList;

    public PowerTrain() {
    	partsList = new ArrayList<>();
    	partsList.add(new Part("motor", 150));
    	partsList.add(new Part("transmissão", 100));
    	partsList.add(new Part("diferencial", 60));
    	partsList.add(new Part("rodas", 120));
    }

    public double weightCalculator() {
        double total = 0;
        for (Component part : partsList) {
            total += part.weightCalculator();
        }
        return total;
    }
}