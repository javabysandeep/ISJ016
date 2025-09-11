package _15_file_handling._02_read_demos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Demo4BufferedReader {
    public static void main(String[] args) throws IOException {
        //BufferedReader --> read characters from Buffer
        File file = new File("abc.txt");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        int value = bufferedReader.read();
        while (value != -1) {
            System.out.print((char) value);
            value = bufferedReader.read();
        }
        bufferedReader.close();
        fileReader.close();
    }
}
