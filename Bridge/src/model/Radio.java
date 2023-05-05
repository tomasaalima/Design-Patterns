package model;

public class Radio implements Device{
	private boolean powerOn;
	private int volume;
	private int channel;
	
	public Radio() {
	this.setVolume(50);
	this.setChannel(1);
	}
	
	@Override
	public boolean isEnable() {
		// TODO Auto-generated method stub
		return powerOn;
	}


	@Override
	public void enable() {
		// TODO Auto-generated method stub
		System.out.println("ligando...");
		setPowerOn(true);
	}

	@Override
	public void disable() {
		// TODO Auto-generated method stub
		System.out.println("desligando...");
		setPowerOn(false);
	}

	@Override
	public int getVolume() {
		// TODO Auto-generated method stub
		return volume;
	}

	@Override
	public void setVolume(int percent) {
		// TODO Auto-generated method stub
		this.volume = percent;
		System.out.println("Volume:" + this.volume);	}

	@Override
	public int getChannel() {
		// TODO Auto-generated method stub
		return channel;
	}

	@Override
	public void setChannel(int channel) {
		// TODO Auto-generated method stub
		this.channel = channel;
		System.out.println("Canal:" + this.channel);
	}
	
	public void setPowerOn(boolean powerOn) {
		this.powerOn = powerOn;
	}
}
