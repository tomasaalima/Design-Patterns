package telephone;

public class Main {
    public static void main(String[] args) {
        final int NUM_DIGITS = 12;

        // Build the object graph
        PhoneModel model = new PhoneModel();
        Screen screen = new Screen(model);
        KeyPad keyPad = new KeyPad(model);

        model.subscribe(new Screen.Observer(){

            public void print(String number){
                System.out.println("pressionando: " + number);
                System.out.println(number);
            }

            public void isInterested(int number){
                if(model.getDigits().size() <= 12)
                    this.print("" + number + "");
            }
        });

        
        model.subscribe(new Screen.Observer() {
            public void print(String number){
                System.out.println("Discando " + number + "...");
            }

            public void isInterested(int number){
                if(model.getDigits().size() == 12){
                    String value = "";
                    for(Integer num: model.getDigits()){
                        value += "" + num + "";
                    }
                        this.print(value);
                }

            }
        });

        // Run the program
        keyPad.simulateKeyPresses(NUM_DIGITS);
    }
}
