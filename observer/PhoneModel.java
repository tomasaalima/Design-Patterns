import java.util.ArrayList;
import java.util.List;

/**
 * Store a phone number, digit-by-digit
 */
public class PhoneModel {
    private List<Integer> digits = new ArrayList<>();
    private final List<Observer> observers = new ArrayList<>();

    interface Observer {
        void print();
    }

    public void addDigit(int newDigit) {
        digits.add(newDigit);
    }

    public List<Integer> getDigits() {
        return digits;
    }

    public void subscribe(Observer observer){
        observers.add(observer);
        observer.print();
    }

    public void unscribe(Observer observer){
        observers.forEach(elemento -> {
            if(elemento.equals(observer))
                observers.remove(observers.get(observers.indexOf(elemento)));
        });

        System.out.println("observador removido: " + observers);
    }
}
