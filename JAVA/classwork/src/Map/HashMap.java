package Map;

import java.nio.MappedByteBuffer;
import java.util.Map;

public class HashMap {
    public static void main(String[] args) {
        Map<String,Integer> cars = new java.util.HashMap<>();
        cars.put("Toyota",1);
        cars.put("BMW",2);
        cars.put("Audi",3);
        cars.putIfAbsent("Toyota",4);
        System.out.println(cars);
        for(String car : cars.keySet()){
            System.out.println(car);
        }
        for (Map.Entry car : cars.entrySet()){
            System.out.println(car);
        }
    }
}
