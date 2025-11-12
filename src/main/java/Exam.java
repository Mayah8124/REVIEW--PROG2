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

    public Exam(int id , String title, Course course, LocalDateTime dateTime, int coefficient) {
        this.id = id;
        this.title = title;
        this.course = course;
        this.dateTime = dateTime;
        this.coefficient = coefficient;
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

    public double getFinalGrade(List<Grade> grades , List<Exam> exams) {
        if (grades == null || exams == null || grades.size() != exams.size() || grades.isEmpty()) {
            throw new IllegalArgumentException("Invalid or empty lists");
        }

        double sum = 0;
        int coeffSum = 0;

        for (int i =0 ; i < grades.size() ; i++) {
            double value = grades.get(i).getGrade();
            double coeff = exams.get(i).getCoefficient();

            sum += value * coeff;
            coeffSum += coeff;
        }

        return sum / coeffSum;
    }

    public double getExamGrade(Student student , List<Grade> allGrades , Instant t) {
        for (Grade grade : allGrades) {
            if (grade.getStudent().equals(student) && grade.getCourse().equals(this.course)) {
                double value = 0;
                Instant lastMaj = Instant.EPOCH;

                for (gradeHistory history : grade.getHistory()) {
                    Instant dateHistory = history.getDateTime()
                            .atZone(ZoneId.systemDefault())
                            .toInstant();

                    if (dateHistory.isAfter(t) && dateHistory.isBefore(lastMaj)) {
                        value = history.getValue();
                        lastMaj = dateHistory;
                    }
                }
                return value;
            }
        }
        return 0.0;
    }
}
