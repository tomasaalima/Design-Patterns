package command;

public class Main {

	public static void main(String[] args) {
		Light light = new Light();
		LightOnCommand lightCommand = new LightOnCommand(light);
		
		GarageDoor garage = new GarageDoor();
		GarageDoorOpenCommand garageCommand = new GarageDoorOpenCommand(garage);
		
		TV tv = new TV();
		TvOnCommand tvCommand = new TvOnCommand(tv);
		
		CeilingFan ceilingFan = new CeilingFan();
		CeilingFanOnCommand ceilingFanCommand = new CeilingFanOnCommand(ceilingFan);
		
		Sound sound = new Sound();
		SoundOnCommand soundCommand = new SoundOnCommand(sound);
		
		
		Hottub hottub = new Hottub();
		HottubOnCommand hottubOnCommand = new HottubOnCommand(hottub);
		
		SecurityControl control = new SecurityControl(garageCommand);
		control.addCommand(lightCommand);
		control.addCommand(ceilingFanCommand);
		control.addCommand(tvCommand);
		control.addCommand(soundCommand);
		control.addCommand(hottubOnCommand);
		
		
		control.load();
		
		/*SecurityControl control = new SecurityControl();
		control.load();
		control.toString();*/
	}

}
