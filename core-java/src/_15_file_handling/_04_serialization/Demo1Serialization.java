package _15_file_handling._04_serialization;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Demo1Serialization {
    public static void main(String[] args) throws IOException {
        File file = new File("student-details.txt");

        FileOutputStream fileOutputStream = new FileOutputStream(file);

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        Student student = new Student(101, "Suraj", "admin", "admin");

        objectOutputStream.writeObject(student);

        objectOutputStream.close();
        fileOutputStream.close();

        System.out.println("Student details saved successfully");
    }
}
