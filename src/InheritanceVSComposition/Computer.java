package InheritanceVSComposition;

public class Computer {
    private String brand;
    private int ram;
    private Processor processor;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public Computer(String brand, int ram) {
        this.brand = brand;
        this.ram = ram;
    }

    public void print(String document){

    }

    public void someMethod(){

    }
}
