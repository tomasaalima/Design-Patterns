public class Car implements Component {
    private Chassis chassis;
    private Bodywork bodywork;

    public Car() {
    	chassis = new Chassis();
    	bodywork = new Bodywork();
    }

    public double weightCalculator() {
        double total = chassis.weightCalculator() + bodywork.weightCalculator();
        System.out.println("Peso total do carro: " + total);
        return total;
    }
}