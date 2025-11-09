import java.util.Objects;

public class Actor extends Person {
//    String name;
//    String surname;
//    String gender;
//    String height;

    public Actor(String name, String surname, Gender gender, String height) {
        super(name, surname, gender, height);
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (this.getClass() != obj.getClass()) return false;
        Actor actor = (Actor) obj;
        return Objects.equals(name, actor.name) &&
                Objects.equals(surname, actor.surname) &&
                Objects.equals(gender, actor.gender) &&
                Objects.equals(height, actor.height);
    }


    @Override
    public int hashCode() {
        return Objects.hash(name, surname, gender, height);
    }

    @Override
    public String toString() {
        return name + surname + " (рост " + height + " см)";
    }
}
