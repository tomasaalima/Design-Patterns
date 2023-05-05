package bakery;
/**
 * Create an order and print it
 */
public class Main {
    public static void main(String[] args) {
        // Create the order
        Order order = new Order();
        order.addCake(new ChocolateCake());
        order.addCake(new VanillaCake(new Saying("PLAIN!")));
        order.addCake(new VanillaCake(new Sprinkles(new Saying("FANCY!"))));
        order.addCake(new MultiLayered(new StrawberryCake(new Sprinkles(new Sprinkles(new Saying(new Saying("EVERYTHING"), "One of"))))));

        // Print the order
        order.printOrder();
    }
}
