import java.util.*;
public class Main {
    public static void main(String[] args) {
        Queue <Person> queue = new ArrayDeque<>();
        for (Person e: generateClient()) {
            queue.offer(e);
        }
        System.out.println("The carousel has started!");
        while (!queue.isEmpty()){
            if (queue.peek().getTicket() > 0){
                System.out.println((queue.peek()) + " took a ride!");
                queue.peek().setTicket(queue.peek().getTicket()-1);
                queue.offer(queue.poll());
            }
            else {
                System.out.println(queue.poll()+ " tickets are out!");
            }
        }
        System.out.println("Everyone has run out of tickets!");
    }

    public static List<Person> generateClient() {
        LinkedList<Person> list = new LinkedList<>();
        list.add(new Person("Vasya", " Pupkin", 5));
        list.add(new Person("Denis", "Lipatov", 2));
        list.add(new Person("Maxik", "Zharkov", 7));
        list.add(new Person("Dimasik", "Soldiers", 4));
        list.add(new Person("Egorka", " Ilyin", 3));
        return list;
    }
}