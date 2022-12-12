import java.util.*;

public class Main {
    private static final List<Integer> nums = new ArrayList<>(List.of(10, 10, 2, 3, 4, 4, 52, 55, 26, 7));
    private static final List<String> words = new ArrayList<>(List.of("ёжик", "суфле", "зебра", "шлакоблокунь", "суфле", "крокодил",
            "дракон", "крокодил", "суфле", "шлакоблокунь", "тудак", "судак"));

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }
    public static void task1() {
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) % 2 != 0) {
                System.out.println(nums.get(i));
            }
        }
        System.out.println();
    }
    public static void task2() {
        //Задание 2
        Set<Integer> numsSet = new TreeSet<>(nums);
        for (Integer num : numsSet) {
            if (num % 2 == 0) {
                System.out.println(num);
            }
        }
        System.out.println();
    }
    private static void task3() {
        Set<String> uniqueWords = new HashSet<>(words);
        System.out.println(uniqueWords);
        System.out.println();
    }
    private static void task4() {
        Map<String, Integer> allWords = new HashMap<>();
        for (int i = 0; i < words.size(); i++) {
            allWords.put(words.get(i), Collections.frequency(words, words.get(i)));
        }
        System.out.println(allWords);
    }
}