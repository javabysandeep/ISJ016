package _15_file_handling._02_read_demos;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Demo3BufferedInputStream {
    public static void main(String[] args) throws IOException {
        //BufferedInputStream ---> used to read bytes from Buffer

        File file = new File("abc.txt");
        FileInputStream fileInputStream = new FileInputStream(file);
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
        int value = bufferedInputStream.read();
        while (value != -1) {
            System.out.print((char) value);
            value = bufferedInputStream.read();
        }
        bufferedInputStream.close();
        fileInputStream.close();

    }
}
