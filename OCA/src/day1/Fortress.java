package day1;

import java.util.ArrayList;

public class Fortress {
	private String name;
	private ArrayList<Integer> list;
	Fortress(){
		list=new ArrayList<Integer>();
	}
	String getName() {
		return name;
	}
	void addToList(int x) {
		list.add(x);
		
	}
	ArrayList getList() {
		return list;
	}
	
}
