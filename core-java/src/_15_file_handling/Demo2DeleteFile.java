package _15_file_handling;

import java.io.File;
import java.io.IOException;

public class Demo2DeleteFile {
    public static void main(String[] args) throws IOException {
        File file = new File("abc.txt");
        boolean isFileDeleted = file.delete();
        System.out.println(isFileDeleted);
    }
}
