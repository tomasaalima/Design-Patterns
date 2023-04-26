package singleton.file.configure;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class GameConfig {
	private  static  GameConfig uniqueInstance;

	private String appID;
	private String buildID;
	private String offline;
	private String autoDLC;
	private String updateDB;
	private String waitForExit;
	private String noOperation;
	private String DLCName;
	private String userName;
	private String language;
	private String signature;
	private String windowInfo;
	private String LVWindowInfo;
	private String applicationPath;
	private String workingDirectory;
	


	private GameConfig() {
		try {
            FileReader fileReader = new FileReader("/home/tomas/eclipse-workspace/DesignPatterns/Singleton/src/configFile.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line; 
            String[] result;
            while ((line = bufferedReader.readLine()) != null) {
                result = line.split("=");
                switch (result[0]) {
				case "AppId": {
					this.appID = result[1];
					break;
				}
				case "UserName": {
					this.userName = result[1];
					break;
				}
				case "Language": {
					this.language = result[1];
					break;
				}
				case "Offline": {
					this.offline = result[1];
					break;
				}
				case "AutoDLC": {
					this.autoDLC = result[1];
					break;
				}
				case "BuildId": {
					this.buildID = result[1];
					break;
				}
				case "DLCName": {
					this.DLCName = result[1];
					break;
				}
				case "UpdateDB": {
					this.updateDB = result[1];
					break;
				}
				case "Signature": {
					this.signature = result[1];
					break;
				}
				case "WindowInfo": {
					this.windowInfo = result[1];
					break;
				}
				case "LVWindowInfo": {
					this.LVWindowInfo = result[1];
					break;
				}
				case "ApplicationPath": {
					this.applicationPath = result[1];
					break;
				}
				case "WorkingDirectory": {
					this.workingDirectory = result[1];
					break;
				}
				case "WaitForExit": {
					this.waitForExit = result[1];
					break;
				}
				case "NoOperation": {
					this.noOperation = result[1];
					break;
				}
				default:
					throw new IllegalArgumentException("Unexpected value: " + result[1]);
				}
            }

            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("Erro ao ler arquivo: " + e.getMessage());
        }
	}
	

	public static GameConfig getInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new GameConfig();
		}
		return uniqueInstance;
	}
	
	@Override
	public String toString() {
		return "GameConfig [appID=" + appID + ", buildID=" + buildID + ", offline=" + offline + ", autoDLC=" + autoDLC
				+ ", updateDB=" + updateDB + ", waitForExit=" + waitForExit + ", noOperation=" + noOperation
				+ ", DLCName=" + DLCName + ", userName=" + userName + ", language=" + language + ", signature="
				+ signature + ", windowInfo=" + windowInfo + ", LVWindowInfo=" + LVWindowInfo + ", applicationPath="
				+ applicationPath + ", workingDirectory=" + workingDirectory + "]";
	}
	
	public String getAppID() {
		return appID;
	}
	
	
	public void setAppID(String appID) {
		this.appID = appID;
	}
	
	
	public String getBuildID() {
		return buildID;
	}
	
	
	public void setBuildID(String buildID) {
		this.buildID = buildID;
	}
	
	
	public String getOffline() {
		return offline;
	}
	
	
	public void setOffline(String offline) {
		this.offline = offline;
	}
	
	
	public String getAutoDLC() {
		return autoDLC;
	}
	
	
	public void setAutoDLC(String autoDLC) {
		this.autoDLC = autoDLC;
	}
	
	
	public String getUpdateDB() {
		return updateDB;
	}
	
	
	public void setUpdateDB(String updateDB) {
		this.updateDB = updateDB;
	}
	
	
	public String getWaitForExit() {
		return waitForExit;
	}
	
	
	public void setWaitForExit(String waitForExit) {
		this.waitForExit = waitForExit;
	}
	
	
	public String getNoOperation() {
		return noOperation;
	}
	
	
	public void setNoOperation(String noOperation) {
		this.noOperation = noOperation;
	}
	
	
	public String getDLCName() {
		return DLCName;
	}
	
	
	public void setDLCName(String dLCName) {
		DLCName = dLCName;
	}
	
	
	public String getUserName() {
		return userName;
	}
	
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	
	public String getLanguage() {
		return language;
	}
	
	
	public void setLanguage(String language) {
		this.language = language;
	}
	
	
	public String getSignature() {
		return signature;
	}
	
	
	public void setSignature(String signature) {
		this.signature = signature;
	}
	
	
	public String getWindowInfo() {
		return windowInfo;
	}
	
	
	public void setWindowInfo(String windowInfo) {
		this.windowInfo = windowInfo;
	}
	
	
	public String getLVWindowInfo() {
		return LVWindowInfo;
	}
	
	
	public void setLVWindowInfo(String lVWindowInfo) {
		LVWindowInfo = lVWindowInfo;
	}
	
	
	public String getApplicationPath() {
		return applicationPath;
	}
	
	
	public void setApplicationPath(String applicationPath) {
		this.applicationPath = applicationPath;
	}
	
	
	public String getWorkingDirectory() {
		return workingDirectory;
	}
	
	
	public void setWorkingDirectory(String workingDirectory) {
		this.workingDirectory = workingDirectory;
	}
}
