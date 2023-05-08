package command;

public class TV implements Parameter{
	public String state;
	public int channel;
	public int volume;
	
	
	public TV(String state, int channel, int volume) {
		this.state = state;
		this.channel = channel;
		this.volume = volume;		
	}
	
	public TV() {
		this.state = "Televisão desligada";
	}
	
	public String getState() {
		return state + ", Canal: " + channel + ", Volume: " + volume;
	}

	public void setState(String state) {
		this.state = state;
	}

	
	public void on() {
		setState("Televisão ligada!");
		System.out.println(state);
	}
	
	public void off() {
		setState("Televisão desligada!");
		System.out.println(state);
	}
	
	public void setInputChanel(int channel) {
		setState("Canal sincronizado: " + channel);
		this.channel = channel;
		System.out.println(state);
	}
	
	public void setVolume(int volume) {
		setState("Volume sincronizado: " + volume);
		this.volume = volume;
		System.out.println(state);
	}

	@Override
	public String toString() {
		return "TV [state=" + state + "]";
	}

	@Override
	public int getSpeed() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getChannel() {
		// TODO Auto-generated method stub
		return channel;
	}

	@Override
	public int getVolume() {
		// TODO Auto-generated method stub
		return volume;
	}

	@Override
	public float getFrequency() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getCd() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getDvd() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public float getTemperature() {
		// TODO Auto-generated method stub
		return 0;
	}
}
