package PriorityQueueEx;

import java.util.Collections;
import java.util.PriorityQueue;

public class ZoomTester {
	public static void main(String[] args) {
		PriorityQueue<Zoom> zooomObj=new PriorityQueue(); //PriorityQueue<Zoom> zooomObj=new PriorityQueue(new SortByMeetid());
		zooomObj.add(new Zoom(10010020,"Vinayak",345678));
		zooomObj.add(new Zoom(10010023,"Sharath",345675));
		zooomObj.add(new Zoom(10020034,"Nikhil",234654));
		System.out.println(zooomObj);
//		Collections.sort(zooomObj);
	}

}
