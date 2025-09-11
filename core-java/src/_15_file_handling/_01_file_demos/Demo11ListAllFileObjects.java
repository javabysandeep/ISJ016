package _15_file_handling._01_file_demos;

import java.io.File;

public class Demo11ListAllFileObjects {
    public static void main(String[] args) {
        File folder = new File("C:\\Work\\ISJ016\\core-java\\src\\_12_array");
        File[] listOfFiles = folder.listFiles();
        for (File file : listOfFiles) {
            System.out.println(file.getName() + "\t" + file.length() + "\t" + file.lastModified());
        }

    }
}
