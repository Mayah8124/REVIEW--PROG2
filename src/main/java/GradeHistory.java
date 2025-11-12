import java.time.LocalDateTime;

public class GradeHistory {
    private double value;
    private LocalDateTime dateTime;
    private String motif;

    public GradeHistory(double value , LocalDateTime dateTime , String motif) {
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

