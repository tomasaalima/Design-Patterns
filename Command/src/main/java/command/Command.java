package command;

public interface Command {
	public void enable();
	public void disable();
	public String getType();
	public Parameter getParameter();
}
