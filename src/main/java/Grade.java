import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Grade {
    private double grade;
    private Student student;
    private  Course course;
    private List<GradeHistory> history;

    public Grade(Course course, Student student , double grade) {
        this.course = course;
        this.student = student;
        this.grade = grade;
        this.history = new ArrayList<>();
        this.history.add(new GradeHistory(grade , LocalDateTime.now(), "Valeur initiale"));
    }

    public Course getCourse() {
        return course;
    }

    public double getGrade() {
        return grade;
    }

    public List<GradeHistory> getHistory() {
        return history;
    }

    public Student getStudent() {
        return student;
    }
}
