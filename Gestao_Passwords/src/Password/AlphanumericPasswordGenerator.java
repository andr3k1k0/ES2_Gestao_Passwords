package Password;

/**
 * Generates alphanumeric passwords of a specified length.
 *
 * <p>This class implements the {@link PasswordGenerator} interface and generates passwords containing
 * uppercase letters, lowercase letters, and digits. The password is generated randomly based on the specified length.</p>
 */
public class AlphanumericPasswordGenerator implements PasswordGenerator {

    // The set of characters used for generating alphanumeric passwords
    private static final String ALPHANUMERIC_CHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

    /**
     * Generates an alphanumeric password of the specified length.
     *
     * @param length The desired length of the generated password
     * @return A randomly generated alphanumeric password of the specified length
     */
    @Override
    public String generatePassword(int length) {
        // StringBuilder is used for efficient string concatenation
        StringBuilder password = new StringBuilder();
        for (int i = 0; i < length; i++) {
            // Randomly pick a character from the ALPHANUMERIC_CHARS set
            int index = (int) (Math.random() * ALPHANUMERIC_CHARS.length());
            password.append(ALPHANUMERIC_CHARS.charAt(index));
        }
        return password.toString();
    }
}
