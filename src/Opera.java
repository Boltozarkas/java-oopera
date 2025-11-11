import java.util.ArrayList;

public class Opera extends MusicalShow{
    private int choirSize; //кол-во человек в хоре

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
    public void printLibrettoText() {
        System.out.println("Текст либретто оперы:");
        System.out.println(getLibrettoText());
        /*
         я здесь переопределяю из-за добавления слова "оперы" во фразу "Текст либретто:", так же как и в классе Ballet,
         но если не надо такое различие добавлять для музыкальных шоу, то могу удалить и тут и в классе Ballet,
         хотя мне кажется что это добавляет читаемости и понимания ☺
         P.s.: так же я добавил переопределение для метода addActor в классах Opera и Ballet для той же цели ^_^
         */

    }

    @Override
    public void addActor(Actor actor) {
        System.out.println("Операция добавления актера в оперу");
        int index = listOfActors.indexOf(actor);
        if (index != -1) {
            System.out.println("Актер " + actor + "  уже есть в списке оперы.");
        } else {
            listOfActors.add(actor);
            System.out.println("Актер " + actor + " успешно добавлен в оперу.");
        }
    }
}
