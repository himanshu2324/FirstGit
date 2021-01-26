import java.util.HashMap;
import java.util.Map;

public class NoOfOccurances {

	public static void main(String[] args) {
String str="GeeksForGeeks";
char[] arr=str.toCharArray();


HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
for(char c:arr){
	if(hm.containsKey(c)) {
		int count=hm.get(c);
		hm.put(c, count+1);
	}
	else {
	hm.put(c, 1);}
}
System.out.println(hm.entrySet());
	}}
	
