import java.util.ArrayList;

public class Show {
    String title;
    int duration;
    Director director;
    ArrayList<Actor> listOfActors;

    public Show(String title, int duration, Director director, ArrayList<Actor> listOfActors) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = listOfActors;
    }


    public void printListOfActors() {
        System.out.println("Список актеров спектакля:");
        for (Actor actor : listOfActors) {
            System.out.println(actor);
        }
    }

    public ArrayList<Actor> getListOfActors() {
        return listOfActors;
    }

    public void setListOfActors(ArrayList<Actor> listOfActors) {
        this.listOfActors = listOfActors;
    }

    public void changeOfActor(Actor oldActor, Actor newActor) {
        System.out.println("Операция замены актера:");
        int index = listOfActors.indexOf(oldActor);
        if (index != -1) {
            listOfActors.set(index, newActor);
            System.out.println("Актер " + oldActor + " успешно заменен на актера " + newActor);
        } else {
            System.out.println("Актера " + oldActor + " в списке не найдено.");
        }
    }
    public void addActor(Actor actor) {
        listOfActors.add(actor);
    }
}
