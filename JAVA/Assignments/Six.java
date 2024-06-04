package StreamWork;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Six {
    public static void main(String[] args) {
        HashMap<String,Integer> details = new HashMap<>();
        details.put("Akshit",22);
        details.put("Adarsh",23);
        details.put("Akshat",24);
        details.put("Daksh",25);
        details.put("Shahu",26);
        details.entrySet().stream().max(Comparator.comparingInt(Map.Entry::getValue)).ifPresent(entry -> System.out.println("Max age: "+ entry.getKey()+" "+ entry.getValue()));
        details.entrySet().stream().min(Comparator.comparingInt(Map.Entry::getValue)).ifPresent(entry -> System.out.println("Min age: "+ entry.getKey()+" "+ entry.getValue()));
    }
}
