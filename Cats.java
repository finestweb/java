class Cat {
    private int appetite;
    private String name;
    private boolean fullness;

    public Cat(int appetite, String name, boolean fullness) {
        this.appetite = appetite;
        this.name = name;
    }

    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean getFullness() {
        return fullness;
    }

    public void setFullness(boolean fullness) {
        this.fullness = fullness;
    }

    public void infoCat() {
        System.out.println("Cat is name " + name + " and appetite is " + appetite);
    }

    public void eat(Plate p) {
        p.decreaseFood(appetite, fullness);
    }
}

class Plate {
    private int food;
    private int shop;

    public Plate(int food, int shop) {
        this.food = food;
        this.shop = shop;
    }

    public void decreaseFood(int n, boolean ful) {
        if(n >= addFood()){
            System.out.println("In a bowl of food is not enough to feed the cat. The cat fed - "  + ful);
        }else if(n == (addFood()) / 2){
            System.out.println("The cat can not even feed half. The cat fed - "  + ful);
        }else if(food == 0){
            System.out.println("Empty plate, no food. The cat fed - "  + ful);
        }else if(n == 0){
            ful = true;
            System.out.println("Cat does not want to eat, he is full. The cat fed - "  + ful);
        }else{
            ful = true;
            food -= n;
            System.out.println("Cat is full. The cat fed - " + ful);
        }
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public int getShop() {
        return shop;
    }

    public void setShop(int shop) {
        this.shop = shop;
    }

    public void info() {
        System.out.println(food);
    }

    public int addFood(){
        food = food + shop;
        return food;
    }
}

public class Cats {
    public static void main(String[] args) {

        Plate plate = new Plate(100, 10); // food, shop

        Cat[] cats = new Cat[4];

        cats[0] = new Cat(500, "Borka", false);
        cats[1] = new Cat(150, "Vaska", false);
        cats[2] = new Cat(0, "Simka", false);
        cats[3] = new Cat(90, "Cherniy", false);

        for(int i = 0; i < cats.length; i++){
            Cat cat = cats[i];
            cat.infoCat();
            cat.eat(plate);
            System.out.println("--------------------------------------------------");
        }


    }
}
