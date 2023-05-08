package command;

public class TvOnCommand implements Command{
	TV tv;

	
	public TvOnCommand(TV tv) {
		this.tv = tv;
	}
	
	@Override
	public void enable() {
		// TODO Auto-generated method stub
		tv.on();
	}

	@Override
	public void disable() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return this.getClass().getSimpleName();
	}

	@Override
	public Parameter getParameter() {
		// TODO Auto-generated method stub
		return tv;
	}

}
