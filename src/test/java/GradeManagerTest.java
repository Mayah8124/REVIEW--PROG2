import org.junit.jupiter.api.Test;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GradeManagerTest {

    @Test
    public void getGradeTest() {
        Teacher teacher = new Teacher(
                1 , "John" , "Smith" , LocalDate.of(1999, 2, 12), "john@gmail.com" , "0331234567" , "Devops"
        );

        Course course = new Course(
                1 , "PROG2" , 6 , teacher , List.of()
        );

        Student student = new Student(
                1 , "Rose" , "Marie" , LocalDate.of(2007 , 3 , 15) , "rose@gmail.com" , "0342516798" , "K1"
        );

        Exam exam = new Exam(
                1 , "Exam1" , course , LocalDateTime.of(2024, 1, 10, 9, 0), 2, List.of()
        );

        Exam exam2 = new Exam(
                2 , "retake" , course ,  LocalDateTime.of(2024, 2, 10, 9, 0), 3, List.of()
        );

        Grade grade1 = new Grade(exam , student , 10.0);
        Grade grade2 = new Grade(exam2, student , 15.0);

        exam = new Exam(
                1 , "Exam1" , course , exam.getCourse().getExams().isEmpty() ? exam.getDateTime() : null , 2 , List.of(grade1)
        );

        exam2 = new Exam(
                2 , "retake" , course , exam2.getCourse().getExams().isEmpty() ? exam2.getDateTime() : null , 3 , List.of(grade2)
        );

        course = new Course(
                1 , "PROG2" , 6 , teacher , List.of(exam , exam2)
        );

        Instant now = Instant.now();

        assertEquals(10.0, exam.getExamGrade(student, now));
        assertEquals(15.0, exam2.getExamGrade(student, now));
        assertEquals(13.0, course.getCourseGrade(student, now));
    }
}
