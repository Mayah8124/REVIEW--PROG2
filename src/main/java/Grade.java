import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Grade {
    private double grade;
    private Student student;
    private  Course course;
    private List<gradeHistory> history;

    public Grade(Course course, Student student , double grade) {
        this.course = course;
        this.student = student;
        this.grade = grade;
        this.history = new ArrayList<>();
        this.history.add(new gradeHistory(initialValue , LocalDate.now() , "Valeur initiale"));
    }

    public Course getCourse() {
        return course;
    }

    public double getGrade() {
        return grade;
    }

    public List<gradeHistory> getHistory() {
        return history;
    }

    public Student getStudent() {
        return student;
    }
}
