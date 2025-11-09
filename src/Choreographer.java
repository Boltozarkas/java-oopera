import java.util.Objects;

public class Choreographer extends Person{

    public Choreographer(String name, String surname, Gender gender, String height) {
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
        Choreographer choreographer = (Choreographer) obj;
        return Objects.equals(name, choreographer.name) &&
                Objects.equals(surname, choreographer.surname) &&
                Objects.equals(gender, choreographer.gender) &&
                Objects.equals(height, choreographer.height);
    }


    @Override
    public int hashCode() {
        return Objects.hash(name, surname, gender, height);
    }

    @Override
    public String toString() {
        return "Choreographer{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", gender=" + gender +
                ", height='" + height + '\'' +
                '}';
    }
}
