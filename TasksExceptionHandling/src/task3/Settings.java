package task3;

public class Settings {
	public void displaySettings() {
        System.out.println("Application: " + AppConfig.APP_NAME);
        System.out.println("Version: " + AppConfig.VERSION);
        System.out.println("Max Users Allowed: " + AppConfig.MAX_USERS);
        System.out.println("Debug Mode: " + (AppConfig.DEBUG_MODE ? "ON" : "OFF"));
    }
	
	 public static void main(String[] args) {
	        Settings s = new Settings();
	        s.displaySettings();
	    }

}
