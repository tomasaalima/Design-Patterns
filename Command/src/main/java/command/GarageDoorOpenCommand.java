package command;

public class GarageDoorOpenCommand implements Command{
    GarageDoor garageDoor;

    public GarageDoorOpenCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }
    
    public String getType() {
		return this.getClass().getSimpleName();
	}
    
    public Parameter getParameter() {
    	return garageDoor;
    }

	public void enable(){
        garageDoor.up();
        garageDoor.stop();
    }

	public void disable() {
		// TODO Auto-generated method stub
		garageDoor.down();
	}

	@Override
	public String toString() {
		return "GarageDoorOpenCommand [garageDoor=" + garageDoor + "]";
	}
}
   
