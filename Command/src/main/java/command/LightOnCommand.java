package command;

public class LightOnCommand implements Command{
	Light light;
	
	public LightOnCommand(Light light) {
		this.light = light;
	}

	@Override
	public void enable() {
		// TODO Auto-generated method stub
		light.on();
	}
	
	public Parameter getParameter() {
    	return light;
    }


	@Override
	public void disable() {
		// TODO Auto-generated method stub
		light.off();
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return this.getClass().getSimpleName();
	}

	@Override
	public String toString() {
		return "LightOnCommand [light=" + light + "]";
	}

}
