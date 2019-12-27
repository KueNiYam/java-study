package streamAPI;

import java.util.ArrayList;
import java.util.List;

public class streamAPI {
    public static List<String> createList() {
        List<String> names = new ArrayList<>();
        names.add("종로");
        names.add("강남");
        names.add("마포");

        return names;
    }

    public static void map() {
        List<String> names = createList();

        names.stream().map(t -> t.length()).forEach(System.out::println);
    }

    public static void filter() {
        List<String> names = createList();

        long n = names.stream().filter(t -> t.contains("j")).count();
        System.out.println(n);
    }

    public static void sorted() {
        List<String> names = createList();

        names.stream().sorted(String::compareTo).forEach(System.out::println);
    }

    public static void reduce() {
        List<String> names = createList();
        
        String sum = names.stream().reduce("", String::concat);
    }
}
