package kg.skureganov;

import java.util.ArrayList;

public class les1<T> {
    private T[] array;

    public les1(T[] array) {
        this.array = array;
    }

    public String showArray() {
        StringBuilder sb = new StringBuilder();
        for (T item : array){
            sb.append(item+" ");
        }
        return sb.toString();
    }

    public void changeArrayElements(int element1, int element2){
        T temp = array[element1];
        array[element1] = array[element2];
        array[element2] = temp;
    }

    public ArrayList<T> convertArrayToArrayList(){
        ArrayList<T> list = new ArrayList<>();
        for (T item : array){
            list.add(item);
        }
        return list;
    }
}
