import java.util.ArrayList;

public class Show {
    public String title;
    public int duration;
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

    public void changeActor(String oldActorSurname, Actor newActor) {
        System.out.println("Операция замены актера:");
        int count = 0;
        for (int i = 0; i < listOfActors.size(); i++) {
            Actor actor = listOfActors.get(i);
            if (actor.getSurname().equals(oldActorSurname)) {
                count++;
                if (count > 1) {
                    System.out.println("Ошибка: в списке найдено более одного актера с фамилией " + oldActorSurname);
                    return;
                }
                listOfActors.set(i, newActor);
                System.out.println("Актер с фамилией " + oldActorSurname + " успешно заменен на актера " + newActor);
            }
        }
        if (count == 0) {
            System.out.println("Актера с фамилией " + oldActorSurname + " в списке не найдено.");
        }
    }

    public void addActor(Actor actor) {
        System.out.println("Операция добавления актера в спектакль");
        int index = listOfActors.indexOf(actor);
        if (index != -1) {
            System.out.println("Актер " + actor + "  уже есть в списке спектакля.");
        } else {
            listOfActors.add(actor);
            System.out.println("Актер " + actor + " успешно добавлен в спектакль.");
        }
    }

    public void printDirectorInfo(Director director) {
        System.out.println("Информация о директоре:");
        System.out.println(director);
    }
}
