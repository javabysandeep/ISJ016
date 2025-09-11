package _15_file_handling._04_serialization;

import java.io.*;

public class Demo2DeSerialization {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        File file = new File("student-details.txt");

        FileInputStream fileInputStream = new FileInputStream(file);

        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        Student student = (Student) objectInputStream.readObject();
        System.out.println(student);


        objectInputStream.close();
        fileInputStream.close();
    }
}
