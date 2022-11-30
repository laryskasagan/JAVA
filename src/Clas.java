import java.util.ArrayList;
import java.util.List;

public class StudentClass {
    public String className;
    public List<Student> studentList;
    public int maxStudents;

    public StudentClass(String name, int max) {
        className = name;
        maxStudents = max;
        studentList = new ArrayList<>(max - 1);
    }

    public void addStudentToClass(Student o) {
        if(this.studentList.size()<maxStudents){
            if(studentList.contains(o)) System.err.println(o.getNameAndSurname() + ": This student has been enrolled to this class already!");
            else studentList.add(o);
        }
        else{
            System.err.println(o.getNameAndSurname() + ": This class is full! Add student to another class!");
        }
    }

}