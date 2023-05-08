package command;

public class DefaultParameter implements Parameter{
	public String state;
	public int speed;
	public int channel;
	public int volume;
	public float frequency;
	public String cd;
	public String dvd;
	public float temperature;
	

	@Override
	public String getState() {
		// TODO Auto-generated method stub
		return state;
	}

	@Override
	public int getSpeed() {
		// TODO Auto-generated method stub
		return speed ;
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
		return frequency;
	}

	@Override
	public String getCd() {
		// TODO Auto-generated method stub
		return cd;
	}

	@Override
	public String getDvd() {
		// TODO Auto-generated method stub
		return dvd;
	}

	@Override
	public float getTemperature() {
		// TODO Auto-generated method stub
		return temperature;
	}

}
