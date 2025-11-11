import java.util.Objects;

public class Choreographer extends Person{

    public Choreographer(String name, String surname, Gender gender) {
        super(name, surname, gender);
    }
    // сделал как класс Director, т.к. данный человек тоже работает не на сцене, а за кулисами
    @Override
    public String toString() {
        return name + " " + surname;
    }
}
