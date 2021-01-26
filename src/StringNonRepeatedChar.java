import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class StringNonRepeatedChar {
public static void main(String[] args) {
	String str=new String("aabbccfdd");
	Map<Character,Integer> counts = new LinkedHashMap<>(str.length());
	for (char c : str.toCharArray())
	{
		counts.put(c, counts.containsKey(c) ? counts.get(c) + 1 : 1); 
	}
	

	
	for (Entry<Character,Integer> entry : counts.entrySet()) {
		if (entry.getValue() == 1) { 
			System.out.println((entry.getKey()));
			
		}


		} 	

}}
 

	

