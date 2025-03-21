package Password;

/**
 * Interface for generating passwords of a specified length.
 *
 * <p>Implementing classes are responsible for defining how the password is generated based on the required format.</p>
 */
public interface PasswordGenerator {

    /**
     * Generates a password of the specified length.
     *
     * @param length The desired length of the generated password
     * @return A randomly generated password of the specified length
     */
    String generatePassword(int length);
}
