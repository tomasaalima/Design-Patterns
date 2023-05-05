package telephone;
import java.util.ArrayList;
import java.util.List;

import telephone.Screen.Observer;

/**
 * Store a phone number, digit-by-digit
 */
public class PhoneModel {
    private List<Integer> digits = new ArrayList<>();
    private final List<Observer> observers = new ArrayList<>();

    public void addDigit(int newDigit) {
        digits.add(newDigit);
        notifyAll(newDigit);
    }

    public List<Integer> getDigits() {
        return this.digits;
    }

    public void subscribe(Observer observer){
        observers.add(observer);
    }

    public void unscribe(Observer observer){
        observers.forEach(elemento -> {
            if(elemento.equals(observer))
                observers.remove(observers.get(observers.indexOf(elemento)));
                System.out.println("observador removido: " + elemento.hashCode());
        });

    }

    public List<Observer> getObservers(){
        return this.observers;
    }

    public void notifyAll(int number){
        observers.forEach(element -> element.isInterested(number));
    }
}
