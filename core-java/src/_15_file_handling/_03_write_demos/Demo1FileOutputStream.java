package _15_file_handling._03_write_demos;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo1FileOutputStream {
    public static void main(String[] args) throws IOException {
        //FileOutputStream --> write bytes to the file
        File file = new File("xyz.txt");
        FileOutputStream fileOutputStream = new FileOutputStream(file,true);
        //multiple bytes writing
        fileOutputStream.write("Hello World".getBytes());
        //single byte wirte
        //fileOutputStream.write('B');
        System.out.println("write operation complete");
        fileOutputStream.close();
    }
}
