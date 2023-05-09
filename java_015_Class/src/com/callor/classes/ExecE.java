package com.callor.classes;

import java.util.ArrayList;
import java.util.List;

public class ExecE {
public static void main(String[] args) {
	
AnimalDto anidto= new AnimalDto();
	List<AnimalDto> list= new ArrayList();
	
	
	anidto= new AnimalDto("럭키","허스키","5세");
	list.add(anidto);
	anidto= new AnimalDto("나비","버밀라","3세");
	list.add(anidto);
	anidto= new AnimalDto("몽","스피츠","7세");
	list.add(anidto);
	System.out.print(list.toString());
	
}
}
