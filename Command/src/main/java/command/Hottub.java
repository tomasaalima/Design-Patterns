package command;

public class Hottub implements Parameter{
	public String state;
	public float temperature;
	
	public void circulate() {
		setState("Circulação ativada");
	}
	
	public Hottub(String state, float temperature) {
		this.state = state;
		this.temperature = temperature;
	}
	
	public Hottub() {
		this.state = "Jacuzzi desligada";
	}
	
	public String getState() {
		return state + ", Temperatura: " + temperature;
	}


	public void setState(String state) {
		this.state = state;
	}
	
	public void jetsOn() {
		setState("Jatos ligados");
		 System.out.println(state);
	}
	
	public void jetsOff() {
		setState("Jatos desligados");
		 System.out.println(state);
	}
	
	public void settemperature(float temp) {
		setState("Temperatura configurada em :" + temp + "°C");
		this.temperature = temp;
		 System.out.println(state);
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
	public String toString() {
		return "Hottub [state=" + state + ", temperature=" + temperature + "]";
	}

	@Override
	public float getTemperature() {
		// TODO Auto-generated method stub
		return temperature;
	}
}
