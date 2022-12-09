package javapgms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SearchElements {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("sant");
		list.add("prak");
		list.add("vir");
		list.add("sac");
		Collections.sort(list);
		//after sorting it shows the index position of searched element
		//if it avilabel then only show otherwise -1 value shows
		System.out.println(Collections.binarySearch(list,"sa"));

	}

}
