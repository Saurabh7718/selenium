package Z_A_P_12_testng;
import java.util.*;

public class X_02_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="aaabbc";
		Map<Character, Integer> map=new HashMap<Character,Integer>();
		
		char[] ch=str.toCharArray();
		
		for(char c:ch) {
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
				
				//System.out.println(map.get(c));
			}
			else {
				map.put(c, 1);
				//System.out.println(map.get(c));
			}
		}
		
		
		for(Map.Entry<Character, Integer> m:map.entrySet()) {
			System.out.print(m.getKey());
			System.out.print(m.getValue());
		}

	}

}
