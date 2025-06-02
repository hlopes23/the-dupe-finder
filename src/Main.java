import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ArrayList<Fruit> list1 = new ArrayList<>();

        list1.add(new Apple("green", 7));
        list1.add(new Apple("green", 7));
        list1.add(new Apple("red", 4));
        list1.add(new Apple("yellow", 3));
        list1.add(new Orange(9));
        list1.add(new Orange(9));
        list1.add(new Orange(10));

        DupeFinder finder = new DupeFinder(list1);

        System.out.println(finder.checkDupes());

        List<Fruit> sorted = finder.sortedDupes();
        for (Fruit fruit : sorted){
            System.out.println(fruit);
        }
    }
}