package cognizant;
import java.util.Map;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.TreeMap;

public class MapDemo {
public static void main(String[] args) {
	TreeMap<String, String> map= new TreeMap<>();
	map.put("Banana", "35");
	map.put("Orange", "60");
	map.put("Mango", "110");
	map.put("Grapes", "200");
	map.put("Water Melon", "20");
	
	
	for(Entry<String, String> entry : map.entrySet())
	{
		System.out.println(entry.getKey() + "  " + entry.getValue());
	}
	
}
}
