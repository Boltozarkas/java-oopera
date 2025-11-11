import java.util.ArrayList;

public class Ballet extends MusicalShow {
    private Choreographer choreographer;

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
    public void printLibrettoText() {
        System.out.println("Текст либретто балета:");
        System.out.println(getLibrettoText());
    }

    @Override
    public void addActor(Actor actor) {
        System.out.println("Операция добавления актера в балет");
        int index = listOfActors.indexOf(actor);
        if (index != -1) {
            System.out.println("Актер " + actor + "  уже есть в списке балета.");
        } else {
            listOfActors.add(actor);
            System.out.println("Актер " + actor + " успешно добавлен в балет.");
        }
    }
}
