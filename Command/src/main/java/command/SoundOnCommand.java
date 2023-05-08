package command;

public class SoundOnCommand implements Command{
	Sound sound;
	
	public SoundOnCommand(Sound sound) {
		this.sound = sound;
	}

	@Override
	public void enable() {
		// TODO Auto-generated method stub
		sound.on();
	}
	
	public Parameter getParameter() {
    	return sound;
    }


	@Override
	public void disable() {
		// TODO Auto-generated method stub
		sound.off();
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return this.getClass().getSimpleName();
	}

	@Override
	public String toString() {
		return "soundOnCommand [sound=" + sound + "]";
	}
}
