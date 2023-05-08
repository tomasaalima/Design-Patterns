package command;

public class GarageDoor implements Parameter{
	public String state;
	
	public GarageDoor(String state) {
		this.state = state;
	}
	
	public GarageDoor() {
		this.state = "Porta da garagem baixada";
	}
	
	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public void up(){
		setState("Porta da garagem erguida");
        System.out.println(state);
    }
    public void down(){
    	setState("Porta da garagem baixada");
        System.out.println(state);
    }
    public void stop(){
    	setState("Porta da garagem parou");
        System.out.println(state);
    }

	@Override
	public String toString() {
		return "GarageDoor [state=" + state + "]";
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
