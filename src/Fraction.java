/**
 * Created by Leonid on 16.07.2016.
 */
public class Fraction {

    private int числитель;
    private int знаменатель;

    public int getЧислитель() {
        return числитель;
    }

    public int getЗнаменатель() {
        return знаменатель;
    }

    public void setЧислитель(int числитель) {

        this.числитель = числитель;
    }

    public void setЗнаменатель(int знаменатель) {
        this.знаменатель = знаменатель;
    }

    public Fraction(int числитель, int знаменатель){
        this.числитель = числитель;
        this.знаменатель = знаменатель;
    }
    public void print(){
        System.out.println(числитель + " / " + знаменатель);
    }
    public Fraction add(Fraction fraction){
        return new Fraction(числитель + fraction.getЧислитель(), знаменатель + fraction.getЗнаменатель());
    }
    public Fraction multiply(double number){
        return new Fraction((int)(числитель * number), знаменатель);
    }
    public Fraction divide(double number) throws NullPointerException{
        if (number == 0)
            throw new NullPointerException("Division by zero");
        return new Fraction((int)(числитель / number), знаменатель);
    }
}
