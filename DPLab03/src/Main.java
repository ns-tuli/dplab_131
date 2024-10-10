import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EncryptionHandler context = new EncryptionHandler();
        IEncryption encryptionStrategy = null;

        // Step 1: Ask user to select encryption algorithm
        System.out.println("Select encryption algorithm: ");
        System.out.println("1 for AES");
        System.out.println("2 for DES");
        System.out.println("3 for Caesar Cipher");
        int choice = scanner.nextInt();
        scanner.nextLine();

        try {

            switch (choice) {
                case 1:
                    encryptionStrategy = new AES(); // AES encryption
                    break;
                case 2:
                    encryptionStrategy = new DES(); // DES encryption
                    break;
                case 3:
                    System.out.println("Enter Caesar Cipher shift value:");
                    int shift = scanner.nextInt(); // Input for Caesar Cipher shift value
                    scanner.nextLine(); // Consume newline character
                    encryptionStrategy = new Caesar(shift); // Caesar Cipher encryption
                    break;
                default:
                    System.out.println("Invalid choice.");
                    return;
            }


            context.setEncryptionStrategy(encryptionStrategy);


            System.out.println("Enter the text to encrypt:");
            String data = scanner.nextLine();


            String encryptedData = context.encryptData(data);
            System.out.println("Encrypted Text: " + encryptedData);


            String decryptedData = context.decryptData(encryptedData);
            System.out.println("Decrypted Text: " + decryptedData);

            System.out.println("Enter the filepath for encryption");
            String filepath = scanner.nextLine();
            String text = FileHandler.readFile(filepath);

            String encryptedtext = context.encryptData(text);
            FileHandler.writeFile("encryptedtext.txt",encryptedtext);


            //String decryptedtext = context.decryptData(text);
           // FileHandler.writeFile("decryptedtext.txt", decryptedtext);










        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close(); // Close the scanner to prevent resource leak
        }
    }
}
