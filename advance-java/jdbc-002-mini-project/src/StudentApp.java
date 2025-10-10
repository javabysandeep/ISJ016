import controller.StudentController;
import model.Student;

public class StudentApp {
    public static void main(String[] args) {
        StudentController studentController = new StudentController();

        Student student = new Student();
        student.setId(2);
        student.setName("Rutuja Z");
        student.setEmail("rutuja.z@gmail.com");
        student.setPhone("989898989");

        // studentController.createStudent(student);
        // studentController.updateStudent(student);
        //studentController.deleteStudentById(2);
        //System.out.println(studentController.getStudentById(3));
        studentController.getAllStudents().forEach(System.out::println);
    }
}
