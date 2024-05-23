package FileEncryption;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the file name to encrypt it");
        String sourceEncrypt = scanner.next();
        System.out.println("Enter the file name to save encrypted text");
        String destEncrypt = scanner.next();

        try {
            EncryptDecryptFile.encrypt(sourceEncrypt, destEncrypt);
            System.out.println("File encrypted successfully!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Enter the file name to decrypt it");
        String sourceDecrypt = scanner.next();
        System.out.println("Enter the file name to save decrypted text");
        String destDecrypt = scanner.next();

        try {
            EncryptDecryptFile.decrypt(sourceDecrypt, destDecrypt);
            System.out.println("File decrypted successfully!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
