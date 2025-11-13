import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.List;

public class Exam {
    private int id;
    private String title;
    private Course course;
    private LocalDateTime dateTime;
    private int coefficient;
    private List<Grade> grades;

    public Exam(int id , String title, Course course, LocalDateTime dateTime, int coefficient , List<Grade> grades) {
        this.id = id;
        this.title = title;
        this.course = course;
        this.dateTime = dateTime;
        this.coefficient = coefficient;
        this.grades = grades;
    }

    public int getCoefficient() {
        return coefficient;
    }

    public Course getCourse() {
        return course;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public double getExamGrade(Student student ,Instant time) {
        return grades.stream()
                .filter(g -> g.getStudent().equals(student))
                .mapToDouble(g -> g.getGradeAtTime(time))
                .findFirst()
                .orElse(0.0);
    }
}
