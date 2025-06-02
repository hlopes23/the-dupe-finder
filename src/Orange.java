public class Orange extends Fruit{


    public Orange(int acidity) {
        super(acidity);
    }


    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Orange)){
            return false;
        }
        if (this.getAcidity() == ((Fruit) o).getAcidity()){
           return true;
        }
        return false;
    }



    @Override
    public int compareTo(Fruit o) {
        return 0;
    }

    @Override
    public String toString() {
        return "Orange";
    }
}
