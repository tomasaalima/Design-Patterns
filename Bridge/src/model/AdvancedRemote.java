package model;

public class AdvancedRemote extends Remote{
	
	public AdvancedRemote(Device device) {
		super(device);
		// TODO Auto-generated constructor stub
	}

	public void mute() {
		getDevice().setVolume(0);
	}
}
