package box;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> {
    private List<T> fruitList;

    private double getWeight;

    public Box() {
        this.fruitList = new ArrayList<>();
    }
    private List<T> fruitList() {
        return fruitList;
    }
    public void addFruit(T fruit) {
        fruitList.add(fruit);
    }


    public double getWeight() {
        if (fruitList.isEmpty()) {
            return 0;
        } else {
            return fruitList.size() * fruitList.get(0).getWeight();
        }
    }

    public boolean compare(Box<? extends Fruit> box) {
        if (this.getWeight() == box.getWeight) {
            System.out.println("Веса коробок равны");
            return true;
        } else {
            System.out.println("Веса коробок отличаются");
            return false;
        }
    }

    public  void moveToBox(Box<T> box) {
        for (int i = 0; i <fruitList.size(); i++){
            box.addFruit(fruitList.get(i));
        }
        fruitList.clear();
    }


}
