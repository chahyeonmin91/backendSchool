package study.practice;

public class GenericMethod {
    public static <T> void printArrayElements(T[] array) {
        for (T elememt : array) {
            System.out.print(elememt +" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        String[] stringArray = {"one", "two", "three", "four", "five"};
        printArrayElements(intArray);
        printArrayElements(stringArray);
    }
}