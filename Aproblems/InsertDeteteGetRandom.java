import java.util.*;

public class InsertDeteteGetRandom {

    List<Integer> list;
    Map<Integer, Integer> map;

    public InsertDeteteGetRandom() {
        list = new ArrayList<>();
        map = new HashMap<>();
    }

    public boolean insert(int val) {
        if (map.containsKey(val)) {
            return false;
        }

        list.add(val);
        map.put(val, list.size() - 1);
        return true;
    }

    public boolean remove(int val) {
        if (!map.containsKey(val)) {
            return false;
        }

        int last = list.get(list.size() - 1);
        int index = map.get(val);

        list.set(index, last);
        map.put(last, index);
        list.remove(list.size() - 1);
        map.remove(val);
        return true;
    }

    public int getRandom() {
        Integer i = new Random().nextInt(list.size());
        return list.get(i);
    }

    public static void main(String[] args) {
        InsertDeteteGetRandom randomizedSet = new InsertDeteteGetRandom();
        System.out.println(randomizedSet.insert(1)); // true
        System.out.println(randomizedSet.remove(2)); // false
        System.out.println(randomizedSet.insert(2)); // true
        System.out.println(randomizedSet.getRandom()); // 1 or 2
        System.out.println(randomizedSet.remove(1)); // true
        System.out.println(randomizedSet.insert(3)); // false
        System.out.println(randomizedSet.insert(4)); // true
        System.out.println(randomizedSet.insert(5)); // true
        System.out.println(randomizedSet.insert(6)); // true
        System.out.println(randomizedSet.insert(7)); // true

        System.out.println(randomizedSet.getRandom()); // 2
    }

}