package _15_file_handling;

import java.io.File;
import java.io.IOException;

public class Demo4DeleteFolder {
    public static void main(String[] args) throws IOException {
        File file = new File("10sept2025");
        boolean isFolderDeleted = file.delete();
        System.out.println(isFolderDeleted);

    }
}
