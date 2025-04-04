package Utilities;

import java.util.HashMap;
import java.util.Map;

public class TestContent {
   private Map<String,Object> current;
    public TestContent() {
    	current = new HashMap<>();
    }
    public void set(String key,Object value) {
    	current.put(key,value);
    }
    public Object get(String key) {
    	return current.get(key);
    }
}
