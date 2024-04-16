import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, ArrayList<Integer>> book = new HashMap<>();
        AddPhoneNum("Alex", 324435, book);
        AddPhoneNum("Alex", 00111, book);
        AddPhoneNum("Test_Name", 323244,book);
        AddPhoneNum("Test_name", 44444, book);
        print(book);
    }


    public static void AddPhoneNum(String key, int value, Map<String, ArrayList<Integer>> map) {
        if (map.containsKey(key)) {
            map.get(key).add(value);
        } else {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(value);
            map.put(key, list);
        }
    }


    public static void print(Map<String, ArrayList<Integer>> stringArrayListMap) {
        for (var item : stringArrayListMap.entrySet()) {
            String phones = " ";
            for (int item2 : item.getValue()) {
                phones = phones + item2 + ", ";
            }
            System.out.printf("%s: %s \n", item.getKey(), phones);
        }

    }


}