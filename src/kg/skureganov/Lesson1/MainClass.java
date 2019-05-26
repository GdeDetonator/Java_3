package kg.skureganov.Lesson1;

public class MainClass {
    public static void main(String[] args) {

        textLastEx();

        //exTest();
    }

    private static void textLastEx() {
        Box<Fruit> box1 = new Box<>();
        Box<Fruit> box2 = new Box<>();

        box1.add(new Orange());
        box1.add(new Orange());
        box1.add(new Apple());
        System.out.println(box1.getWeight());
        box1.sendFruits(box2);
        System.out.println(box1.getWeight());
        System.out.println(box2.getWeight());
        System.out.println(box2.add(new Orange()));
        System.out.println(box2.getWeight());
    }

    private static void exTest() {
        Integer[] arr = {1,2,3,5,4};
        les1<Integer> les1 = new les1<>(arr);
        les1.changeArrayElements(3, 4);
        System.out.println(les1.showArray());
        System.out.println(les1.convertArrayToArrayList());
    }


}
