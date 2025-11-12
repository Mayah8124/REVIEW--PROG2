import java.util.ArrayList;
import java.util.List;

public class Group {
    private String name;
    private Promotion promotion;
    private List<Student> students;

    public Group(String name , Promotion promotion) {
        this.name = name;
        this.promotion = promotion;
        students = new ArrayList<Student>();
    }

    public String getName() {
        return name;
    }

    public Promotion getPromotion() {
        return promotion;
    }

    public List<Student> getStudents() {
        return students;
    }
}
