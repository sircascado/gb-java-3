package lesson1;

import java.util.ArrayList;

public class Box <T> {

    private ArrayList<T> fruitsBox;
    private ArrayList<T> anotherFruitsBox;
    private T fruit;
    private float fruitWeight;

    public Box(T fruit){
        this.fruit = fruit;
        fruitsBox = new ArrayList<>();
        anotherFruitsBox = new ArrayList<>();
        setFruitWeight();
    }

    public void putFruitInTheBox(T fruit){
        fruitsBox.add(fruit);
    }

    public float getBoxWeight(){
        return fruitsBox.size() * getFruitWeight();
    }

    @SuppressWarnings("rawtypes")
    public boolean compare(Box firstBox, Box secondBox){
        return firstBox.getBoxWeight() == secondBox.getBoxWeight();
    }

    public void putFruitsToAnotherBox(){
        anotherFruitsBox.addAll(fruitsBox);
    }

    private float getFruitWeight() {
        return fruitWeight;
    }

    private void setFruitWeight(){
        if (fruit instanceof Apple){
            fruitWeight = new Apple().getWeight();
        } else if (fruit instanceof Orange){
            fruitWeight = new Orange().getWeight();
        }
    }

    public Object[] getFruitsBox() {
        return fruitsBox.toArray();
    }

    public ArrayList<T> getAnotherFruitsBox() {
        return anotherFruitsBox;
    }
}
