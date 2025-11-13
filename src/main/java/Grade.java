import java.time.Instant;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Grade {
    private double grade;
    private Student student;
    private  Exam exam;
    private List<GradeHistory> history = new ArrayList<>();

    public Grade(Exam exam, Student student , double grade) {
        this.exam = exam;
        this.student = student;
        this.grade = grade;
        this.history.add(new GradeHistory(grade , Instant.now(), "Valeur initiale"));
    }

    public double getGradeAtTime(Instant time) {
        return history.stream()
                .filter(history -> !history.getTime().isAfter(time))
                .mapToDouble(GradeHistory::getValue)
                .reduce((first , second) -> second)
                .orElse(grade);
    }

    public Exam getExam() {
        return exam;
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
