import java.util.List;

public class Human {
    private final List<String> inventions = List.of("колесо", "Нью-Йорк", "война");
    private String opinion = "разумнее дельфинов";

    public List<String> getInventions() {
        return inventions;
    }

    public String getOpinion() {
        return opinion;
    }

    public void updateOpinion() {
        if (inventions.isEmpty()) opinion = "дельфины разумнее";
    }
}

