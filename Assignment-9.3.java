//Create an application having a Generic HashMap with Empcode as key and EmpName as value.
import java.util.*;

public class hashMap {
	
	public static void main(String[] args){
		
		//Empcode as key(integer) and EmpName as value(String)
		HashMap<Integer,String>hm = new HashMap<Integer,String>();
		hm.put(202011, "abcd");
		hm.put(212111, "xyz");
		
		for(Map.Entry m: hm.entrySet()){
			
			//Displays only EmpNames as output
			System.out.println(m.getValue());
		}
	}

}
