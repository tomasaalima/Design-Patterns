package command;

public class CeilingFanOnCommand implements Command{
	CeilingFan ceilingFan;

	public CeilingFanOnCommand(CeilingFan ceilingFan) {
		this.ceilingFan = ceilingFan;
	}

	@Override
	public void enable() {
		// TODO Auto-generated method stub
		ceilingFan.high();
		
	}

	@Override
	public void disable() {
		// TODO Auto-generated method stub
		ceilingFan.off();
		
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return this.getClass().getSimpleName();
	}

	@Override
	public Parameter getParameter() {
		// TODO Auto-generated method stub
		return ceilingFan;
	}

	@Override
	public String toString() {
		return "CeilingFanOnCommand [ceilingFan=" + ceilingFan + "]";
	}

}
