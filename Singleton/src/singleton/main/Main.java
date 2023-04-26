package singleton.main;

import singleton.file.configure.GameConfig;

public class Main {

	public static void main(String[] args) {
		GameConfig firstInstance = GameConfig.getInstance();
		System.out.println(firstInstance.toString());
		System.out.println("\n");
		
		GameConfig secondInstance = GameConfig.getInstance();
		secondInstance.setAppID("123");
		System.out.println(secondInstance.toString());
		System.out.println(firstInstance.toString());
		System.out.println("\n");
		
		GameConfig thirdInstance = GameConfig.getInstance();
		thirdInstance.setBuildID("589");
		System.out.println(secondInstance.toString());
		System.out.println(firstInstance.toString());
		System.out.println(thirdInstance.toString());
		System.out.println("\n");
	}

}
