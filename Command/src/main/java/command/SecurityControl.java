package command;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;

public class SecurityControl {
	private List<Command> command = new ArrayList<Command>();
	
	public SecurityControl(Command command) {
		this.command.add(command);
	}
	
	public SecurityControl() {
		
	}
	
	public void addCommand(Command command) {
		this.command.add(command);
	}
	
	public void store() {
		try {
			File file = new File("config.json");
			FileWriter writer = new FileWriter(file);
			for (int i = 0; i < getCommand().size(); i++) {
				writer.write("{\"type\":\"" + this.command.get(i).getType() +"\", \"parameter\"" + ":" + new Gson().toJson(this.command.get(i).getParameter()) + "}\n");	
			}
		    writer.close();
		} catch (IOException e) {
		    e.printStackTrace();
		}
	}
	
	public void load() {
		try {
			File file = new File("config.json");
			FileReader reader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(reader);
			
			SecurityControl controlConfigs = new SecurityControl();
			
			String line;
			while ((line = bufferedReader.readLine()) != null ) {
				Json json = new Gson().fromJson(line, Json.class);
				controlConfigs.addCommand(json.commandTransform());
			}
			
			setCommand(controlConfigs.getCommand());
			
			for (int i = 0; i < getCommand().size(); i++) {
				System.out.println(command.get(i).getParameter().getState());
			}

			
			//SecurityControl control = new Gson().fromJson(reader, SecurityControl.class);

			bufferedReader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public List<Command> getCommand() {
		return command;
	}

	public void setCommand(List<Command> command) {
		this.command = command;
	}

	@Override
	public String toString() {
		return "SecurityControl [command=" + command + "]";
	}
	
}
