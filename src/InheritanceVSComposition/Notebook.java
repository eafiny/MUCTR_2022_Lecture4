package InheritanceVSComposition;

public class Notebook extends Computer{
    private int weight;

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Notebook(String brand, int ram) {
        super(brand, ram);
    }

    @Override
    public void someMethod() {
        super.someMethod();
        ///.....
    }

    public static void main(String[] args) {
        Computer notebook = new Notebook("Asus", 2000);
    }
}
