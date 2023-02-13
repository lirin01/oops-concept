package Collections;

import java.util.HashMap;
public class Hashmap {
    public static void main(String[] args) throws ArithmeticException {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "hari");
        hashMap.put(2, "jhon");
        hashMap.put(3, "kamal");
        for (int i : hashMap.keySet()) {
            System.out.println(hashMap.get(i));
        }
    }
}

