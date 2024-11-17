import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class InsertDeleteGetRandom {
    public static void main(String[] args) {
        RandomizedSet obj = new RandomizedSet();
        boolean b = obj.insert(1);

    }
}

class RandomizedSet {

    List<Integer> set = new ArrayList<>();

    public RandomizedSet() {

    }

    public boolean insert(int val) {
        if (set.contains(val)) {
            return false;
        }
        return set.add(val);
    }

    public boolean remove(int val) {
        if (set.contains(val)) {
            set.remove(val);
            return true;
        }
        return false;
    }

    public int getRandom() {
        Random r = new Random();
        return set.get(r.nextInt());
    }
}
