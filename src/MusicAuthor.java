import java.util.Objects;

public class MusicAuthor extends Person {
    public MusicAuthor(String name, String surname, Gender gender, String height) {
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
        MusicAuthor musicAuthor = (MusicAuthor) obj;
        return Objects.equals(name, musicAuthor.name) &&
                Objects.equals(surname, musicAuthor.surname) &&
                Objects.equals(gender, musicAuthor.gender) &&
                Objects.equals(height, musicAuthor.height);
    }


    @Override
    public int hashCode() {
        return Objects.hash(name, surname, gender, height);
    }

    @Override
    public String toString() {
        return "MusicAuthor{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", gender=" + gender +
                ", height='" + height + '\'' +
                '}';
    }
}
