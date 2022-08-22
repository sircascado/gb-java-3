package lesson1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class GenericsHomework <T> {

    private T[] array;

    public GenericsHomework(T[] array){
        this.array = array;
    }

    public T[] swapTwoElements(int firstElement, int secondElement) {
        System.out.println("Before swap: " + Arrays.deepToString(array));
        Collections.swap(Arrays.asList(array), firstElement, secondElement);
        System.out.println("After swap: " + Arrays.deepToString(array));
        return array;
    }

    public ArrayList<T> arrayToArrayList(){
        ArrayList<T> arrayList = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            arrayList.add(array[i]);
        }
        return arrayList;
    }

}
