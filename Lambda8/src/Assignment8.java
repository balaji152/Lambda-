import java.util.*;
import java.util.function.Consumer;


public class Assignment8 {
    public static void main(String[] args) {
        ArrayList <Integer> j = new ArrayList<>(Arrays.asList(87,65,74,89,34,48,54,66));
        Consumer <ArrayList<Integer>> i = (k) -> System.out.println(k);
        i.accept(j);
        new Thread(() -> i.accept(j)).start(); 
    }
}