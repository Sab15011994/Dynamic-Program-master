import java.util.HashMap;
import java.util.Map;

public class Cache {

    private Map<Integer, Integer> values = new HashMap<>();
    private Map<Integer, Integer> frequencies = new HashMap<>();
    private final int MAX;

    public Cache(int capacity) {
        MAX = capacity;
    }

    public int get(int key) {
        if (!values.containsKey(key)) {
            return -1;
        }
        frequencies.put(key, frequencies.get(key) + 1); 
        return values.get(key);
    }

    public void set(int key, int value) {
        if (!values.containsKey(key)) { 
            
            values.put(key, value);
            frequencies.put(key, 1); 
        }
    }
}