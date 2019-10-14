import java.util.*;

public class Json {
    public static void main(String[] args) {	

    	//1. Написать метод, который меняет два элемента массива местами.(массив может быть любого ссылочного типа);
    	String list[] = new String[]{"Папа","Мама","дочь","сын","Бабушка","Дедушка"};
    	for(int i = 0; i < list.length; i++){
    		System.out.println(list[i]);
    	}
    	System.out.println("----------------");

    	for(int i = 0; i < list.length; i++){
    		if(i%2 == 0){
    			String a = list[i];
                list[i] = list[i + 1];
                list[i + 1] = a;
    		}
    		System.out.println(list[i]);
    	}

    	System.out.println("///////////////////////////////////////////");

	    2. Написать метод, который преобразует массив в ArrayList;

	    ChangeToArrayList chal = new ChangeToArrayList();
	    System.out.println(chal.changetoarraylist(chal.number));



    	/*3. Большая задача:
		a. Есть классы Fruit -> Apple, Orange;(больше фруктов не надо)
		b. Класс Box в который можно складывать фрукты, коробки условно сортируются по типу фрукта, поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
		c. Для хранения фруктов внутри коробки можете использовать ArrayList;
		d. Сделать метод getWeight() который высчитывает вес коробки, зная количество фруктов и вес одного фрукта(вес яблока - 1.0f, апельсина - 1.5f, не важно в каких это единицах);
		e. Внутри класса коробка сделать метод compare, который позволяет сравнить текущую коробку с той, которую подадут в compare в качестве параметра, true - если их веса равны, false 
		в противном случае(коробки с яблоками мы можем сравнивать с коробками с апельсинами);
		f. Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую коробку(помним про сортировку фруктов, нельзя яблоки высыпать в коробку с апельсинами), 
		соответственно в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в этой коробке;
		g. Не забываем про метод добавления фрукта в коробку.*/



		Apple apple = new Apple();
		Orange orange = new Orange();
		Box<Apple> boxApple = new Box<Apple>();
        Box<Orange> boxOrange = new Box<Orange>();

        boxApple.addFruit(apple);
        boxApple.addFruit(apple);
        boxApple.addFruit(apple);
        boxApple.addFruit(apple);

        boxOrange.addFruit(orange);
        boxOrange.addFruit(orange);
        boxOrange.addFruit(orange);
        boxOrange.addFruit(orange);

        System.out.println(boxOrange.getWeight(orange));
        System.out.println(boxApple.getWeight(apple));

        System.out.println(boxOrange.compare(apple,orange));
        System.out.println(boxApple.compare(apple,orange));

        System.out.println(boxOrange.compare(boxApple));
        System.out.println(boxApple.compare(boxOrange));



    }
} 

class ChangeToArrayList{
	int[] number = {5,10,23,45,89,100,73,59,61,25,75};
	ArrayList<Integer> numberlist = new ArrayList<>();
	ArrayList<Integer> changetoarraylist(int[] number){
		for(int i = 0; i < number.length; i++){
			numberlist.add(number[i]);
		}
      	return numberlist;
	}
}


class Apple extends Fruit{
	public Apple(){
		this.weight = 1;
	}
}

class Orange extends Fruit{
	public Orange(){
		this.weight = 2;
	}	
}

class Fruit{
	int weight;
}

class Box<Object>{
    private boolean isEmpty = true;
    private boolean isFull = true;
    int maxWeight = 25;
    int addedWeight = 0;
    ArrayList<Object> boxFruit = new ArrayList<Object>();
 	

    void addFruit(Object fruit) {
        
        if (addedWeight + 1 <= maxWeight) {
        	boxFruit.add(fruit);
    		addedWeight++;
        	System.out.println("Добавлен фрукт");
        	isEmpty = false;
        }else{
            System.out.println("Коробка полна Sir");
            isEmpty = false;
            isFull = true;
        }
    }

    //Считаем вес коробки
 
    int getWeight(Fruit f) {
        return boxFruit.size() * f.weight;
    }
 
    boolean compare(Fruit f1, Fruit f2) {
        if (getWeight(f1) == getWeight(f2)) {
            return true;
        } else{ 
        	return false;
    	}
    }
 
    boolean compare(Box box) {
        if (addedWeight == box.addedWeight){
            return true;
        }else{
        	return false;
    	}
    }
}
