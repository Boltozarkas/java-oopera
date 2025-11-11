import java.util.ArrayList;
/* Привет, Георгий! Меня зовут Артем! Рад Знакомству!=)
P.s.:Раньше затупил и не оставил коммент со знакомством, но лучше поздно чем никогда:D
 */
public class Theatre {

    public static void main(String[] args) {
        System.out.println("Поехали!");
        System.out.println("♦♫♦♫♦♫♦"); // музыкальное вступление ☻
        Actor actor1 = new Actor("Ана", "Де Армс", Gender.FEMALE, "168");
        Actor actor2 = new Actor("Джек", "Николсон", Gender.MALE, "177");
        Actor actor3 = new Actor("Хит", "Леджер", Gender.MALE, "185");

        Director director1 = new Director("Джеймс", "Кэмерон", Gender.MALE, 5);
        Director director2 = new Director("Гай", "Ричи", Gender.MALE, 10);

        MusicAuthor musicAuthor1 = new MusicAuthor("Ханс", "Циммер", Gender.MALE);

        Choreographer choreographer1 = new Choreographer("Сергей", "Шестиперов", Gender.MALE);

        ArrayList<Actor> listOfActorsShow = new ArrayList<>();
        ArrayList<Actor> listOfActorsOpera = new ArrayList<>();


        ArrayList<Actor> listOfActorsBallet = new ArrayList<>();


        Show show = new Show("Сухая деревяшка", 180, director2, listOfActorsShow);
        show.addActor(actor3);
        show.addActor(actor2);
        Opera opera = new Opera("Бассовый крик", 119, director1, listOfActorsOpera, musicAuthor1,
                "Земля трещит, и небо слепо,\n" +
                "В моей груди – одна пустота!\n" +
                "Но боль, что разрывает недра,\n" +
                "Рождает тихий стон – Баса.", 40);
        opera.addActor(actor2);
        Ballet ballet = new Ballet("Косплей балета", 420, director2, listOfActorsBallet, musicAuthor1,
                "На сцене – Золушка, Чужой и Ариадна.\n" +
                "Повторяют па из лебединых сцен упрямо.\n" +
                "Вот балет! Но не для дам,\n" +
                "А для косплея – по мирам!", choreographer1);
        ballet.addActor(actor1);

        System.out.println("");
        show.printListOfActors();
        System.out.println("");
        opera.printListOfActors();
        System.out.println("");
        ballet.printListOfActors();
        System.out.println("");
        show.changeActor("Николсон", actor1);
        System.out.println("");
        show.printListOfActors();
        System.out.println("");
        opera.changeActor("Леджер", actor1);
        System.out.println("");
        opera.printListOfActors();
        System.out.println("");
        opera.printLibrettoText();
        System.out.println("");
        ballet.printLibrettoText();
    }
}
