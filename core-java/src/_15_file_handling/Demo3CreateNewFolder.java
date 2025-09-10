package _15_file_handling;

import java.io.File;
import java.io.IOException;

public class Demo3CreateNewFolder {
    public static void main(String[] args) throws IOException {
        File file = new File("10sept2025");
        boolean isFolderCreated = file.mkdir();
        System.out.println(isFolderCreated);

    }
}
