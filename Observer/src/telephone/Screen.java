package telephone;
/**
 * Prints things out to the screen, when needed
 * Printing to the screen:
 *  System.out.println("hello");
 */
public class Screen {
    private final PhoneModel model;

    public Screen(PhoneModel model) {
        this.model = model;
    }
    
    interface Observer {
        void print(String number);
        void isInterested(int number);
    }
}