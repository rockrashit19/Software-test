public class Belief {
    private final Creature subject;
    private final Creature object;

    public Belief(Creature subject, Creature object) {
        this.subject = subject;
        this.object = object;
    }

    public Creature getSubject() {
        return subject;
    }

    public Creature getObject() {
        return object;
    }

    public boolean isSubjectMoreRational() {
        return subject.getReasons().size() > object.getReasons().size();
    }

    @Override
    public String toString() {
        return "Belief{" +
                "subject=" + subject.getName() +
                ", object=" + object.getName() +
                '}';
    }
}
