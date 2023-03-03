
public class Main {
    public static void main(String[] args) {
        final int NUM_DIGITS = 12;

        // Build the object graph
        PhoneModel model = new PhoneModel();
        Screen screen = new Screen(model);
        KeyPad keyPad = new KeyPad(model);

        model.subscribe(new PhoneModel.Observer(){

            public void print(String number){
                System.out.println("pressionando: " + number);
            }

            public void isInterested(int number){
                if(model.getDigits().size() < 9)
                    this.print("" + number + "");
            }
        });

        
        model.subscribe(new PhoneModel.Observer() {
            public void print(String number){
                System.out.println("Discando " + number + "...");
            }

            public void isInterested(int number){
                if(model.getDigits().size() == 9){
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
