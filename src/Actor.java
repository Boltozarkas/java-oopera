import java.util.Objects;

public class Actor extends Person {
    // комментарии полей я делал для себя, для удобства=)
    String height;

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
        return name + " " + surname + " (рост " + height + " см)";
    }
}
/*
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (this.getClass() != obj.getClass())
            return false;
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
 */