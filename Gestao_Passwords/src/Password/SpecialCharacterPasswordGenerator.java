package Password;

public class SpecialCharacterPasswordGenerator implements PasswordGenerator {
    // String containing all possible special characters, letters, and numbers for password generation
    private static final String SPECIAL_CHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()-_=+";

    /**
     * Generates a random password of the specified length using special characters, letters, and numbers.
     *
     * @param length The desired length of the generated password
     * @return A random password containing special characters
     */
    @Override
    public String generatePassword(int length) {
        StringBuilder password = new StringBuilder();
        // Loop to generate each character of the password
        for (int i = 0; i < length; i++) {
            // Randomly select an index from the SPECIAL_CHARS string
            int index = (int) (Math.random() * SPECIAL_CHARS.length());
            // Append the selected character to the password
            password.append(SPECIAL_CHARS.charAt(index));
        }
        return password.toString();
    }
}
