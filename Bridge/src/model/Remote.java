package model;

public class Remote {
	
	private Device device;
	
	public Remote(Device device) {
		this.device = device;
	}
	
	public void togglePower() {	
		if(device.isEnable())
			device.disable();
		else
			device.enable();
	}
	
	public void volumeDown() {
		device.setVolume(device.getVolume() - 1);
	}
	
	public void volumeUp() {
		device.setVolume(device.getVolume() + 1);
	}
	
	public void channelDown() {
		device.setChannel(device.getChannel() - 1);
	}
	
	public void channelUp() {
		device.setChannel(device.getChannel() + 1);
	}
	
	public Device getDevice() {
		return device;
	}
	
	public void setDevice(Device device) {
		this.device = device;
	}
}
