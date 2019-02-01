import java.util.HashMap;
import java.util.Map;

public class Cache {

	Map<Integer, Integer> values = new HashMap<>();
    Map<Integer, Integer> frequency = new HashMap<>();
   private final int MAX;

   public Cache(int capacity) {
       MAX = capacity;
   }

   public int get(int key) {
       if (!values.containsKey(key)) {
           return -1;
       }
       frequency.put(key, frequency.get(key) + 1); 
       return values.get(key);
   }

   public void set(int key, int value) {
       if (!values.containsKey(key)) { 
           
           values.put(key, value);
           frequency.put(key, 1);
       }
   }
}
