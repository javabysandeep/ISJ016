package _15_file_handling;

import java.io.File;
import java.io.FilenameFilter;

public class Demo10ListFileNamesFilter {
    public static void main(String[] args) {
        File folder = new File("C:\\Work\\ISJ016\\core-java\\src\\_12_array");
        FilenameFilter fileNameFilter =(File dir, String name) ->name.startsWith("Demo1");
        String[] listOfFileNames = folder.list(fileNameFilter);
        for (String fileName : listOfFileNames) {
            System.out.println(fileName);
        }
    }
}
