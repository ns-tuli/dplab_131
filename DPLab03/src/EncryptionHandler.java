public class EncryptionHandler {
    private IEncryption encryptionStrategy;


    public void setEncryptionStrategy(IEncryption encryptionStrategy) {
        this.encryptionStrategy = encryptionStrategy;
    }


    public String encryptData(String data) {
        return encryptionStrategy.encrypt(data);
    }


    public String decryptData(String encryptedData) {
        return encryptionStrategy.decrypt(encryptedData);
    }
}
