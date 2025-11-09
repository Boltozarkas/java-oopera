import java.util.ArrayList;

public class Ballet extends MusicalShow{
    Choreographer choreographer;

    public Ballet(String title, int duration, Director director, ArrayList<Actor> listOfActors,
                  MusicAuthor musicAuthor, String librettoText, Choreographer choreographer) {
        super(title, duration, director, listOfActors, musicAuthor, librettoText);
        this.choreographer = choreographer;
    }

    @Override
    public void printListOfActors() {
        System.out.println("Список актеров балета:");
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
        System.out.println("Текст либретто балета:");
        System.out.println(getLibrettoText());
    }
}
