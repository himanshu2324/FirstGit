import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapToList {

	 static public void  main(String[] args) {
		   Map<Integer, String> map = new HashMap<>();
	        map.put(1, "a");
	        map.put(2, "b");
	        map.put(3, "c");
	        map.put(4, "d");
	        map.put(5, "e");
	     int arr[]= {8,9,10};

	        List<Integer> keyList = new ArrayList<Integer>();
	        List<String> valueList = new ArrayList<String>(map.values());
	        Collections.addAll(keyList,8,9,10);

	        System.out.println("Key List: " + keyList);
	        System.out.println("Value List: " + valueList);
	        
	        
	        String[] geeks = {"Rahul", "Utkarsh", 
                    "Shubham", "Neelam"}; 

   List<String> al = new ArrayList<String>(); 

   // adding elements of array to arrayList. 
   Collections.addAll(al, geeks); 

   System.out.println(al); 
} 

	}

