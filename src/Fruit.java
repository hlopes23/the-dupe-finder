import java.util.List;
import java.util.Objects;

public abstract class Fruit implements Comparable<Fruit> {

    private int acidity;


    public Fruit(int acidity) {
        this.acidity = acidity;
    }

    public void setAcidity(int acidity) {
        this.acidity = acidity;
    }


    @Override
    public int hashCode() {
        return Objects.hashCode(acidity);
    }

    public int compareTo(Fruit fruit){
        return fruit.getAcidity() - this.acidity;
    }


    public int getAcidity() {
        return acidity;
    }
}