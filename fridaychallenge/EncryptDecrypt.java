public class EncryptDecrypt {
    

// Encrypt using XOR
    public static String encrypt(String message, int key) {
        char[] chars = message.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            chars[i] = (char) (chars[i] ^ key);
        }

        return new String(chars);
    }

    // Decrypt using XOR 
    public static String decrypt(String cipher, int key) {
        char[] chars = cipher.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            chars[i] = (char) (chars[i] ^ key);
        }

        return new String(chars);
    }

    
    public static void main(String[] args) {
        String message = "Secret Message";
        int key = 7;

        String encrypted = encrypt(message, key);
        String decrypted = decrypt(encrypted, key);

        System.out.println("Original  : " + message);
        System.out.println("Encrypted : " + encrypted);
        System.out.println("Decrypted : " + decrypted);
    }
}