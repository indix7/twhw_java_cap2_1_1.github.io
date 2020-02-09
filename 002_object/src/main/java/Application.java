import model.Teacher;
import model.Student;
import java.util.ArrayList;

public class Application {

    public static void main(String[] args) {
        handStudent();
        handTeacher();
    }

    public static void handStudent() {
        Student student = new Student("李莉", 20, "女");
        System.out.println(student.getAllInfo());
        student.study();
        student.rest();
    }

    public static void handTeacher() {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("李莉", 20, "女"));
        students.add(new Student("王其", 21, "男"));
        Teacher teacher = new Teacher("张龙", students);
        teacher.addStudent("赵毅", 22, "男");
        System.out.println("=========================\n" + teacher.getName() + "所有管理学生 ： \n");
        for (Student student: teacher.getRoster()) {
            System.out.println(student.getAllInfo());
        }
    }
}
