package _15_file_handling;

import java.io.File;

public class Demo7GetPath {
    public static void main(String[] args) {
        File file = new File("abc.txt");
        System.out.println("Relative path "+file.getPath());
        System.out.println("Absolute path "+file.getAbsolutePath());
        System.out.println("File size "+file.length()); //44 number of characters
        String str = "this is the file created using java program.";
        System.out.println("String length "+str.length());//44 --> number of characters
        System.out.println(file.exists());//it will check if the file or folder is present

    }
}
