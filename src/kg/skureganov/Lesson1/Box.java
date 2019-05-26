package kg.skureganov.Lesson1;

import java.util.ArrayList;

public class Box<T extends Fruit> {
    private ArrayList<T> list = new ArrayList<>();
    private int size = 0;

    public boolean add(T item){
        if (size == 0){
            list.add(item);
            size++;
        }else if (item.getClass().getName().equals(list.get(0).getClass().getName())){
            list.add(item);
            size++;
        }else {
            //Some action.
            return false;

        }
        return true;
    }

    public float getWeight(){
        if (size == 0) return 0;
        return size * list.get(0).weight();
    }

    public boolean compare (Box box){
        return getWeight() == box.getWeight();
    }

    public boolean sendFruits(Box box){
        for (T item : list){
            box.add(item);
        }
        size = 0;
        return true;
    }
}
