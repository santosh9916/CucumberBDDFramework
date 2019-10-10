package JAVA_CODE;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Occurance_Of_Character_Array {
	
	public static void m1() {
		String str="concentration";
		Map<Character, Integer> countMap = new HashMap<Character, Integer>();
		char[] input = str.toCharArray();
	for(char c:input)
		if(countMap.containsKey(c)) {
				countMap.put(c, countMap.get(c)+1);
		}else {
			countMap.put(c, 1);
		}
		for (Entry<Character, Integer> val : countMap.entrySet()) {
			System.out.println(val.getKey() + " occurs " + val.getValue() + " time(s)");
		}
	}
	public static void main(String[] args) {
		Occurance_Of_Character_Array.m1();
	}

}
