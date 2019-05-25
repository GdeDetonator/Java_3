package kg.skureganov;

public class MainClass {
    public static void main(String[] args) {
        Integer[] arr = {1,2,3,5,4};
        les1<Integer> les1 = new les1<>(arr);
        les1.changeArrayElements(3, 4);
        System.out.println(les1.showArray());
        System.out.println(les1.convertArrayToArrayList());
    }


}
