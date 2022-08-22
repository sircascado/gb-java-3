package lesson1;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        // 1
        GenericsHomework<Integer> genericsHomework =
                new GenericsHomework<>(new Integer[]{1, 2, 3, 4});
        genericsHomework.swapTwoElements(1, 3);

        System.out.println("");

        GenericsHomework<String> genericsHomework1 =
                new GenericsHomework<>(new String[]{"one", "two", "three", "four"});

        genericsHomework1.swapTwoElements(0, 3);

        // 2
        GenericsHomework<Integer> genericsHomework2 =
                new GenericsHomework<>(new Integer[]{43, 12, 54, 16, 91});
        System.out.println(genericsHomework2.arrayToArrayList().getClass());

        // 3

        Box<Apple> appleBox = new Box<>(new Apple());
        appleBox.putFruitInTheBox(new Apple());
        appleBox.putFruitInTheBox(new Apple());
        appleBox.putFruitInTheBox(new Apple());

        Box<Orange> orangeBox = new Box<>(new Orange());
        orangeBox.putFruitInTheBox(new Orange());
        orangeBox.putFruitInTheBox(new Orange());

        System.out.println(appleBox.getBoxWeight());
        System.out.println(orangeBox.getBoxWeight());

        System.out.println(appleBox.compare(appleBox, orangeBox));

        orangeBox.putFruitsToAnotherBox();

    }
}
