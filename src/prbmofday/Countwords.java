package prbmofday;

import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Countwords {

	public static void main(String[] args) 
	{
		String str = "hellofriends";

		LinkedHashMap<Character,Integer> map = new LinkedHashMap<>();

		for(int i=0; i<str.length();i++)
		{
			char ch = str.charAt(i);

			if(!map.containsKey(ch))
			{
				map.put(ch, 1);
			}

			else
			{
				Integer count = map.get(ch);
				count++;

				map.put(ch, count);
			}
			
			
		}

		System.out.println(map.entrySet());
		
	}

}
