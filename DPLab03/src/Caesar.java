public class Caesar implements IEncryption {
    private int shift;

    public Caesar(int shift) {
        this.shift = shift;
    }

    @Override
    public String encrypt(String data) {
        StringBuilder encrypted = new StringBuilder();
        for (char c : data.toCharArray()) {
            if (Character.isLetter(c)) {
                char shifted = (char) (c + shift);
                if (Character.isLowerCase(c) && shifted > 'z' ||
                        Character.isUpperCase(c) && shifted > 'Z') {
                    shifted -= 26;
                }
                encrypted.append(shifted);
            } else {
                encrypted.append(c);
            }
        }
        return encrypted.toString();
    }

    @Override
    public String decrypt(String encryptedData) {
        StringBuilder decrypted = new StringBuilder();
        for (char c : encryptedData.toCharArray()) {
            if (Character.isLetter(c)) {
                char shifted = (char) (c - shift);
                if (Character.isLowerCase(c) && shifted < 'a' ||
                        Character.isUpperCase(c) && shifted < 'A') {
                    shifted += 26;
                }
                decrypted.append(shifted);
            } else {
                decrypted.append(c);
            }
        }
        return decrypted.toString();
    }
}
