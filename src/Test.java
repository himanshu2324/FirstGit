import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.apache.commons.codec.digest.HmacAlgorithms;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test {
	
public static <V> void main(String[] args) {
String s1[]= {"my","name","is","abc","abc"}	;

HashMap<String,Integer> hm=new HashMap<String,Integer>();

for(String str:s1) {
	if(hm.containsKey(str)) {
		int count=hm.get(str);
		hm.put(str, count+1);
	}
	else {
		hm.put(str, 1);
		
	}

}	System.out.println(hm.entrySet());





HashMap<Integer, String> hk=new HashMap<Integer, String>();
hk.put(1, "value1");
hk.put(2, "value2");

String s11="Himanshu";
String s12="ushmaniH";
char arr[]=s11.toCharArray();
char arr1[]=s12.toCharArray();
int flag=0;
Arrays.sort(arr);
Arrays.sort(arr1);
for(int i=0;i<=arr.length-1;i++) {
	if(arr[i]==arr1[i]) {
		 flag=1;
	}
	else
		flag=0;

}

if(flag==0) {
	System.out.println("NO");
}
else System.out.println("Yes");


/*Iterator<Entry<String, String>> itr=hk.entrySet().iterator();
while(itr.hasNext()) {
	Entry<String,String> str1=itr.next();
	System.out.println(str1.getKey()+','+str1.getValue());
	
	
}
for(Map.Entry<String, String> entry:hm.entrySet()) {
	System.out.println(entry.getKey()+" "+entry.getValue());
}
*/
	
}















}
