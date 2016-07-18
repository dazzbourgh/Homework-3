/**
 * Created by Leonid on 18.07.2016.
 */
public class Student extends Man {
    private int year;

    public void increaseYear(int year){
        this.year += year;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {

        this.year = year;
    }
}
