package javapgms;

import java.util.HashMap;

public class FindNumOfChar {

	public static void main(String[] args) {

		String s="santosh";
		char[] cs = s.toCharArray();
		HashMap<Character,Integer> map = new HashMap<Character,Integer>();
		for(Character c:cs)
		{
			Integer v = map.get(c);
			map.put(c, (v==null?1:v+1));
		}
		System.out.println(map);
	}

}
