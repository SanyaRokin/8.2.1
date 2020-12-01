class Main {
public static void main(String[] args) {
    final Restaurant restaurant = new Restaurant();
    new Thread(null, restaurant::newOrder, "Поcетитель 1").start();
    new Thread(null, restaurant::newOrder, "Поcетитель 2").start();
    new Thread(null, restaurant::newOrder, "Поcетитель 3").start();
    new Thread(null, restaurant::newOrder, "Поcетитель 4").start();
    new Thread(null, restaurant::newOrder, "Поcетитель 5").start();
    }
}
