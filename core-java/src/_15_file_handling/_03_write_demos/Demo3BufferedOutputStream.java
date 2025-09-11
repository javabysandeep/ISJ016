package _15_file_handling._03_write_demos;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo3BufferedOutputStream {
    public static void main(String[] args) throws IOException {
        File file = new File("xyz.txt");
        FileOutputStream fileOutputStream = new FileOutputStream(file, true);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
        bufferedOutputStream.write("\n Hello World - BufferedOutputStream".getBytes());
        bufferedOutputStream.close();
        fileOutputStream.close();
        System.out.println("write operation completed");
    }
}
