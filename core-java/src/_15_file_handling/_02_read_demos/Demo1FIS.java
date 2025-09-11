package _15_file_handling._02_read_demos;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Demo1FIS {
    public static void main(String[] args) throws IOException {
        //FIS - FileInputStream --> read the bytes from File
        File file = new File("abc.txt");
        FileInputStream fileInputStream = new FileInputStream(file);
        /*int valueFromFile = fileInputStream.read();
        while (valueFromFile != -1) {
            System.out.print((char) valueFromFile);
            valueFromFile = fileInputStream.read();
        }*/
        for (int i = 0; i < file.length(); i++) {
            System.out.print((char) fileInputStream.read());
        }

        //close the stream
        fileInputStream.close();
    }
}
