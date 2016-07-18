/**
 * Created by Leonid on 18.07.2016.
 */
public class Lorry extends Car {
    double capacity;

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    @Override
    public void setBrand(String brand) {
        super.setBrand(brand);
    }
}
