import java.util.Objects;

public class Actor extends Person {

    private String height;

    public Actor(String name, String surname, Gender gender, String height) {
        super(name, surname, gender);
        this.height = height;
    }


    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        Actor actor = (Actor) obj;
        return Objects.equals(height, actor.height);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), height);
    }

    @Override
    public String toString() {
        return super.toString() + " (рост " + height + " см)";
    }
}