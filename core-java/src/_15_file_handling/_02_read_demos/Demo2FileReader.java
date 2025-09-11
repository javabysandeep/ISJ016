package _15_file_handling._02_read_demos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class Demo2FileReader {
    public static void main(String[] args) throws IOException {
        //FileReader --> read the characters from File
        File file = new File("abc.txt");
        FileReader fileReader = new FileReader(file);
        /*int valueFromFile = fileReader.read();
        while (valueFromFile != -1) {
            System.out.print((char) valueFromFile);
            valueFromFile = fileReader.read();
        }*/
        for (int i = 0; i < file.length(); i++) {
            System.out.print((char) fileReader.read());
        }

        //close the stream
        fileReader.close();
    }
}
