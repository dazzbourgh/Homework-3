/**
 * Created by Leonid on 18.07.2016.
 */
public class Flowers {
    private static Flower[] bouquet = new Flower[5];
    public static int price = 0;

    public static void main(String[] args){
        for(int i = 0; i < 5; i++){
            switch ((int)(Math.random() * 10 / 3)){
                case 0:
                    bouquet[i] = new Rose();
                    break;
                case 1:
                    bouquet[i] = new Violet();
                    break;
                case 2:
                    bouquet[i] = new Tulip();
                    break;
                default:
                    bouquet[i] = new Rose();
                    break;
            }
            price += bouquet[i].getPrice();
            System.out.println(bouquet[i].name + " added to bouquet. Price is " + price);
        }
    }
}

class Flower{
    protected int price;
    protected String name;

    public int getPrice() {
        return price;
    }
}

class Rose extends Flower{
    Rose(){
        price = 10;
        name = "Rose";
    }
}

class Violet extends Flower{
    Violet(){
        price = 7;
        name = "Violet";
    }
}

class Tulip extends Flower{
    Tulip(){
        price = 5;
        name = "Tulip";
    }
}