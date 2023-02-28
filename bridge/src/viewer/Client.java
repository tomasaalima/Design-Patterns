package viewer;

import java.util.Scanner;

import model.AdvancedRemote;
import model.Device;
import model.Radio;
import model.Remote;
import model.TV;

public class Client {
	public static void main(String[] args) {
		Device tv = new TV();
		Remote tvControl = new Remote(tv);
		tvControl.togglePower();
		
		Device radio = new Radio();
		Remote radioControl = new AdvancedRemote(radio);
		radioControl.togglePower();
		
		boolean done = true;
		do{
			
			Scanner sc = new Scanner(System.in);
			
			System.out.printf("\n"
							+ "1 - Aumentar volume \n"
							+ "2 - Diminuir volume \n"
							+ "3 - Passar o Canal \n"
							+ "4 - Voltar o canal \n"
							+ "5 - Desligar \n");
			
			switch (sc.nextInt()) {
				case 1: {
					tvControl.volumeUp();
					break;
				}
				case 2: {
					tvControl.volumeDown();
					break;
				}
				case 3: {
					tvControl.channelUp();
					break;
				}
				case 4: {
					tvControl.channelDown();
					break;
				}
				case 5: {
					tvControl.togglePower();
					done = false;
					break;
				}
				default:
					throw new IllegalArgumentException("Unexpected value: " + sc.nextInt());
				}		
		}while(done);
	}
}
