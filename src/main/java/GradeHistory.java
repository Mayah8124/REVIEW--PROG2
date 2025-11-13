import java.time.Instant;

public class GradeHistory {
    private double value;
    private Instant time;
    private String motif;

    public GradeHistory(double value , Instant time , String motif) {
        this.time = time;
        this.motif = motif;
        this.value = value;
    }

    public Instant getTime() {
        return time;
    }

    public String getMotif() {
        return motif;
    }

    public double getValue() {
        return value;
    }
}

