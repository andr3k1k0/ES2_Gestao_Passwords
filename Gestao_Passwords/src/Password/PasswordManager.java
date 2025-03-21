package Password;

/**
 * Manages the generation of passwords based on different types.
 *
 * <p>This class provides methods to generate passwords of specified types (alphanumeric or special character) and lengths.</p>
 */
public class PasswordManager {

    /**
     * Generates a password of the specified length and type.
     *
     * @param length The desired length of the generated password
     * @param passwordType The type of password to generate (ALPHANUMERIC or SPECIAL)
     * @return A randomly generated password of the specified length and type
     */
    public String generatePassword(int length, PasswordType passwordType) {
        // Create the appropriate password generator based on the password type
        PasswordGenerator generator = createPasswordGenerator(passwordType);
        // Generate and return the password using the created generator
        return generator.generatePassword(length);
    }

    /**
     * Creates a password generator based on the provided password type.
     *
     * @param passwordType The type of password to generate (ALPHANUMERIC or SPECIAL)
     * @return A PasswordGenerator that matches the specified password type
     * @throws IllegalArgumentException if the password type is not recognized
     */
    private PasswordGenerator createPasswordGenerator(PasswordType passwordType) {
        switch (passwordType) {
            case ALPHANUMERIC:
                // Return an Alphanumeric password generator
                return new AlphanumericPasswordGenerator();
            case SPECIAL:
                // Return a Special Character password generator
                return new SpecialCharacterPasswordGenerator();
            default:
                // Throw an exception if the password type is invalid
                throw new IllegalArgumentException("Invalid password type");
        }
    }
}
