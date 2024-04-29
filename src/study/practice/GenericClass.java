package study.practice;


public class GenericClass {
    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<>("민차현", 22);
        String key = pair.getKey();
        Integer value = pair.getValue();
        System.out.println(key + value);
    }

}
