package PriorityQueueEx;

import java.util.PriorityQueue;

public class ZommTesterByPriorityQueue {
	public static void main(String[] args) {
		PriorityQueue<Zoom> zooomObj=new PriorityQueue(new SortByName()); //PriorityQueue<Zoom> zooomObj=new PriorityQueue(new SortByMeetid());
		zooomObj.add(new Zoom(10010020,"Vinayak",345678));
		zooomObj.add(new Zoom(10010023,"Sharath",345675));
		zooomObj.add(new Zoom(10020034,"Nikhil",234654));
		System.out.println(zooomObj);
	}

}
