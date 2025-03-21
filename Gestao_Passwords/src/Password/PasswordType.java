package Password;

/**
 * Enum representing different types of password formats.
 *
 * <p>ALPHANUMERIC represents passwords that contain only letters and numbers, while SPECIAL represents passwords
 * that can contain special characters as well.</p>
 */
public enum PasswordType {
    // Password type that allows only alphanumeric characters (letters and numbers)
    ALPHANUMERIC,

    // Password type that allows alphanumeric characters along with special characters
    SPECIAL;
}
