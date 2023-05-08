package command;

public class Light implements Parameter{
	public String state;

	public Light(String state) {
		this.state = state;
	}
	
	public Light() {
		this.state = "Luz apagada";
	}
	
	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public void on() {
		setState("Luz acessa");
        System.out.println(state);
	}

	public void off() {
		setState("Luz apagada");
        System.out.println(state);
	}

	@Override
	public String toString() {
		return "Light [state=" + state + "]";
	}

	@Override
	public int getSpeed() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getChannel() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getVolume() {
		// TODO Auto-generated method stub
		return 0;
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
