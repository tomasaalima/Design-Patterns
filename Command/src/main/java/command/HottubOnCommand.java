package command;

public class HottubOnCommand implements Command{
	Hottub hottub;
	
	public HottubOnCommand(Hottub hottub) {
		this.hottub = hottub;
	}

	@Override
	public void enable() {
		// TODO Auto-generated method stub
		hottub.jetsOn();
	}
	
	public Parameter getParameter() {
    	return hottub;
    }


	@Override
	public void disable() {
		// TODO Auto-generated method stub
		hottub.jetsOff();
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return this.getClass().getSimpleName();
	}

	@Override
	public String toString() {
		return "HottubOnCommand [hottub=" + hottub + "]";
	}
}
