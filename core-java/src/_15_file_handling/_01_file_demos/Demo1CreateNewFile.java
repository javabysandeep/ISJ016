package _15_file_handling._01_file_demos;

import java.io.File;
import java.io.IOException;

public class Demo1CreateNewFile {
    public static void main(String[] args) throws IOException {
        File file = new File("abc.txt");
        boolean isFileCreated = file.createNewFile();
        System.out.println(isFileCreated);

    }
}
