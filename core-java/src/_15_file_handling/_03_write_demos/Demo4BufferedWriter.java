package _15_file_handling._03_write_demos;

import java.io.*;

public class Demo4BufferedWriter {
    public static void main(String[] args) throws IOException {
        File file = new File("xyz.txt");
        FileWriter fileWriter = new FileWriter(file, true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write("\n Hello World - BufferedWriter");
        bufferedWriter.close();
        fileWriter.close();
        System.out.println("write operation completed");
    }
}
