import java.time.LocalDateTime;

public class gradeHistory {
    private double value;
    private LocalDateTime dateTime;
    private String motif;

    public gradeHistory(LocalDateTime dateTime , String motif, double value) {
        this.dateTime = dateTime;
        this.motif = motif;
        this.value = value;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public String getMotif() {
        return motif;
    }

    public double getValue() {
        return value;
    }
}

