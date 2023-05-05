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
		AdvancedRemote radioControl = new AdvancedRemote(radio);
		radioControl.togglePower();
		
		boolean done = true;
		do{
			
			Scanner sc = new Scanner(System.in);
			
			System.out.printf("\n"
							+ "1 - Aumentar volume \n"
							+ "2 - Diminuir volume \n"
							+ "3 - Passar o Canal \n"
							+ "4 - Voltar o canal \n"
							+ "5 - Mutar \n"
							+ "6 - Desligar \n");
			
			switch (sc.nextInt()) {
				case 1: {
					radioControl.volumeUp();
					break;
				}
				case 2: {
					radioControl.volumeDown();
					break;
				}
				case 3: {
					radioControl.channelUp();
					break;
				}
				case 4: {
					radioControl.channelDown();
					break;
				}
				case 5: {
					radioControl.mute();
					break;
				}
				case 6: {
					radioControl.togglePower();
					done = false;
					break;
				}
				default:
					throw new IllegalArgumentException("Unexpected value: " + sc.nextInt());
				}		
		}while(done);
	}
}
