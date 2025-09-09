package _14_exception_handling;

import java.io.IOException;

public class Demo16 {
    public static void main(String[] args) {
        try {
            createNewFile();
        } catch (IOException e) {
            System.out.println("IO Exception handled in main");
        }
    }
    public static void createNewFile() throws IOException {
        System.out.println("creating new file");
        throw new IOException("created exception in createNewFile");
    }
}
