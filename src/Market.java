import java.util.ArrayList;
import java.util.List;
//Инициализация списка queue:Список queue необходимо инициализировать.
//Добавление документации:Комментарии помогут понять, что делают методы.
//Принцип единственной ответственности (SRP)
import java.util.ArrayList;
import java.util.List;

public class Market implements MarketBehaviour, QueueBehaviour {

    private List<Actor> queue = new ArrayList<>();// Инициализация списка
    // Метод для инициализации списка акторов
    private List<Actor> initActor() {
        List<Actor> actors = new ArrayList<>();
        actors.add(new Human("Grisha"));
        actors.add(new Human("Misha"));
        actors.add(new SuperHuman("Anton", "Invisibility"));//теперь мы можем добовлять новые типы Людей Расширяя существующие классы , без изменения существуюшего кода.
        return actors;
    }

    @Override
    public void acceptToMarket(Actor actor) {
        System.out.println(actor.getName() + " is accepting market");
    }

    @Override
    public void releaseFromMarket(List<Actor> actorList) {
        System.out.println(actorList + " is releasing market");
    }

    @Override
    public void update() {
        System.out.println("Current queue: " + queue);
    }

    @Override
    public void takeInQueue(Actor actor) {
        queue.add(actor);  // добавляем актера в очередь
        System.out.println(actor.getName() + " is taking a market");
    }

    @Override
    public void takeOrders() {
        System.out.println("Taking orders from queue: " + queue);
    }

    @Override
    public void giveOrders() {
        System.out.println("Giving orders to queue: " + queue);
    }

    @Override
    public void releaseFromQueue() {
        if (!queue.isEmpty()) {
            Actor actor = queue.remove(0);
            System.out.println(actor.getName() + " is released from queue");
        } else {
            System.out.println("Queue is empty");
        }
    }
}