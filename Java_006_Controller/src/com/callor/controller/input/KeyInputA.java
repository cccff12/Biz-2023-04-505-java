package com.callor.controller.input;


/*
 * JDK는 많은 도구가 있는데 프로젝트를 만들떄 JDK의 도구를 모두
 * 포함하면 프로젝트 본연의 기능보다 JDK가 더 커지기 때문에 JAVA에서는
 * 가장 기본적으로 필요한 JDK도두만 프로젝트에 
 * 포함하고, 나머지 도구는 필요에
 * 따라 프로젝트에 import하여 포함할수 있도록 만들어졌다.
 * 
 * 이때 필요한 별도의 도구를 프로젝트에 포함하는 키워드가 import이다.
 */

import java.util.Scanner;

public class KeyInputA {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	}
}
