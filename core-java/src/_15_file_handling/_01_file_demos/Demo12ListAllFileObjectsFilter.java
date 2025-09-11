package _15_file_handling._01_file_demos;

import java.io.File;
import java.io.FileFilter;

public class Demo12ListAllFileObjectsFilter {
    public static void main(String[] args) {
        File folder = new File("C:\\Work\\ISJ016\\core-java\\src\\_12_array");

        FileFilter fileFilter = fileObj -> fileObj.length() > 1000;
        File[] listOfFiles = folder.listFiles(fileFilter);
        for (File file : listOfFiles) {
            System.out.println(file.getName() + "\t" + file.length() + "\t" + file.lastModified());
        }

    }
}
