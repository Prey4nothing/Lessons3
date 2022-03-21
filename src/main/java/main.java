import box.Apple;
import box.Box;
import box.Orange;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class main {
    public static void main(String[] args) {
        String[] arr = {"432", "234", "867", "124","351"};
        Integer[] arr2 = {5, 3, 4, 725, 3124, 564};
        swapArrayElements(arr, 0, 2);
        swapArrayElements(arr2,3,4);
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr));
        List <String> arrayList = new ArrayList<>();
        convertArray(arrayList,arr);
        System.out.println(arrayList);

        Box<Apple> appleBox = new Box<>();
        Box<Apple> appleBox1 = new Box<>();

        appleBox.addFruit(new Apple());
        appleBox.addFruit(new Apple());
        appleBox.addFruit(new Apple());

        Box<Orange> orangeBox = new Box<>();

        orangeBox.addFruit(new Orange());
        orangeBox.addFruit(new Orange());

        appleBox.compare(orangeBox);
        appleBox.moveToBox(appleBox1);

    }


    private static <T> void swapArrayElements(T[] array, int index1, int index2) {
        T temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static <E> void convertArray (List<E> arrayList , E[] array){
        Collections.addAll(arrayList,array);
    }
}

