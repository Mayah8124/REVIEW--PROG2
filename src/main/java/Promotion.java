import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Promotion {
    private String name;
    private List<Group> group;

    public Promotion(String name) {
        this.name = name;
        this.group = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Group> getGroup() {
        return group;
    }
}
