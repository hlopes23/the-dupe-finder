import java.util.*;

public class DupeFinder {

    private ArrayList<Fruit> fruitList;

    public DupeFinder(ArrayList<Fruit> fruitList) {
        this.fruitList = fruitList;
    }


    public int checkDupes() {
        HashSet<Fruit> dupeFruit = new HashSet<>(fruitList);
        int numberOfDupes = fruitList.size() - dupeFruit.size();
        return numberOfDupes;
    }


    public List<Fruit> getDupes() {
        List<Fruit> duplicated = new ArrayList<>();
        HashSet<Fruit> dupeFruit = new HashSet<>(fruitList);
        for (Fruit fruit : dupeFruit) {
            if (Collections.frequency(fruitList, fruit) > 1) {
                duplicated.add(fruit);
            }
        }
        return duplicated;
    }


    public List<Fruit> sortedDupes() {
        List<Fruit> sorted = getDupes();
        Collections.sort(sorted);
        return sorted;
    }
}