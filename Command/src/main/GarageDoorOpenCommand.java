package main;

public class GarageDoorOpenCommand implements Command{
    GarageDoor garageDoor;

    public GarageDoorOpenCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }
    
    public void enable(){
        garageDoor.up();
        garageDoor.stop();
    }
    
	@Override
	public void disable() {
		// TODO Auto-generated method stub
		garageDoor.down();
	}
}
   
