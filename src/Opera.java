import java.util.ArrayList;

public class Opera extends MusicalShow{
    int choirSize; //кол-во человек в хоре

    public Opera(String title, int duration, Director director, ArrayList<Actor> listOfActors,
                 MusicAuthor musicAuthor, String librettoText, int choirSize) {
        super(title, duration, director, listOfActors, musicAuthor, librettoText);
        this.choirSize = choirSize;
    }

    @Override
    public void printListOfActors() {
        System.out.println("Список актеров оперы:");
        for (Actor actor : listOfActors) {
            System.out.println(actor);
        }

    }

    @Override
    public String getLibrettoText() {
        return super.getLibrettoText();
    }

    @Override
    public void printLibrettoText() {
        System.out.println("Текст либретто оперы:");
        System.out.println(getLibrettoText());
    }
}
