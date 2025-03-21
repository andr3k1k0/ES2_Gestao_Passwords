package Singleton;
import java.util.HashMap;
import java.util.Map;

public class ConfigurationManager {
    // Singleton instance of the class
    private static ConfigurationManager instance;

    // Map to store the configurations
    private final Map<String, String> configs;

    /**
     * Private constructor to prevent external instantiation.
     * Initializes the configuration map with default values.
     */
    private ConfigurationManager() {
        configs = new HashMap<>();
        // Default configurations
        configs.put("APP_NAME", "Password Management");
        configs.put("LOG_LEVEL", "INFO");
        configs.put("MAX_PASSWORD_ATTEMPTS", "3");
    }

    /**
     * Static method to get the unique instance of the ConfigurationManager class.
     * Ensures that only one instance of the ConfigurationManager exists (Singleton pattern).
     *
     * @return The single instance of ConfigurationManager
     */
    public static synchronized ConfigurationManager getInstance() {
        if (instance == null) {
            instance = new ConfigurationManager();
        }
        return instance;
    }

    /**
     * Retrieves a configuration value based on the provided key.
     *
     * @param key The configuration key
     * @return The value associated with the provided key, or null if the key doesn't exist
     */
    public String getConfig(String key) {
        return configs.get(key);
    }

    /**
     * Adds or updates a configuration with the given key and value.
     *
     * @param key The configuration key
     * @param value The configuration value
     */
    public void setConfig(String key, String value) {
        configs.put(key, value);
    }

    /**
     * Displays all the current configurations stored in the manager.
     */
    public void displayConfigs() {
        System.out.println("Current configurations:");
        configs.forEach((key, value) -> System.out.println(key + ": " + value));
    }
}
