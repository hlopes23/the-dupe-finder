import java.util.Objects;

public class Apple extends Fruit{

    private String color;


public Apple (String color, int acidity){
    super(acidity);
    this.color = color;
}


    @Override
    public boolean equals(Object o) {

        if (!(o instanceof Apple))
            return false;
        if (this.getAcidity() == ((Fruit) o).getAcidity() && this.color.equals(((Apple) o).color))
            return true;
        return false;

    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), color);
    }


    @Override
    public int compareTo(Fruit o) {
        return 0;
    }

    @Override
    public String toString() {
        return color + " apple";
    }
}