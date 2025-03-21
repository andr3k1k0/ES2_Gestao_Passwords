import Singleton.ConfigurationManager;
import Password.*;

/**
 * Main class to demonstrate centralized configuration management and secure password generation.
 * <p>This class demonstrates the use of the {@link ConfigurationManager} singleton to manage application settings
 * and the {@link PasswordManager} to generate secure passwords of different types (alphanumeric and special characters).</p>
 */
public class Main {
    public static void main(String[] args) {
        // ----- Centralized Configuration -----
        // Get the singleton instance of ConfigurationManager
        ConfigurationManager configManager = ConfigurationManager.getInstance();

        // Display the initial configuration settings
        configManager.displayConfigs();

        // Modify a configuration value
        configManager.setConfig("LOG_LEVEL", "DEBUG");

        // Retrieve a specific configuration value
        String appName = configManager.getConfig("APP_NAME");
        System.out.println("Application name: " + appName);

        // Display the updated configuration settings
        configManager.displayConfigs();

        // Check if both instances of ConfigurationManager are the same
        ConfigurationManager anotherConfigManager = ConfigurationManager.getInstance();
        // Uncomment the following line to verify that both instances are the same
        // System.out.println("Are the instances the same? " + (configManager == anotherConfigManager));

        // ----- Secure Password Creation -----
        // Create an instance of PasswordManager to generate secure passwords
        PasswordManager passwordManager = new PasswordManager();

        // Generate an alphanumeric password with 10 characters
        String alphaPassword = passwordManager.generatePassword(10, PasswordType.ALPHANUMERIC);
        System.out.println("Alphanumeric Password: " + alphaPassword);

        // Generate a password with special characters, 12 characters long
        String specialPassword = passwordManager.generatePassword(12, PasswordType.SPECIAL);
        System.out.println("Password with Special Characters: " + specialPassword);
    }
}
