package com.callor.classes.exec;

import java.util.ArrayList;
import java.util.List;

public class NumbersD {
	public static void main(String[] args) {

		List<Integer> numList = new ArrayList();

		for (int i = 0; i < numList.size(); i++) {
			numList.add(i + 1);
		}

		for (int i = 0; i < 1000; i++) {
			int ran1 =(int)(Math.random()*numList.size());
			int ran2 =(int)(Math.random()*numList.size());
		int temp= numList.get(ran1);
	numList.set(ran1, numList.get(ran2));
	numList.set(ran2, temp);
		
		}
			
		}

	}

