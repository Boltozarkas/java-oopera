import java.util.Objects;

public class Director extends Person {
    //    String name;
//    String surname;
//    String gender;
//    String height;
    int numberOfShows;


    public Director(String name, String surname, Gender gender, String height, int numberOfShows) {
        super(name, surname, gender, height);
        this.numberOfShows = numberOfShows;
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
        Director director = (Director) obj;
        return Objects.equals(name, director.name) &&
                Objects.equals(surname, director.surname) &&
                Objects.equals(gender, director.gender) &&
                Objects.equals(height, director.height);
    }


    @Override
    public int hashCode() {
        return Objects.hash(name, surname, gender, height);
    }

    @Override
    public String toString() {
        return name + surname;
    }


}
