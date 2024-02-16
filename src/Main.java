
public class Main {
    public static void main(String[] args) {

        // 1 TASK
        System.out.println("---------------------------");
        System.out.println(Calculator.sum(1.0, 2));
        System.out.println(Calculator.divide(11.0, 2));
        System.out.println(Calculator.subtract(11, 2.5));
        System.out.println(Calculator.multiply(12, 2.0));
        System.out.println(Calculator.sum(133, 50f));
        System.out.println(Calculator.subtract(6, 7.89));
        System.out.println(Calculator.multiply(-123.07, 4f));
        System.out.println(Calculator.divide(2, 9));

        System.out.println();


        // 2 TASK

        System.out.println("---------------------------");
        Cat cat1 = new Cat();
        Cat cat2 = new Cat("Pushistic", true);
        Cat cat3 = new Cat("Hamster", false);
        Cat cat4 = new Cat("Osiris", true);
        Animal animal1 = new Animal();
        Animal animal2 = new Animal("Worm", false);

        Cat[] catArray = new Cat[3];
        catArray[0] = cat1;
        catArray[1] = cat2;
        catArray[2] = cat3;
        Animal[] animalArray = new Animal[3];
        animalArray[0] = cat1;
        animalArray[1] = cat2;
        animalArray[2] = cat3;

        Integer[] intArray = new Integer[] {1, 2, 3};
        Double[] doubleArray = new Double[] {1.0, 3.0, 3.0};

        System.out.println(MyArrays.compareArrays(catArray, animalArray));
        System.out.println(MyArrays.compareArrays(intArray, doubleArray));

        animalArray[1] = animal2;
        System.out.println(MyArrays.compareArrays(catArray, animalArray));
        System.out.println("---------------------------");
        System.out.println();

//    3 TASK

        Pair<String, Integer> pair1 = new Pair<>("one", 1);
        System.out.println(pair1);


        Pair<Float, Integer> pair2 = new Pair<>(2.0f, 1);
        System.out.println(pair2);
    }
}