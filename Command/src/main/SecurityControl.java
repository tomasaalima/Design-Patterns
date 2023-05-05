package main;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONObject;

public class SecurityControl {
	List<Command> command = new ArrayList<>();
	
	public SecurityControl(Command command) {
		this.command.add(command);
	}
	
	public void store() {
		try {
			JSONObject object;
			

		} catch (IOException e) {
			// TODO: handle exception
		}
	}
	
	public void load() {
		
	}
}
